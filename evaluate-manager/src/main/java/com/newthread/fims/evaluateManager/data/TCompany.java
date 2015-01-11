package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_Company", schema = "", catalog = "FIMS")
public class TCompany {
    private String companyId;
    private int companyIdHash;
    private String companyName;
    private String companyAddress;
    private String countryRegionId;
    private String countryRegion;
    private String companyProvinceId;
    private String companyProvince;
    private String companyCityId;
    private String companyCity;
    private String companyIndustryId;
    private String companyIndustry;
    private int registTime;
    private int updateTimestamp;
    private String notes;

    @Id
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
    @Column(name = "company_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "company_address", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Basic
    @Column(name = "country_region_id", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCountryRegionId() {
        return countryRegionId;
    }

    public void setCountryRegionId(String countryRegionId) {
        this.countryRegionId = countryRegionId;
    }

    @Basic
    @Column(name = "country_region", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    @Basic
    @Column(name = "company_province_id", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCompanyProvinceId() {
        return companyProvinceId;
    }

    public void setCompanyProvinceId(String companyProvinceId) {
        this.companyProvinceId = companyProvinceId;
    }

    @Basic
    @Column(name = "company_province", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCompanyProvince() {
        return companyProvince;
    }

    public void setCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
    }

    @Basic
    @Column(name = "company_city_id", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCompanyCityId() {
        return companyCityId;
    }

    public void setCompanyCityId(String companyCityId) {
        this.companyCityId = companyCityId;
    }

    @Basic
    @Column(name = "company_city", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    @Basic
    @Column(name = "company_industry_id", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCompanyIndustryId() {
        return companyIndustryId;
    }

    public void setCompanyIndustryId(String companyIndustryId) {
        this.companyIndustryId = companyIndustryId;
    }

    @Basic
    @Column(name = "company_industry", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
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

        TCompany tCompany = (TCompany) o;

        if (companyIdHash != tCompany.companyIdHash) return false;
        if (registTime != tCompany.registTime) return false;
        if (updateTimestamp != tCompany.updateTimestamp) return false;
        if (companyAddress != null ? !companyAddress.equals(tCompany.companyAddress) : tCompany.companyAddress != null)
            return false;
        if (companyCity != null ? !companyCity.equals(tCompany.companyCity) : tCompany.companyCity != null)
            return false;
        if (companyCityId != null ? !companyCityId.equals(tCompany.companyCityId) : tCompany.companyCityId != null)
            return false;
        if (companyId != null ? !companyId.equals(tCompany.companyId) : tCompany.companyId != null) return false;
        if (companyIndustry != null ? !companyIndustry.equals(tCompany.companyIndustry) : tCompany.companyIndustry != null)
            return false;
        if (companyIndustryId != null ? !companyIndustryId.equals(tCompany.companyIndustryId) : tCompany.companyIndustryId != null)
            return false;
        if (companyName != null ? !companyName.equals(tCompany.companyName) : tCompany.companyName != null)
            return false;
        if (companyProvince != null ? !companyProvince.equals(tCompany.companyProvince) : tCompany.companyProvince != null)
            return false;
        if (companyProvinceId != null ? !companyProvinceId.equals(tCompany.companyProvinceId) : tCompany.companyProvinceId != null)
            return false;
        if (countryRegion != null ? !countryRegion.equals(tCompany.countryRegion) : tCompany.countryRegion != null)
            return false;
        if (countryRegionId != null ? !countryRegionId.equals(tCompany.countryRegionId) : tCompany.countryRegionId != null)
            return false;
        if (notes != null ? !notes.equals(tCompany.notes) : tCompany.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyId != null ? companyId.hashCode() : 0;
        result = 31 * result + companyIdHash;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (companyAddress != null ? companyAddress.hashCode() : 0);
        result = 31 * result + (countryRegionId != null ? countryRegionId.hashCode() : 0);
        result = 31 * result + (countryRegion != null ? countryRegion.hashCode() : 0);
        result = 31 * result + (companyProvinceId != null ? companyProvinceId.hashCode() : 0);
        result = 31 * result + (companyProvince != null ? companyProvince.hashCode() : 0);
        result = 31 * result + (companyCityId != null ? companyCityId.hashCode() : 0);
        result = 31 * result + (companyCity != null ? companyCity.hashCode() : 0);
        result = 31 * result + (companyIndustryId != null ? companyIndustryId.hashCode() : 0);
        result = 31 * result + (companyIndustry != null ? companyIndustry.hashCode() : 0);
        result = 31 * result + registTime;
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
