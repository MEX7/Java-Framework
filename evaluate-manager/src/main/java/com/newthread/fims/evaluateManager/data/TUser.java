package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_User", schema = "", catalog = "FIMS")
public class TUser {
    private String userId;
    private String password;
    private String nickName;
    private String contactPhone;
    private String contactAddress;
    private int registTime;
    private boolean emailActivated;
    private int updateTimestamp;
    private String notes;

    @Id
    @Column(name = "user_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nick_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "contact_phone", nullable = true, insertable = true, updatable = true, length = 20)
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Basic
    @Column(name = "contact_address", nullable = true, insertable = true, updatable = true, length = 255)
    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    @Basic
    @Column(name = "regist_time", nullable = false, insertable = true, updatable = true)
    public int getRegistTime() {
        return registTime;
    }

    public void setRegistTime(int registTime) {
        this.registTime = registTime;
    }

    @Basic
    @Column(name = "email_activated", nullable = false, insertable = true, updatable = true)
    public boolean isEmailActivated() {
        return emailActivated;
    }

    public void setEmailActivated(boolean emailActivated) {
        this.emailActivated = emailActivated;
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

        TUser tUser = (TUser) o;

        if (emailActivated != tUser.emailActivated) return false;
        if (registTime != tUser.registTime) return false;
        if (updateTimestamp != tUser.updateTimestamp) return false;
        if (contactAddress != null ? !contactAddress.equals(tUser.contactAddress) : tUser.contactAddress != null)
            return false;
        if (contactPhone != null ? !contactPhone.equals(tUser.contactPhone) : tUser.contactPhone != null) return false;
        if (nickName != null ? !nickName.equals(tUser.nickName) : tUser.nickName != null) return false;
        if (notes != null ? !notes.equals(tUser.notes) : tUser.notes != null) return false;
        if (password != null ? !password.equals(tUser.password) : tUser.password != null) return false;
        if (userId != null ? !userId.equals(tUser.userId) : tUser.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (contactPhone != null ? contactPhone.hashCode() : 0);
        result = 31 * result + (contactAddress != null ? contactAddress.hashCode() : 0);
        result = 31 * result + registTime;
        result = 31 * result + (emailActivated ? 1 : 0);
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
