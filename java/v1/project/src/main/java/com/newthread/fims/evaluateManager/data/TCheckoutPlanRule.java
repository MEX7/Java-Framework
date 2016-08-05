package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_CheckoutPlanRule", schema = "", catalog = "FIMS")
public class TCheckoutPlanRule {
    private long planRuleSid;
    private String planId;
    private String planVersion;
    private String checkoutPlanTypeId;
    private String companyId;
    private int companyIdHash;
    private String scope;
    private float aql;
    private String externalReceiptNo;
    private String materialId;
    private String checkoutToolName;
    private String metricName;
    private String differenceExp;
    private String createOperatorId;
    private int updateTimestamp;
    private String notes;

    @Id
    @Column(name = "plan_rule_sid", nullable = false, insertable = true, updatable = true)
    public long getPlanRuleSid() {
        return planRuleSid;
    }

    public void setPlanRuleSid(long planRuleSid) {
        this.planRuleSid = planRuleSid;
    }

    @Basic
    @Column(name = "plan_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    @Basic
    @Column(name = "plan_version", nullable = false, insertable = true, updatable = true, length = 255)
    public String getPlanVersion() {
        return planVersion;
    }

    public void setPlanVersion(String planVersion) {
        this.planVersion = planVersion;
    }

    @Basic
    @Column(name = "checkout_plan_type_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCheckoutPlanTypeId() {
        return checkoutPlanTypeId;
    }

    public void setCheckoutPlanTypeId(String checkoutPlanTypeId) {
        this.checkoutPlanTypeId = checkoutPlanTypeId;
    }

    @Basic
    @Column(name = "company_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "company_id_hash", nullable = false, insertable = true, updatable = true)
    public int getCompanyIdHash() {
        return companyIdHash;
    }

    public void setCompanyIdHash(int companyIdHash) {
        this.companyIdHash = companyIdHash;
    }

    @Basic
    @Column(name = "scope", nullable = false, insertable = true, updatable = true, length = 255)
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "AQL", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getAql() {
        return aql;
    }

    public void setAql(float aql) {
        this.aql = aql;
    }

    @Basic
    @Column(name = "external_receipt_no", nullable = false, insertable = true, updatable = true, length = 255)
    public String getExternalReceiptNo() {
        return externalReceiptNo;
    }

    public void setExternalReceiptNo(String externalReceiptNo) {
        this.externalReceiptNo = externalReceiptNo;
    }

    @Basic
    @Column(name = "material_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    @Basic
    @Column(name = "checkout_tool_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCheckoutToolName() {
        return checkoutToolName;
    }

    public void setCheckoutToolName(String checkoutToolName) {
        this.checkoutToolName = checkoutToolName;
    }

    @Basic
    @Column(name = "metric_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    @Basic
    @Column(name = "difference_exp", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDifferenceExp() {
        return differenceExp;
    }

    public void setDifferenceExp(String differenceExp) {
        this.differenceExp = differenceExp;
    }

    @Basic
    @Column(name = "create_operator_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCreateOperatorId() {
        return createOperatorId;
    }

    public void setCreateOperatorId(String createOperatorId) {
        this.createOperatorId = createOperatorId;
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

        TCheckoutPlanRule that = (TCheckoutPlanRule) o;

        if (Float.compare(that.aql, aql) != 0) return false;
        if (companyIdHash != that.companyIdHash) return false;
        if (planRuleSid != that.planRuleSid) return false;
        if (updateTimestamp != that.updateTimestamp) return false;
        if (checkoutPlanTypeId != null ? !checkoutPlanTypeId.equals(that.checkoutPlanTypeId) : that.checkoutPlanTypeId != null)
            return false;
        if (checkoutToolName != null ? !checkoutToolName.equals(that.checkoutToolName) : that.checkoutToolName != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (createOperatorId != null ? !createOperatorId.equals(that.createOperatorId) : that.createOperatorId != null)
            return false;
        if (differenceExp != null ? !differenceExp.equals(that.differenceExp) : that.differenceExp != null)
            return false;
        if (externalReceiptNo != null ? !externalReceiptNo.equals(that.externalReceiptNo) : that.externalReceiptNo != null)
            return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;
        if (metricName != null ? !metricName.equals(that.metricName) : that.metricName != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (planId != null ? !planId.equals(that.planId) : that.planId != null) return false;
        if (planVersion != null ? !planVersion.equals(that.planVersion) : that.planVersion != null) return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (planRuleSid ^ (planRuleSid >>> 32));
        result = 31 * result + (planId != null ? planId.hashCode() : 0);
        result = 31 * result + (planVersion != null ? planVersion.hashCode() : 0);
        result = 31 * result + (checkoutPlanTypeId != null ? checkoutPlanTypeId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + companyIdHash;
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (aql != +0.0f ? Float.floatToIntBits(aql) : 0);
        result = 31 * result + (externalReceiptNo != null ? externalReceiptNo.hashCode() : 0);
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        result = 31 * result + (checkoutToolName != null ? checkoutToolName.hashCode() : 0);
        result = 31 * result + (metricName != null ? metricName.hashCode() : 0);
        result = 31 * result + (differenceExp != null ? differenceExp.hashCode() : 0);
        result = 31 * result + (createOperatorId != null ? createOperatorId.hashCode() : 0);
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
