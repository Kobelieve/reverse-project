package com.kobe.mybatis.model;

import java.util.Date;

/**
 * 实体
 */
public class RechargeWithdrawalRecord {
    private Long id;

    private Long userId;

    private Long platformId;

    private String serialNumber;

    private Integer operateType;

    private Long operatePrice;

    private Integer status;

    private String financeTradeNo;

    private Date finished;

    private String bankSubmitNo;

    private String bankName;

    private String orderCode;

    private String remark;

    private Date created;

    private Date modified;

    private Integer yn;

    private Integer invalid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public Long getOperatePrice() {
        return operatePrice;
    }

    public void setOperatePrice(Long operatePrice) {
        this.operatePrice = operatePrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFinanceTradeNo() {
        return financeTradeNo;
    }

    public void setFinanceTradeNo(String financeTradeNo) {
        this.financeTradeNo = financeTradeNo == null ? null : financeTradeNo.trim();
    }

    public Date getFinished() {
        return finished;
    }

    public void setFinished(Date finished) {
        this.finished = finished;
    }

    public String getBankSubmitNo() {
        return bankSubmitNo;
    }

    public void setBankSubmitNo(String bankSubmitNo) {
        this.bankSubmitNo = bankSubmitNo == null ? null : bankSubmitNo.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }
}