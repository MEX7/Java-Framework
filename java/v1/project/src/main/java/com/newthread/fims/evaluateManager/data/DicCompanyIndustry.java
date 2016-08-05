package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "DIC_CompanyIndustry", schema = "", catalog = "FIMS")
public class DicCompanyIndustry {
    private String companyIndustryId;
    private String companyIndustry;
    private String companyIndustryEnglishName;
    private String notes;
    private int display;

    @Id
    @Column(name = "company_industry_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCompanyIndustryId() {
        return companyIndustryId;
    }

    public void setCompanyIndustryId(String companyIndustryId) {
        this.companyIndustryId = companyIndustryId;
    }

    @Basic
    @Column(name = "company_industry", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    @Basic
    @Column(name = "company_industry_english_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCompanyIndustryEnglishName() {
        return companyIndustryEnglishName;
    }

    public void setCompanyIndustryEnglishName(String companyIndustryEnglishName) {
        this.companyIndustryEnglishName = companyIndustryEnglishName;
    }

    @Basic
    @Column(name = "notes", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "display", nullable = false, insertable = true, updatable = true)
    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DicCompanyIndustry that = (DicCompanyIndustry) o;

        if (display != that.display) return false;
        if (companyIndustry != null ? !companyIndustry.equals(that.companyIndustry) : that.companyIndustry != null)
            return false;
        if (companyIndustryEnglishName != null ? !companyIndustryEnglishName.equals(that.companyIndustryEnglishName) : that.companyIndustryEnglishName != null)
            return false;
        if (companyIndustryId != null ? !companyIndustryId.equals(that.companyIndustryId) : that.companyIndustryId != null)
            return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyIndustryId != null ? companyIndustryId.hashCode() : 0;
        result = 31 * result + (companyIndustry != null ? companyIndustry.hashCode() : 0);
        result = 31 * result + (companyIndustryEnglishName != null ? companyIndustryEnglishName.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + display;
        return result;
    }
}
