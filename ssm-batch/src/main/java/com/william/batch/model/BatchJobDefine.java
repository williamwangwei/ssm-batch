package com.william.batch.model;

public class BatchJobDefine {
    private String jobId;

    private Long id;

    private String jobName;

    private String proName;

    private String profileFlag;

    private String profileId;

    private String manualFlag;

    private String jobDetail;

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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProfileFlag() {
        return profileFlag;
    }

    public void setProfileFlag(String profileFlag) {
        this.profileFlag = profileFlag == null ? null : profileFlag.trim();
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId == null ? null : profileId.trim();
    }

    public String getManualFlag() {
        return manualFlag;
    }

    public void setManualFlag(String manualFlag) {
        this.manualFlag = manualFlag == null ? null : manualFlag.trim();
    }

    public String getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(String jobDetail) {
        this.jobDetail = jobDetail == null ? null : jobDetail.trim();
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

	@Override
	public String toString() {
		return "BatchJobDefine [jobId=" + jobId + ", id=" + id + ", jobName=" + jobName + ", proName=" + proName
				+ ", profileFlag=" + profileFlag + ", profileId=" + profileId + ", manualFlag=" + manualFlag
				+ ", jobDetail=" + jobDetail + ", createDate=" + createDate + ", createUser=" + createUser
				+ ", inputDate=" + inputDate + ", tellerId=" + tellerId + "]";
	}
    
    
    
}