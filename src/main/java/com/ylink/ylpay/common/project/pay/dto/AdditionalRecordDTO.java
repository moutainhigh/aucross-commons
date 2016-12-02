/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-10-29
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-2-27
 * @description：补录DTO
 */

public class AdditionalRecordDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;

    /**
     * 业务流水号
     */
    private String businessSn;   
    /**
     * 操作编码
     */
    private String optCode;
    /**
     * 订单金额
     */
    private long orderAmt;
    /**
     * 业务类型
     */
    private String productType;
    /**
     * 充值客户ID
     */
    private String custId;
    /**
     * 充值客户真实姓名
     */
    private String custName;
    /**
     * 充值银行行别
     */
    private String bankType;
    /**
     * 商户号
     */
    private String merchantId; 
    /**
     * 计费类型
     */
    private String feeType;
    /**
     * 手续费
     */
    private long fee;
    /**
     * 渠道类型
     */
    private String channelType;
    /**
     * 补录充值订单id
     */
    private String oldRechargeId;
    /**
     * 补录订单类型
     */
    private String oldTradeType;
    /**
     * 补录支付订单
     */
    private String oldPayId;
    /**
     * @return the businessSn
     */
    
    /**
     * 渠道流水
     */
    private String oldChannelNo;
    
    
    public String getBusinessSn() {
        return businessSn;
    }
    /**
     * @param businessSn the businessSn to set
     */
    public void setBusinessSn(String businessSn) {
        this.businessSn = businessSn;
    }
    /**
     * @return the optCode
     */
    public String getOptCode() {
        return optCode;
    }
    /**
     * @param optcode the optCode to set
     */
    public void setOptCode(String optCode) {
        this.optCode = optCode;
    }
    /**
     * @return the orderAmt
     */
    public long getOrderAmt() {
        return orderAmt;
    }
    /**
     * @param orderAmt the orderAmt to set
     */
    public void setOrderAmt(long orderAmt) {
        this.orderAmt = orderAmt;
    }
    /**
     * @return the productType
     */
    public String getProductType() {
        return productType;
    }
    /**
     * @param productType the productType to set
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }
    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }
    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }
    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }
    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
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
     * @return the merchantId
     */
    public String getMerchantId() {
        return merchantId;
    }
    /**
     * @param merchantId the merchantId to set
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
    /**
     * @return the feeType
     */
    public String getFeeType() {
        return feeType;
    }
    /**
     * @param feeType the feeType to set
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }
    /**
     * @return the fee
     */
    public long getFee() {
        return fee;
    }
    /**
     * @param fee the fee to set
     */
    public void setFee(long fee) {
        this.fee = fee;
    }
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getOldRechargeId() {
		return oldRechargeId;
	}
	public void setOldRechargeId(String oldRechargeId) {
		this.oldRechargeId = oldRechargeId;
	}
	public String getOldTradeType() {
		return oldTradeType;
	}
	public void setOldTradeType(String oldTradeType) {
		this.oldTradeType = oldTradeType;
	}
	public String getOldPayId() {
		return oldPayId;
	}
	public void setOldPayId(String oldPayId) {
		this.oldPayId = oldPayId;
	}
	public String getOldChannelNo() {
		return oldChannelNo;
	}
	public void setOldChannelNo(String oldChannelNo) {
		this.oldChannelNo = oldChannelNo;
	}
	
    
    
}
