package com.william.batch.model;

public class BatchManage {
    private String jobId;

    private Long id;

    private String batchId;

    private String batchName;

    private Short groupOrder;

    private String jobName;

    private String tradeCode;

    private String tradeType;

    private String multiThrFlag;

    private Integer maxThreadNum;

    private String skipFlag;

    private String resetFlag;

    private String dependency;

    private String nextProcessType;

    private String conditionData;

    private String holidayFlag;

    private String jobState;

    private String createDate;

    private String createUser;

    private String inputDate;

    private String tellerId;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    public Short getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(Short groupOrder) {
        this.groupOrder = groupOrder;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode == null ? null : tradeCode.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public String getMultiThrFlag() {
        return multiThrFlag;
    }

    public void setMultiThrFlag(String multiThrFlag) {
        this.multiThrFlag = multiThrFlag == null ? null : multiThrFlag.trim();
    }

    public Integer getMaxThreadNum() {
        return maxThreadNum;
    }

    public void setMaxThreadNum(Integer maxThreadNum) {
        this.maxThreadNum = maxThreadNum;
    }

    public String getSkipFlag() {
        return skipFlag;
    }

    public void setSkipFlag(String skipFlag) {
        this.skipFlag = skipFlag == null ? null : skipFlag.trim();
    }

    public String getResetFlag() {
        return resetFlag;
    }

    public void setResetFlag(String resetFlag) {
        this.resetFlag = resetFlag == null ? null : resetFlag.trim();
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency == null ? null : dependency.trim();
    }

    public String getNextProcessType() {
        return nextProcessType;
    }

    public void setNextProcessType(String nextProcessType) {
        this.nextProcessType = nextProcessType == null ? null : nextProcessType.trim();
    }

    public String getConditionData() {
        return conditionData;
    }

    public void setConditionData(String conditionData) {
        this.conditionData = conditionData == null ? null : conditionData.trim();
    }

    public String getHolidayFlag() {
        return holidayFlag;
    }

    public void setHolidayFlag(String holidayFlag) {
        this.holidayFlag = holidayFlag == null ? null : holidayFlag.trim();
    }

    public String getJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState == null ? null : jobState.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }

    public String getTellerId() {
        return tellerId;
    }

    public void setTellerId(String tellerId) {
        this.tellerId = tellerId == null ? null : tellerId.trim();
    }
}