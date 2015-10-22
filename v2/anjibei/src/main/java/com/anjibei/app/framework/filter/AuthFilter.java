package com.anjibei.app.framework.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by hedingwei on 3/4/15.
 */
@WebFilter(filterName = "AuthFilter")
public class AuthFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        if (req.getRequestURI().endsWith("signin.jsp") || req.getRequestURI().endsWith("signin.do")) {
            System.out.println("Filter1 start");
            filterChain.doFilter(request, response);
            System.out.println("filter1 end");
            return;
        } else if (req.getRequestURI().endsWith("signup.jsp") || req.getRequestURI().endsWith("signup.do")) {

            System.out.println("Filter2 start");
            filterChain.doFilter(request, response);
            System.out.println("filter2 end");
            return;
        } else {
            Cookie[] cookies = req.getCookies();
            Cookie xauth = null;
            for (Cookie cookie : cookies) {
                if ("xauth".equals(cookie.getName())) {
                    xauth = cookie;
                }
                System.out.println(cookie.getPath() + "\t" + cookie.getDomain() + "\t" + cookie.getName() + "\t" + cookie.getValue());
            }
            filterChain.doFilter(request, response);
            if (xauth != null) {

            } else {

                resp.sendRedirect("signin.jsp");
            }

            return;
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
