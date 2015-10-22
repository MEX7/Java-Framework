package com.newthread.fims.evaluateManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by MEX on 2014/11/6.
 */
public class JettyStart {

	public static void main(String[] args) throws Exception {
        Logger LOG = LogManager.getLogger();
		LOG.info("Saver start user-manager");
		Server server = new Server(8087);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

//        context.addServlet(new ServletHolder(new EmailActivation()), "/emailActivation");

        server.start();
        server.join();
    }
}
