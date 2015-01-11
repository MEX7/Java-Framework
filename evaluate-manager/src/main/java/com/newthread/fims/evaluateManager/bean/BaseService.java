package com.newthread.fims.evaluateManager.bean;

import com.newthread.fims.evaluateManager.common.ApplicationContext;
import com.newthread.fims.evaluateManager.common.Constant;
import com.newthread.fims.evaluateManager.common.tools.JsonUtils;
import com.newthread.fims.evaluateManager.dao.MonthlyReportPartTwoDao;
import com.newthread.fims.evaluateManager.dao.DailyReportDao;
import com.newthread.fims.evaluateManager.dao.MonthlyReportPartOneDao;
import com.newthread.fims.evaluateManager.dao.RecordTransformDao;
import com.newthread.fims.evaluateManager.data.Result;
import com.newthread.fims.evaluateManager.service.DailyReportService;
import com.newthread.fims.evaluateManager.service.RecordTransformService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**service基类
 * Created by liyuan on 2015/1/2
 * Modify by MEX 2015/1/8
 */
public class BaseService implements IService{

    private Logger LOG = LogManager.getLogger();// 实例化打印Logger 日志类
    public Logger getLOG(){
        return LOG;
    }

    private BaseDao dao;
    public Result result=new Result();

    /**
     * =============================================================================================================================
     * 重写
     * =============================================================================================================================
     */

    /**
     * 每次新建的类需要在这里进行实际实例化
     * @param object
     * @return
     */
    public Object getDao(Object object){
        if (object instanceof RecordTransformService)   dao=(RecordTransformDao) getBean(RecordTransformDao.class);
        if (object instanceof DailyReportService)       dao=(DailyReportDao) getBean(DailyReportDao.class);
        if (object instanceof MonthlyReportPartOneDao)  dao=(MonthlyReportPartOneDao) getBean(MonthlyReportPartOneDao.class);
        if (object instanceof MonthlyReportPartTwoDao)  dao=(MonthlyReportPartTwoDao) getBean(MonthlyReportPartTwoDao.class);
        return dao;
    }

    /**
     * =============================================================================================================================
     * 通用的 function
     * =============================================================================================================================
     */
    public Object getData(String jsonStr,Class className){
         Object object=JsonUtils.getInstance().jsonTransformObject(jsonStr,className);
          return  object;
    }


    public String toJsonString(Object object) {
        String jsonStr= JsonUtils.getInstance().objecTransformJsonStr(object);
        if (jsonStr!=null){
            result.setCode(Constant.SUCCESS_CODE);
            result.setArray(object);
          return JsonUtils.getInstance().objecTransformJsonStr(result);
        }else{
          result.setCode(Constant.ERROR_CODE);
          result.setMessage("失败");
          result.setArray("");
          return JsonUtils.getInstance().objecTransformJsonStr(result);
        }
    }

    public Object getBean(Class className) {
        return ApplicationContext.getIntance().getBean(className);
    }

    /**
     * =============================================================================================================================
     * 对IService的实现
     * =============================================================================================================================
     */
    @Override
    public String recordTransform() {
        return null;
    }

    @Override
    public String getA102DailyReport() {
        return null;
    }

    @Override
    public String getA1031MonthlyReport() {
        return null;
    }

    @Override
    public String getA1081MonthlyReport() {
        return null;
    }

    @Override
    public String getA1091MonthlyReport() {
        return null;
    }
}
