package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_CompanyUser", schema = "", catalog = "FIMS")
public class TCompanyUser {
    private int companyUserSid;
    private int companyIdHash;
    private int userPurview;
    private int updateTimestamp;
    private String notes;
    private TCompany tCompanyByCompanyId;
    private TUser tUserByUserId;

    @Id
    @Column(name = "company_user_sid", nullable = false, insertable = true, updatable = true)
    public int getCompanyUserSid() {
        return companyUserSid;
    }

    public void setCompanyUserSid(int companyUserSid) {
        this.companyUserSid = companyUserSid;
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
    @Column(name = "user_purview", nullable = false, insertable = true, updatable = true)
    public int getUserPurview() {
        return userPurview;
    }

    public void setUserPurview(int userPurview) {
        this.userPurview = userPurview;
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

        TCompanyUser that = (TCompanyUser) o;

        if (companyIdHash != that.companyIdHash) return false;
        if (companyUserSid != that.companyUserSid) return false;
        if (updateTimestamp != that.updateTimestamp) return false;
        if (userPurview != that.userPurview) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyUserSid;
        result = 31 * result + companyIdHash;
        result = 31 * result + userPurview;
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "company_id", nullable = false)
    public TCompany gettCompanyByCompanyId() {
        return tCompanyByCompanyId;
    }

    public void settCompanyByCompanyId(TCompany tCompanyByCompanyId) {
        this.tCompanyByCompanyId = tCompanyByCompanyId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    public TUser gettUserByUserId() {
        return tUserByUserId;
    }

    public void settUserByUserId(TUser tUserByUserId) {
        this.tUserByUserId = tUserByUserId;
    }
}
