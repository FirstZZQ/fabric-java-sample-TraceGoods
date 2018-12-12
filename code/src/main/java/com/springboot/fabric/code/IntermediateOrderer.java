package com.springboot.fabric.code;

/**
 * 描述：中继Orderer排序服务对象
 *
 */
class IntermediateOrderer {

    /** orderer 排序服务器的域名 */
    private String ordererName;
    /** orderer 排序服务器的访问地址 */
    private String ordererLocation;

    IntermediateOrderer(String ordererName, String ordererLocation) {
        super();
        this.ordererName = ordererName;
        this.ordererLocation = ordererLocation;
    }

    String getOrdererName() {
        return ordererName;
    }

    void setOrdererLocation(String ordererLocation) {
        this.ordererLocation = ordererLocation;
    }

    String getOrdererLocation() {
        return ordererLocation;
    }

}
