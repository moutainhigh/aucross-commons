/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-4
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-12-4
 * @description：TODO
 */

public class RefundableCallbackDTO extends BaseDTO {
private static final long serialVersionUID = 1L;
    
    /**
     * 订单号
     */
    private String tradeId;
    /**
     * 请求序列号(渠道编号)
     */
    private String requestSn;
    /**
     * 渠道流水
     */
    private String channelSn;
    /**
    * 支付银行行别                                     
    */
    private String bankType;
    /**
     * 支付系统接口类型
     */
    private String payOptType;
    /**
     * 渠道响应码
     */
    private String payStatus;
    
    /**
     * @return the payStatus
     */
    public String getPayStatus() {
        return payStatus;
    }
    /**
     * @param payStatus the payStatus to set
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    /**
     * @return the tradeId
     */
    public String getTradeId() {
        return tradeId;
    }
    /**
     * @param tradeId the tradeId to set
     */
    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }
    /**
     * @return the requestSn
     */
    public String getRequestSn() {
        return requestSn;
    }
    /**
     * @param requestSn the requestSn to set
     */
    public void setRequestSn(String requestSn) {
        this.requestSn = requestSn;
    }
    /**
     * @return the channelSn
     */
    public String getChannelSn() {
        return channelSn;
    }
    /**
     * @param channelSn the channelSn to set
     */
    public void setChannelSn(String channelSn) {
        this.channelSn = channelSn;
    }
    /**
     * @return the bankType
     */
    public String getBankType() {
        return bankType;
    }
    /**
     * @param bankType the bankType to set
     */
    public void setBankType(String bankType) {
        this.bankType = bankType;
    }
    /**
     * @return the payOptType
     */
    public String getPayOptType() {
        return payOptType;
    }
    /**
     * @param payOptType the payOptType to set
     */
    public void setPayOptType(String payOptType) {
        this.payOptType = payOptType;
    }
}
