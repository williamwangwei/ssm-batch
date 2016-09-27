package com.william.batch.model;

import java.util.ArrayList;
import java.util.List;

public class BatchJobDefineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatchJobDefineExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(String value) {
            addCriterion("JOB_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(String value) {
            addCriterion("JOB_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(String value) {
            addCriterion("JOB_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(String value) {
            addCriterion("JOB_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(String value) {
            addCriterion("JOB_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLike(String value) {
            addCriterion("JOB_ID like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotLike(String value) {
            addCriterion("JOB_ID not like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<String> values) {
            addCriterion("JOB_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<String> values) {
            addCriterion("JOB_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(String value1, String value2) {
            addCriterion("JOB_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(String value1, String value2) {
            addCriterion("JOB_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("JOB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("JOB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("JOB_NAME =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("JOB_NAME <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("JOB_NAME >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NAME >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("JOB_NAME <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_NAME <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("JOB_NAME like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("JOB_NAME not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("JOB_NAME in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("JOB_NAME not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("JOB_NAME between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("JOB_NAME not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("PRO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("PRO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("PRO_NAME =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("PRO_NAME <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("PRO_NAME >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_NAME >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("PRO_NAME <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("PRO_NAME <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("PRO_NAME like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("PRO_NAME not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("PRO_NAME in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("PRO_NAME not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("PRO_NAME between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("PRO_NAME not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProfileFlagIsNull() {
            addCriterion("PROFILE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andProfileFlagIsNotNull() {
            addCriterion("PROFILE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andProfileFlagEqualTo(String value) {
            addCriterion("PROFILE_FLAG =", value, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagNotEqualTo(String value) {
            addCriterion("PROFILE_FLAG <>", value, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagGreaterThan(String value) {
            addCriterion("PROFILE_FLAG >", value, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PROFILE_FLAG >=", value, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagLessThan(String value) {
            addCriterion("PROFILE_FLAG <", value, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagLessThanOrEqualTo(String value) {
            addCriterion("PROFILE_FLAG <=", value, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagLike(String value) {
            addCriterion("PROFILE_FLAG like", value, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagNotLike(String value) {
            addCriterion("PROFILE_FLAG not like", value, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagIn(List<String> values) {
            addCriterion("PROFILE_FLAG in", values, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagNotIn(List<String> values) {
            addCriterion("PROFILE_FLAG not in", values, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagBetween(String value1, String value2) {
            addCriterion("PROFILE_FLAG between", value1, value2, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileFlagNotBetween(String value1, String value2) {
            addCriterion("PROFILE_FLAG not between", value1, value2, "profileFlag");
            return (Criteria) this;
        }

        public Criteria andProfileIdIsNull() {
            addCriterion("PROFILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProfileIdIsNotNull() {
            addCriterion("PROFILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProfileIdEqualTo(String value) {
            addCriterion("PROFILE_ID =", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotEqualTo(String value) {
            addCriterion("PROFILE_ID <>", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdGreaterThan(String value) {
            addCriterion("PROFILE_ID >", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROFILE_ID >=", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdLessThan(String value) {
            addCriterion("PROFILE_ID <", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdLessThanOrEqualTo(String value) {
            addCriterion("PROFILE_ID <=", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdLike(String value) {
            addCriterion("PROFILE_ID like", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotLike(String value) {
            addCriterion("PROFILE_ID not like", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdIn(List<String> values) {
            addCriterion("PROFILE_ID in", values, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotIn(List<String> values) {
            addCriterion("PROFILE_ID not in", values, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdBetween(String value1, String value2) {
            addCriterion("PROFILE_ID between", value1, value2, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotBetween(String value1, String value2) {
            addCriterion("PROFILE_ID not between", value1, value2, "profileId");
            return (Criteria) this;
        }

        public Criteria andManualFlagIsNull() {
            addCriterion("MANUAL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andManualFlagIsNotNull() {
            addCriterion("MANUAL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andManualFlagEqualTo(String value) {
            addCriterion("MANUAL_FLAG =", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagNotEqualTo(String value) {
            addCriterion("MANUAL_FLAG <>", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagGreaterThan(String value) {
            addCriterion("MANUAL_FLAG >", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MANUAL_FLAG >=", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagLessThan(String value) {
            addCriterion("MANUAL_FLAG <", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagLessThanOrEqualTo(String value) {
            addCriterion("MANUAL_FLAG <=", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagLike(String value) {
            addCriterion("MANUAL_FLAG like", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagNotLike(String value) {
            addCriterion("MANUAL_FLAG not like", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagIn(List<String> values) {
            addCriterion("MANUAL_FLAG in", values, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagNotIn(List<String> values) {
            addCriterion("MANUAL_FLAG not in", values, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagBetween(String value1, String value2) {
            addCriterion("MANUAL_FLAG between", value1, value2, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagNotBetween(String value1, String value2) {
            addCriterion("MANUAL_FLAG not between", value1, value2, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andJobDetailIsNull() {
            addCriterion("JOB_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andJobDetailIsNotNull() {
            addCriterion("JOB_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andJobDetailEqualTo(String value) {
            addCriterion("JOB_DETAIL =", value, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailNotEqualTo(String value) {
            addCriterion("JOB_DETAIL <>", value, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailGreaterThan(String value) {
            addCriterion("JOB_DETAIL >", value, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_DETAIL >=", value, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailLessThan(String value) {
            addCriterion("JOB_DETAIL <", value, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailLessThanOrEqualTo(String value) {
            addCriterion("JOB_DETAIL <=", value, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailLike(String value) {
            addCriterion("JOB_DETAIL like", value, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailNotLike(String value) {
            addCriterion("JOB_DETAIL not like", value, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailIn(List<String> values) {
            addCriterion("JOB_DETAIL in", values, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailNotIn(List<String> values) {
            addCriterion("JOB_DETAIL not in", values, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailBetween(String value1, String value2) {
            addCriterion("JOB_DETAIL between", value1, value2, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andJobDetailNotBetween(String value1, String value2) {
            addCriterion("JOB_DETAIL not between", value1, value2, "jobDetail");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("CREATE_DATE like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("CREATE_DATE not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("INPUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("INPUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(String value) {
            addCriterion("INPUT_DATE =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(String value) {
            addCriterion("INPUT_DATE <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(String value) {
            addCriterion("INPUT_DATE >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_DATE >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(String value) {
            addCriterion("INPUT_DATE <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(String value) {
            addCriterion("INPUT_DATE <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLike(String value) {
            addCriterion("INPUT_DATE like", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotLike(String value) {
            addCriterion("INPUT_DATE not like", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<String> values) {
            addCriterion("INPUT_DATE in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<String> values) {
            addCriterion("INPUT_DATE not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(String value1, String value2) {
            addCriterion("INPUT_DATE between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(String value1, String value2) {
            addCriterion("INPUT_DATE not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andTellerIdIsNull() {
            addCriterion("TELLER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTellerIdIsNotNull() {
            addCriterion("TELLER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTellerIdEqualTo(String value) {
            addCriterion("TELLER_ID =", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdNotEqualTo(String value) {
            addCriterion("TELLER_ID <>", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdGreaterThan(String value) {
            addCriterion("TELLER_ID >", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("TELLER_ID >=", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdLessThan(String value) {
            addCriterion("TELLER_ID <", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdLessThanOrEqualTo(String value) {
            addCriterion("TELLER_ID <=", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdLike(String value) {
            addCriterion("TELLER_ID like", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdNotLike(String value) {
            addCriterion("TELLER_ID not like", value, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdIn(List<String> values) {
            addCriterion("TELLER_ID in", values, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdNotIn(List<String> values) {
            addCriterion("TELLER_ID not in", values, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdBetween(String value1, String value2) {
            addCriterion("TELLER_ID between", value1, value2, "tellerId");
            return (Criteria) this;
        }

        public Criteria andTellerIdNotBetween(String value1, String value2) {
            addCriterion("TELLER_ID not between", value1, value2, "tellerId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}