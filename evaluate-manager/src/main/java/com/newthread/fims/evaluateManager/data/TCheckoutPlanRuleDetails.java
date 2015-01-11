package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_CheckoutPlanRuleDetails", schema = "", catalog = "FIMS")
public class TCheckoutPlanRuleDetails {
    private int planRuleDetailsSid;
    private long planRuleSid;
    private String mapPosition;
    private String threeDimensionalRogramNo;
    private String fixtureId;
    private int updateTimestamp;
    private String notes;

    @Id
    @Column(name = "plan_rule_details_sid", nullable = false, insertable = true, updatable = true)
    public int getPlanRuleDetailsSid() {
        return planRuleDetailsSid;
    }

    public void setPlanRuleDetailsSid(int planRuleDetailsSid) {
        this.planRuleDetailsSid = planRuleDetailsSid;
    }

    @Basic
    @Column(name = "plan_rule_sid", nullable = false, insertable = true, updatable = true)
    public long getPlanRuleSid() {
        return planRuleSid;
    }

    public void setPlanRuleSid(long planRuleSid) {
        this.planRuleSid = planRuleSid;
    }

    @Basic
    @Column(name = "map_position", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMapPosition() {
        return mapPosition;
    }

    public void setMapPosition(String mapPosition) {
        this.mapPosition = mapPosition;
    }

    @Basic
    @Column(name = "three_dimensional_rogram_no", nullable = true, insertable = true, updatable = true, length = 255)
    public String getThreeDimensionalRogramNo() {
        return threeDimensionalRogramNo;
    }

    public void setThreeDimensionalRogramNo(String threeDimensionalRogramNo) {
        this.threeDimensionalRogramNo = threeDimensionalRogramNo;
    }

    @Basic
    @Column(name = "fixture_id", nullable = true, insertable = true, updatable = true, length = 255)
    public String getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(String fixtureId) {
        this.fixtureId = fixtureId;
    }

    @Basic
    @Column(name = "update_timestamp", nullable = false, insertable = true, updatable = true)
    public int getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(int updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Basic
    @Column(name = "notes", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCheckoutPlanRuleDetails that = (TCheckoutPlanRuleDetails) o;

        if (planRuleDetailsSid != that.planRuleDetailsSid) return false;
        if (planRuleSid != that.planRuleSid) return false;
        if (updateTimestamp != that.updateTimestamp) return false;
        if (fixtureId != null ? !fixtureId.equals(that.fixtureId) : that.fixtureId != null) return false;
        if (mapPosition != null ? !mapPosition.equals(that.mapPosition) : that.mapPosition != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (threeDimensionalRogramNo != null ? !threeDimensionalRogramNo.equals(that.threeDimensionalRogramNo) : that.threeDimensionalRogramNo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = planRuleDetailsSid;
        result = 31 * result + (int) (planRuleSid ^ (planRuleSid >>> 32));
        result = 31 * result + (mapPosition != null ? mapPosition.hashCode() : 0);
        result = 31 * result + (threeDimensionalRogramNo != null ? threeDimensionalRogramNo.hashCode() : 0);
        result = 31 * result + (fixtureId != null ? fixtureId.hashCode() : 0);
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
