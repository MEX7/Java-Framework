package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_CheckoutRecordMetricMeta", schema = "", catalog = "FIMS")
public class TCheckoutRecordMetricMeta {
    private long dataNameSid;
    private String checkoutRecordSid;
    private String checkoutRecordId;
    private long planRuleSid;
    private String companyId;
    private int companyIdHash;
    private String scope;
    private String dim1;
    private String dim2;
    private String dim3;
    private String dim4;
    private String dim5;
    private String dim6;
    private String dim7;
    private String dim8;
    private String dim9;
    private String dim10;
    private int dimHash;
    private String metricName;
    private float submitCheckoutAmount;
    private int submitCheckoutTime;
    private int checkoutTime;
    private float sampleAmount;
    private String createOperatorId;
    private int updateTimestamp;
    private String notes;

    @Id
    @Column(name = "data_name_sid", nullable = false, insertable = true, updatable = true)
    public long getDataNameSid() {
        return dataNameSid;
    }

    public void setDataNameSid(long dataNameSid) {
        this.dataNameSid = dataNameSid;
    }

    @Basic
    @Column(name = "checkout_record_sid", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCheckoutRecordSid() {
        return checkoutRecordSid;
    }

    public void setCheckoutRecordSid(String checkoutRecordSid) {
        this.checkoutRecordSid = checkoutRecordSid;
    }

    @Basic
    @Column(name = "checkout_record_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCheckoutRecordId() {
        return checkoutRecordId;
    }

    public void setCheckoutRecordId(String checkoutRecordId) {
        this.checkoutRecordId = checkoutRecordId;
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
    @Column(name = "dim1", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim1() {
        return dim1;
    }

    public void setDim1(String dim1) {
        this.dim1 = dim1;
    }

    @Basic
    @Column(name = "dim2", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim2() {
        return dim2;
    }

    public void setDim2(String dim2) {
        this.dim2 = dim2;
    }

    @Basic
    @Column(name = "dim3", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim3() {
        return dim3;
    }

    public void setDim3(String dim3) {
        this.dim3 = dim3;
    }

    @Basic
    @Column(name = "dim4", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim4() {
        return dim4;
    }

    public void setDim4(String dim4) {
        this.dim4 = dim4;
    }

    @Basic
    @Column(name = "dim5", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim5() {
        return dim5;
    }

    public void setDim5(String dim5) {
        this.dim5 = dim5;
    }

    @Basic
    @Column(name = "dim6", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim6() {
        return dim6;
    }

    public void setDim6(String dim6) {
        this.dim6 = dim6;
    }

    @Basic
    @Column(name = "dim7", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim7() {
        return dim7;
    }

    public void setDim7(String dim7) {
        this.dim7 = dim7;
    }

    @Basic
    @Column(name = "dim8", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim8() {
        return dim8;
    }

    public void setDim8(String dim8) {
        this.dim8 = dim8;
    }

    @Basic
    @Column(name = "dim9", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim9() {
        return dim9;
    }

    public void setDim9(String dim9) {
        this.dim9 = dim9;
    }

    @Basic
    @Column(name = "dim10", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDim10() {
        return dim10;
    }

    public void setDim10(String dim10) {
        this.dim10 = dim10;
    }

    @Basic
    @Column(name = "dim_hash", nullable = false, insertable = true, updatable = true)
    public int getDimHash() {
        return dimHash;
    }

    public void setDimHash(int dimHash) {
        this.dimHash = dimHash;
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
    @Column(name = "submit_checkout_amount", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSubmitCheckoutAmount() {
        return submitCheckoutAmount;
    }

    public void setSubmitCheckoutAmount(float submitCheckoutAmount) {
        this.submitCheckoutAmount = submitCheckoutAmount;
    }

    @Basic
    @Column(name = "submit_checkout_time", nullable = false, insertable = true, updatable = true)
    public int getSubmitCheckoutTime() {
        return submitCheckoutTime;
    }

    public void setSubmitCheckoutTime(int submitCheckoutTime) {
        this.submitCheckoutTime = submitCheckoutTime;
    }

    @Basic
    @Column(name = "checkout_time", nullable = false, insertable = true, updatable = true)
    public int getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(int checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    @Basic
    @Column(name = "sample_amount", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleAmount() {
        return sampleAmount;
    }

    public void setSampleAmount(float sampleAmount) {
        this.sampleAmount = sampleAmount;
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

        TCheckoutRecordMetricMeta that = (TCheckoutRecordMetricMeta) o;

        if (checkoutTime != that.checkoutTime) return false;
        if (companyIdHash != that.companyIdHash) return false;
        if (dataNameSid != that.dataNameSid) return false;
        if (dimHash != that.dimHash) return false;
        if (planRuleSid != that.planRuleSid) return false;
        if (Float.compare(that.sampleAmount, sampleAmount) != 0) return false;
        if (Float.compare(that.submitCheckoutAmount, submitCheckoutAmount) != 0) return false;
        if (submitCheckoutTime != that.submitCheckoutTime) return false;
        if (updateTimestamp != that.updateTimestamp) return false;
        if (checkoutRecordId != null ? !checkoutRecordId.equals(that.checkoutRecordId) : that.checkoutRecordId != null)
            return false;
        if (checkoutRecordSid != null ? !checkoutRecordSid.equals(that.checkoutRecordSid) : that.checkoutRecordSid != null)
            return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (createOperatorId != null ? !createOperatorId.equals(that.createOperatorId) : that.createOperatorId != null)
            return false;
        if (dim1 != null ? !dim1.equals(that.dim1) : that.dim1 != null) return false;
        if (dim10 != null ? !dim10.equals(that.dim10) : that.dim10 != null) return false;
        if (dim2 != null ? !dim2.equals(that.dim2) : that.dim2 != null) return false;
        if (dim3 != null ? !dim3.equals(that.dim3) : that.dim3 != null) return false;
        if (dim4 != null ? !dim4.equals(that.dim4) : that.dim4 != null) return false;
        if (dim5 != null ? !dim5.equals(that.dim5) : that.dim5 != null) return false;
        if (dim6 != null ? !dim6.equals(that.dim6) : that.dim6 != null) return false;
        if (dim7 != null ? !dim7.equals(that.dim7) : that.dim7 != null) return false;
        if (dim8 != null ? !dim8.equals(that.dim8) : that.dim8 != null) return false;
        if (dim9 != null ? !dim9.equals(that.dim9) : that.dim9 != null) return false;
        if (metricName != null ? !metricName.equals(that.metricName) : that.metricName != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dataNameSid ^ (dataNameSid >>> 32));
        result = 31 * result + (checkoutRecordSid != null ? checkoutRecordSid.hashCode() : 0);
        result = 31 * result + (checkoutRecordId != null ? checkoutRecordId.hashCode() : 0);
        result = 31 * result + (int) (planRuleSid ^ (planRuleSid >>> 32));
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + companyIdHash;
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (dim1 != null ? dim1.hashCode() : 0);
        result = 31 * result + (dim2 != null ? dim2.hashCode() : 0);
        result = 31 * result + (dim3 != null ? dim3.hashCode() : 0);
        result = 31 * result + (dim4 != null ? dim4.hashCode() : 0);
        result = 31 * result + (dim5 != null ? dim5.hashCode() : 0);
        result = 31 * result + (dim6 != null ? dim6.hashCode() : 0);
        result = 31 * result + (dim7 != null ? dim7.hashCode() : 0);
        result = 31 * result + (dim8 != null ? dim8.hashCode() : 0);
        result = 31 * result + (dim9 != null ? dim9.hashCode() : 0);
        result = 31 * result + (dim10 != null ? dim10.hashCode() : 0);
        result = 31 * result + dimHash;
        result = 31 * result + (metricName != null ? metricName.hashCode() : 0);
        result = 31 * result + (submitCheckoutAmount != +0.0f ? Float.floatToIntBits(submitCheckoutAmount) : 0);
        result = 31 * result + submitCheckoutTime;
        result = 31 * result + checkoutTime;
        result = 31 * result + (sampleAmount != +0.0f ? Float.floatToIntBits(sampleAmount) : 0);
        result = 31 * result + (createOperatorId != null ? createOperatorId.hashCode() : 0);
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
