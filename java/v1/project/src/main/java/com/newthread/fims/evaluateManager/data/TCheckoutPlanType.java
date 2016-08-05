package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_CheckoutPlanType", schema = "", catalog = "FIMS")
public class TCheckoutPlanType {
    private String checkoutPlanTypeId;
    private String checkoutPlanType;
    private String notes;

    @Id
    @Column(name = "checkout_plan_type_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCheckoutPlanTypeId() {
        return checkoutPlanTypeId;
    }

    public void setCheckoutPlanTypeId(String checkoutPlanTypeId) {
        this.checkoutPlanTypeId = checkoutPlanTypeId;
    }

    @Basic
    @Column(name = "checkout_plan_type", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCheckoutPlanType() {
        return checkoutPlanType;
    }

    public void setCheckoutPlanType(String checkoutPlanType) {
        this.checkoutPlanType = checkoutPlanType;
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

        TCheckoutPlanType that = (TCheckoutPlanType) o;

        if (checkoutPlanType != null ? !checkoutPlanType.equals(that.checkoutPlanType) : that.checkoutPlanType != null)
            return false;
        if (checkoutPlanTypeId != null ? !checkoutPlanTypeId.equals(that.checkoutPlanTypeId) : that.checkoutPlanTypeId != null)
            return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = checkoutPlanTypeId != null ? checkoutPlanTypeId.hashCode() : 0;
        result = 31 * result + (checkoutPlanType != null ? checkoutPlanType.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
