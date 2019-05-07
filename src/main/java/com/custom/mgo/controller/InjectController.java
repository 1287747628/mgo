package com.custom.mgo.controller;

import com.alibaba.fastjson.JSON;
import com.custom.mgo.constants.Constants;
import com.custom.mgo.constants.Constants.Inject;
import com.custom.mgo.dao.TaskDao;
import com.custom.mgo.model.Task;
import com.custom.mgo.vo.InjectReq;
import com.custom.mgo.vo.InjectResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class InjectController {

    private static final Logger logger = LoggerFactory.getLogger(InjectController.class);
    @Resource
    private TaskDao taskDao;

    @RequestMapping(method = RequestMethod.POST, path = "/v2/inject/delete", consumes = {"application/json"}, produces = {"application/json;charset=utf-8"})
    public String injectDelete(@RequestBody String reqJson) {
        try {
            long start = System.currentTimeMillis();
            InjectReq req = JSON.parseObject(reqJson, InjectReq.class);
            // 校验参数
//            if (StringUtils.isEmpty(req.getCpNo()) || StringUtils.isEmpty(req.getSignature()) || StringUtils.isEmpty(req.getSpNo()) ||
//                    req.getInstances() == null || req.getInstances().isEmpty() || StringUtils.isEmpty(req.getType())) {
//                return JSON.toJSONString(new InjectResp(Inject.ERROR_PARAMS_NULL.getCode(), Inject.ERROR_PARAMS_NULL.getDesc()));
//            }
            // 校验注入资源数量
            if (req.getInstances().size() > Constants.INJECT_MAX_NUM) {
                return JSON.toJSONString(new InjectResp(Inject.ERROR_INSTANCES_100.getCode(), Inject.ERROR_INSTANCES_100.getDesc()));
            }
            // 校验签名
//            if (!checkSignature(req)) {
//                return JSON.toJSONString(new InjectResp(Inject.ERROR_SIGNATURE.getCode(), Inject.ERROR_SIGNATURE.getDesc()));
//            }
            //
            req.setOprType(Constants.TASK_OPR_TYPE_DEL);
            List<Task> tasks = taskDao.findAll();
            //InjectResp resp = injectTaskService.saveTaskAndContent(req);
            logger.info("delete reqJson:[{}] cost time: {}ms", reqJson, (System.currentTimeMillis() - start));
            return JSON.toJSONString("");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return JSON.toJSONString(new InjectResp(Inject.ACTIVE_EXCEPTION.getCode(), Inject.ACTIVE_EXCEPTION.getDesc()));
    }

}
