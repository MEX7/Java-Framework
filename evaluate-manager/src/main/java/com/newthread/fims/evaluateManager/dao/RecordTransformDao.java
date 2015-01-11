package com.newthread.fims.evaluateManager.dao;

import com.newthread.fims.evaluateManager.bean.BaseDao;
import com.newthread.fims.evaluateManager.data.*;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

/** 101到102转换
 * @author MEX
 * @since 2015.1.11
 */
public class RecordTransformDao extends BaseDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<TCheckoutRecordMetricMeta> getAllDistinctRecord() {
        List<TCheckoutRecordMetricMeta> tCheckoutRecordMetricMetas = new ArrayList<TCheckoutRecordMetricMeta>();

        return tCheckoutRecordMetricMetas;
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(company);
//        transaction.commit();
//        session.close();

    }

    public int getInspectionItemNumber(String planId) {
         return 0;
    }


}
