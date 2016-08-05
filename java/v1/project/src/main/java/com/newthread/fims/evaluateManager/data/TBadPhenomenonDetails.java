package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_BadPhenomenonDetails", schema = "", catalog = "FIMS")
public class TBadPhenomenonDetails {
    private int badPhenomenonSid;
    private String badPhenomenonId;
    private String badPhenomenonName;
    private String badPhenomenonAmount;
    private int updateTimestamp;
    private String notes;
    private TIqcCheckoutQualityDetails tIqcCheckoutQualityDetailsByIqcCheckouQualityDetailsSid;

    @Id
    @Column(name = "bad_phenomenon_sid", nullable = false, insertable = true, updatable = true)
    public int getBadPhenomenonSid() {
        return badPhenomenonSid;
    }

    public void setBadPhenomenonSid(int badPhenomenonSid) {
        this.badPhenomenonSid = badPhenomenonSid;
    }

    @Basic
    @Column(name = "bad_phenomenon_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getBadPhenomenonId() {
        return badPhenomenonId;
    }

    public void setBadPhenomenonId(String badPhenomenonId) {
        this.badPhenomenonId = badPhenomenonId;
    }

    @Basic
    @Column(name = "bad_phenomenon_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getBadPhenomenonName() {
        return badPhenomenonName;
    }

    public void setBadPhenomenonName(String badPhenomenonName) {
        this.badPhenomenonName = badPhenomenonName;
    }

    @Basic
    @Column(name = "bad_phenomenon_amount", nullable = false, insertable = true, updatable = true, length = 255)
    public String getBadPhenomenonAmount() {
        return badPhenomenonAmount;
    }

    public void setBadPhenomenonAmount(String badPhenomenonAmount) {
        this.badPhenomenonAmount = badPhenomenonAmount;
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

        TBadPhenomenonDetails that = (TBadPhenomenonDetails) o;

        if (badPhenomenonSid != that.badPhenomenonSid) return false;
        if (updateTimestamp != that.updateTimestamp) return false;
        if (badPhenomenonAmount != null ? !badPhenomenonAmount.equals(that.badPhenomenonAmount) : that.badPhenomenonAmount != null)
            return false;
        if (badPhenomenonId != null ? !badPhenomenonId.equals(that.badPhenomenonId) : that.badPhenomenonId != null)
            return false;
        if (badPhenomenonName != null ? !badPhenomenonName.equals(that.badPhenomenonName) : that.badPhenomenonName != null)
            return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = badPhenomenonSid;
        result = 31 * result + (badPhenomenonId != null ? badPhenomenonId.hashCode() : 0);
        result = 31 * result + (badPhenomenonName != null ? badPhenomenonName.hashCode() : 0);
        result = 31 * result + (badPhenomenonAmount != null ? badPhenomenonAmount.hashCode() : 0);
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "iqc_checkou_quality_details_sid", referencedColumnName = "iqc_checkou_quality_details_sid", nullable = false)
    public TIqcCheckoutQualityDetails gettIqcCheckoutQualityDetailsByIqcCheckouQualityDetailsSid() {
        return tIqcCheckoutQualityDetailsByIqcCheckouQualityDetailsSid;
    }

    public void settIqcCheckoutQualityDetailsByIqcCheckouQualityDetailsSid(TIqcCheckoutQualityDetails tIqcCheckoutQualityDetailsByIqcCheckouQualityDetailsSid) {
        this.tIqcCheckoutQualityDetailsByIqcCheckouQualityDetailsSid = tIqcCheckoutQualityDetailsByIqcCheckouQualityDetailsSid;
    }
}
