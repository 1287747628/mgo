package com.custom.mgo.constants;

public class Constants {

    public static final int STATUS_INIT = 0;
    public static final int STATUS_DEAL = 1;
    //
    public static final String TASK_OPR_TYPE_DEL = "delete";
    //
    public static final int INJECT_MAX_NUM = 100;

    public enum Inject {
        ACTIVE_EXCEPTION(-1, "active exception"),//接口调用异常
        ACTIVE_SUCCESS(0, "success"),//成功
        ACTIVE_FAILURE(1, "failure"),//失败
        ERROR_PARAMS_NULL(2, "params is null"),//参数不能为空
        ERROR_CPNO_NULL(3, "cpNo is null"),//用户名不能为空
        ERROR_SIGNATURE_NULL(4, "signature is null"),//用户签名不能为空
        ERROR_TYPE_NULL(5, "type is null"),//类型不能为空
        ERROR_INSTANCES_NULL(6, "instances is null"),//刷新的文件或目录列表不能为空
        ERROR_SIGNATURE(7, "signature error"),//用户签名不正确
        ERROR_INSTANCES_100(9, "instances more than 100"),//单次刷新不能超过100个URL
        ERROR_PUBLISH_URLS_50(10, "pre instances more than 50");//待预热的文件url不能超过50个

        private Integer code;
        private String desc;

        private Inject(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
}
