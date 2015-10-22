package com.newthread.fims.evaluateManager.dao;

import com.newthread.fims.evaluateManager.bean.BaseDao;
import org.hibernate.SessionFactory;

/**
 * Created by MEX on 15/1/9.
 */
public class DailyReportDao extends BaseDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
