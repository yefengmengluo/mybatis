package personal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VoteAdvertisingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoteAdvertisingExample() {
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

        public Criteria andAdvIdIsNull() {
            addCriterion("adv_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvIdIsNotNull() {
            addCriterion("adv_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvIdEqualTo(Long value) {
            addCriterion("adv_id =", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdNotEqualTo(Long value) {
            addCriterion("adv_id <>", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdGreaterThan(Long value) {
            addCriterion("adv_id >", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("adv_id >=", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdLessThan(Long value) {
            addCriterion("adv_id <", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdLessThanOrEqualTo(Long value) {
            addCriterion("adv_id <=", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdIn(List<Long> values) {
            addCriterion("adv_id in", values, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdNotIn(List<Long> values) {
            addCriterion("adv_id not in", values, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdBetween(Long value1, Long value2) {
            addCriterion("adv_id between", value1, value2, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdNotBetween(Long value1, Long value2) {
            addCriterion("adv_id not between", value1, value2, "advId");
            return (Criteria) this;
        }

        public Criteria andVIdIsNull() {
            addCriterion("v_id is null");
            return (Criteria) this;
        }

        public Criteria andVIdIsNotNull() {
            addCriterion("v_id is not null");
            return (Criteria) this;
        }

        public Criteria andVIdEqualTo(Long value) {
            addCriterion("v_id =", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotEqualTo(Long value) {
            addCriterion("v_id <>", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThan(Long value) {
            addCriterion("v_id >", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThanOrEqualTo(Long value) {
            addCriterion("v_id >=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThan(Long value) {
            addCriterion("v_id <", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThanOrEqualTo(Long value) {
            addCriterion("v_id <=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdIn(List<Long> values) {
            addCriterion("v_id in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotIn(List<Long> values) {
            addCriterion("v_id not in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdBetween(Long value1, Long value2) {
            addCriterion("v_id between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotBetween(Long value1, Long value2) {
            addCriterion("v_id not between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andCopIdIsNull() {
            addCriterion("cop_id is null");
            return (Criteria) this;
        }

        public Criteria andCopIdIsNotNull() {
            addCriterion("cop_id is not null");
            return (Criteria) this;
        }

        public Criteria andCopIdEqualTo(Long value) {
            addCriterion("cop_id =", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdNotEqualTo(Long value) {
            addCriterion("cop_id <>", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdGreaterThan(Long value) {
            addCriterion("cop_id >", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cop_id >=", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdLessThan(Long value) {
            addCriterion("cop_id <", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdLessThanOrEqualTo(Long value) {
            addCriterion("cop_id <=", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdIn(List<Long> values) {
            addCriterion("cop_id in", values, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdNotIn(List<Long> values) {
            addCriterion("cop_id not in", values, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdBetween(Long value1, Long value2) {
            addCriterion("cop_id between", value1, value2, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdNotBetween(Long value1, Long value2) {
            addCriterion("cop_id not between", value1, value2, "copId");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(Integer value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(Integer value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(Integer value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(Integer value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(Integer value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<Integer> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<Integer> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(Integer value1, Integer value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("position_name is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("position_name is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("position_name =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("position_name <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("position_name >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("position_name >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("position_name <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("position_name <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("position_name like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("position_name not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("position_name in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("position_name not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("position_name between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("position_name not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andAdvTagIsNull() {
            addCriterion("adv_tag is null");
            return (Criteria) this;
        }

        public Criteria andAdvTagIsNotNull() {
            addCriterion("adv_tag is not null");
            return (Criteria) this;
        }

        public Criteria andAdvTagEqualTo(String value) {
            addCriterion("adv_tag =", value, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagNotEqualTo(String value) {
            addCriterion("adv_tag <>", value, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagGreaterThan(String value) {
            addCriterion("adv_tag >", value, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagGreaterThanOrEqualTo(String value) {
            addCriterion("adv_tag >=", value, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagLessThan(String value) {
            addCriterion("adv_tag <", value, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagLessThanOrEqualTo(String value) {
            addCriterion("adv_tag <=", value, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagLike(String value) {
            addCriterion("adv_tag like", value, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagNotLike(String value) {
            addCriterion("adv_tag not like", value, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagIn(List<String> values) {
            addCriterion("adv_tag in", values, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagNotIn(List<String> values) {
            addCriterion("adv_tag not in", values, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagBetween(String value1, String value2) {
            addCriterion("adv_tag between", value1, value2, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTagNotBetween(String value1, String value2) {
            addCriterion("adv_tag not between", value1, value2, "advTag");
            return (Criteria) this;
        }

        public Criteria andAdvTypeIsNull() {
            addCriterion("adv_type is null");
            return (Criteria) this;
        }

        public Criteria andAdvTypeIsNotNull() {
            addCriterion("adv_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdvTypeEqualTo(Integer value) {
            addCriterion("adv_type =", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeNotEqualTo(Integer value) {
            addCriterion("adv_type <>", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeGreaterThan(Integer value) {
            addCriterion("adv_type >", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_type >=", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeLessThan(Integer value) {
            addCriterion("adv_type <", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeLessThanOrEqualTo(Integer value) {
            addCriterion("adv_type <=", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeIn(List<Integer> values) {
            addCriterion("adv_type in", values, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeNotIn(List<Integer> values) {
            addCriterion("adv_type not in", values, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeBetween(Integer value1, Integer value2) {
            addCriterion("adv_type between", value1, value2, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_type not between", value1, value2, "advType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andAdvNumIsNull() {
            addCriterion("adv_num is null");
            return (Criteria) this;
        }

        public Criteria andAdvNumIsNotNull() {
            addCriterion("adv_num is not null");
            return (Criteria) this;
        }

        public Criteria andAdvNumEqualTo(Integer value) {
            addCriterion("adv_num =", value, "advNum");
            return (Criteria) this;
        }

        public Criteria andAdvNumNotEqualTo(Integer value) {
            addCriterion("adv_num <>", value, "advNum");
            return (Criteria) this;
        }

        public Criteria andAdvNumGreaterThan(Integer value) {
            addCriterion("adv_num >", value, "advNum");
            return (Criteria) this;
        }

        public Criteria andAdvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_num >=", value, "advNum");
            return (Criteria) this;
        }

        public Criteria andAdvNumLessThan(Integer value) {
            addCriterion("adv_num <", value, "advNum");
            return (Criteria) this;
        }

        public Criteria andAdvNumLessThanOrEqualTo(Integer value) {
            addCriterion("adv_num <=", value, "advNum");
            return (Criteria) this;
        }

        public Criteria andAdvNumIn(List<Integer> values) {
            addCriterion("adv_num in", values, "advNum");
            return (Criteria) this;
        }

        public Criteria andAdvNumNotIn(List<Integer> values) {
            addCriterion("adv_num not in", values, "advNum");
            return (Criteria) this;
        }

        public Criteria andAdvNumBetween(Integer value1, Integer value2) {
            addCriterion("adv_num between", value1, value2, "advNum");
            return (Criteria) this;
        }

        public Criteria andAdvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_num not between", value1, value2, "advNum");
            return (Criteria) this;
        }

        public Criteria andTlengthIsNull() {
            addCriterion("tlength is null");
            return (Criteria) this;
        }

        public Criteria andTlengthIsNotNull() {
            addCriterion("tlength is not null");
            return (Criteria) this;
        }

        public Criteria andTlengthEqualTo(Integer value) {
            addCriterion("tlength =", value, "tlength");
            return (Criteria) this;
        }

        public Criteria andTlengthNotEqualTo(Integer value) {
            addCriterion("tlength <>", value, "tlength");
            return (Criteria) this;
        }

        public Criteria andTlengthGreaterThan(Integer value) {
            addCriterion("tlength >", value, "tlength");
            return (Criteria) this;
        }

        public Criteria andTlengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("tlength >=", value, "tlength");
            return (Criteria) this;
        }

        public Criteria andTlengthLessThan(Integer value) {
            addCriterion("tlength <", value, "tlength");
            return (Criteria) this;
        }

        public Criteria andTlengthLessThanOrEqualTo(Integer value) {
            addCriterion("tlength <=", value, "tlength");
            return (Criteria) this;
        }

        public Criteria andTlengthIn(List<Integer> values) {
            addCriterion("tlength in", values, "tlength");
            return (Criteria) this;
        }

        public Criteria andTlengthNotIn(List<Integer> values) {
            addCriterion("tlength not in", values, "tlength");
            return (Criteria) this;
        }

        public Criteria andTlengthBetween(Integer value1, Integer value2) {
            addCriterion("tlength between", value1, value2, "tlength");
            return (Criteria) this;
        }

        public Criteria andTlengthNotBetween(Integer value1, Integer value2) {
            addCriterion("tlength not between", value1, value2, "tlength");
            return (Criteria) this;
        }

        public Criteria andGwidthIsNull() {
            addCriterion("gwidth is null");
            return (Criteria) this;
        }

        public Criteria andGwidthIsNotNull() {
            addCriterion("gwidth is not null");
            return (Criteria) this;
        }

        public Criteria andGwidthEqualTo(Double value) {
            addCriterion("gwidth =", value, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGwidthNotEqualTo(Double value) {
            addCriterion("gwidth <>", value, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGwidthGreaterThan(Double value) {
            addCriterion("gwidth >", value, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("gwidth >=", value, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGwidthLessThan(Double value) {
            addCriterion("gwidth <", value, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGwidthLessThanOrEqualTo(Double value) {
            addCriterion("gwidth <=", value, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGwidthIn(List<Double> values) {
            addCriterion("gwidth in", values, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGwidthNotIn(List<Double> values) {
            addCriterion("gwidth not in", values, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGwidthBetween(Double value1, Double value2) {
            addCriterion("gwidth between", value1, value2, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGwidthNotBetween(Double value1, Double value2) {
            addCriterion("gwidth not between", value1, value2, "gwidth");
            return (Criteria) this;
        }

        public Criteria andGheightIsNull() {
            addCriterion("gheight is null");
            return (Criteria) this;
        }

        public Criteria andGheightIsNotNull() {
            addCriterion("gheight is not null");
            return (Criteria) this;
        }

        public Criteria andGheightEqualTo(Double value) {
            addCriterion("gheight =", value, "gheight");
            return (Criteria) this;
        }

        public Criteria andGheightNotEqualTo(Double value) {
            addCriterion("gheight <>", value, "gheight");
            return (Criteria) this;
        }

        public Criteria andGheightGreaterThan(Double value) {
            addCriterion("gheight >", value, "gheight");
            return (Criteria) this;
        }

        public Criteria andGheightGreaterThanOrEqualTo(Double value) {
            addCriterion("gheight >=", value, "gheight");
            return (Criteria) this;
        }

        public Criteria andGheightLessThan(Double value) {
            addCriterion("gheight <", value, "gheight");
            return (Criteria) this;
        }

        public Criteria andGheightLessThanOrEqualTo(Double value) {
            addCriterion("gheight <=", value, "gheight");
            return (Criteria) this;
        }

        public Criteria andGheightIn(List<Double> values) {
            addCriterion("gheight in", values, "gheight");
            return (Criteria) this;
        }

        public Criteria andGheightNotIn(List<Double> values) {
            addCriterion("gheight not in", values, "gheight");
            return (Criteria) this;
        }

        public Criteria andGheightBetween(Double value1, Double value2) {
            addCriterion("gheight between", value1, value2, "gheight");
            return (Criteria) this;
        }

        public Criteria andGheightNotBetween(Double value1, Double value2) {
            addCriterion("gheight not between", value1, value2, "gheight");
            return (Criteria) this;
        }

        public Criteria andGpwidthIsNull() {
            addCriterion("gpwidth is null");
            return (Criteria) this;
        }

        public Criteria andGpwidthIsNotNull() {
            addCriterion("gpwidth is not null");
            return (Criteria) this;
        }

        public Criteria andGpwidthEqualTo(Double value) {
            addCriterion("gpwidth =", value, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpwidthNotEqualTo(Double value) {
            addCriterion("gpwidth <>", value, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpwidthGreaterThan(Double value) {
            addCriterion("gpwidth >", value, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("gpwidth >=", value, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpwidthLessThan(Double value) {
            addCriterion("gpwidth <", value, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpwidthLessThanOrEqualTo(Double value) {
            addCriterion("gpwidth <=", value, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpwidthIn(List<Double> values) {
            addCriterion("gpwidth in", values, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpwidthNotIn(List<Double> values) {
            addCriterion("gpwidth not in", values, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpwidthBetween(Double value1, Double value2) {
            addCriterion("gpwidth between", value1, value2, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpwidthNotBetween(Double value1, Double value2) {
            addCriterion("gpwidth not between", value1, value2, "gpwidth");
            return (Criteria) this;
        }

        public Criteria andGpheightIsNull() {
            addCriterion("gpheight is null");
            return (Criteria) this;
        }

        public Criteria andGpheightIsNotNull() {
            addCriterion("gpheight is not null");
            return (Criteria) this;
        }

        public Criteria andGpheightEqualTo(Double value) {
            addCriterion("gpheight =", value, "gpheight");
            return (Criteria) this;
        }

        public Criteria andGpheightNotEqualTo(Double value) {
            addCriterion("gpheight <>", value, "gpheight");
            return (Criteria) this;
        }

        public Criteria andGpheightGreaterThan(Double value) {
            addCriterion("gpheight >", value, "gpheight");
            return (Criteria) this;
        }

        public Criteria andGpheightGreaterThanOrEqualTo(Double value) {
            addCriterion("gpheight >=", value, "gpheight");
            return (Criteria) this;
        }

        public Criteria andGpheightLessThan(Double value) {
            addCriterion("gpheight <", value, "gpheight");
            return (Criteria) this;
        }

        public Criteria andGpheightLessThanOrEqualTo(Double value) {
            addCriterion("gpheight <=", value, "gpheight");
            return (Criteria) this;
        }

        public Criteria andGpheightIn(List<Double> values) {
            addCriterion("gpheight in", values, "gpheight");
            return (Criteria) this;
        }

        public Criteria andGpheightNotIn(List<Double> values) {
            addCriterion("gpheight not in", values, "gpheight");
            return (Criteria) this;
        }

        public Criteria andGpheightBetween(Double value1, Double value2) {
            addCriterion("gpheight between", value1, value2, "gpheight");
            return (Criteria) this;
        }

        public Criteria andGpheightNotBetween(Double value1, Double value2) {
            addCriterion("gpheight not between", value1, value2, "gpheight");
            return (Criteria) this;
        }

        public Criteria andAdvOrderIsNull() {
            addCriterion("adv_order is null");
            return (Criteria) this;
        }

        public Criteria andAdvOrderIsNotNull() {
            addCriterion("adv_order is not null");
            return (Criteria) this;
        }

        public Criteria andAdvOrderEqualTo(Integer value) {
            addCriterion("adv_order =", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderNotEqualTo(Integer value) {
            addCriterion("adv_order <>", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderGreaterThan(Integer value) {
            addCriterion("adv_order >", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_order >=", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderLessThan(Integer value) {
            addCriterion("adv_order <", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderLessThanOrEqualTo(Integer value) {
            addCriterion("adv_order <=", value, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderIn(List<Integer> values) {
            addCriterion("adv_order in", values, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderNotIn(List<Integer> values) {
            addCriterion("adv_order not in", values, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderBetween(Integer value1, Integer value2) {
            addCriterion("adv_order between", value1, value2, "advOrder");
            return (Criteria) this;
        }

        public Criteria andAdvOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_order not between", value1, value2, "advOrder");
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