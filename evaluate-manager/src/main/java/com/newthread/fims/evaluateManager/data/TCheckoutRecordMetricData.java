package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_CheckoutRecordMetricData", schema = "", catalog = "FIMS")
public class TCheckoutRecordMetricData {
    private long dataSid;
    private long dataNameSid;
    private String companyId;
    private int companyIdHash;
    private String sValues;
    private int updateTimestamp;
    private String notes;

    @Id
    @Column(name = "data_sid", nullable = false, insertable = true, updatable = true)
    public long getDataSid() {
        return dataSid;
    }

    public void setDataSid(long dataSid) {
        this.dataSid = dataSid;
    }

    @Basic
    @Column(name = "data_name_sid", nullable = false, insertable = true, updatable = true)
    public long getDataNameSid() {
        return dataNameSid;
    }

    public void setDataNameSid(long dataNameSid) {
        this.dataNameSid = dataNameSid;
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
    @Column(name = "s_values", nullable = false, insertable = true, updatable = true, length = 255)
    public String getsValues() {
        return sValues;
    }

    public void setsValues(String sValues) {
        this.sValues = sValues;
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

        TCheckoutRecordMetricData that = (TCheckoutRecordMetricData) o;

        if (companyIdHash != that.companyIdHash) return false;
        if (dataNameSid != that.dataNameSid) return false;
        if (dataSid != that.dataSid) return false;
        if (updateTimestamp != that.updateTimestamp) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (sValues != null ? !sValues.equals(that.sValues) : that.sValues != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dataSid ^ (dataSid >>> 32));
        result = 31 * result + (int) (dataNameSid ^ (dataNameSid >>> 32));
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + companyIdHash;
        result = 31 * result + (sValues != null ? sValues.hashCode() : 0);
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
