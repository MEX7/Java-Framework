package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "DIC_CountryRegion", schema = "", catalog = "FIMS")
public class DicCountryRegion {
    private String countryRegionId;
    private String countryRegion;
    private String countryRegionEnglishName;
    private String notes;
    private int display;

    @Id
    @Column(name = "country_region_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCountryRegionId() {
        return countryRegionId;
    }

    public void setCountryRegionId(String countryRegionId) {
        this.countryRegionId = countryRegionId;
    }

    @Basic
    @Column(name = "country_region", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    @Basic
    @Column(name = "country_region_english_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCountryRegionEnglishName() {
        return countryRegionEnglishName;
    }

    public void setCountryRegionEnglishName(String countryRegionEnglishName) {
        this.countryRegionEnglishName = countryRegionEnglishName;
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

        DicCountryRegion that = (DicCountryRegion) o;

        if (display != that.display) return false;
        if (countryRegion != null ? !countryRegion.equals(that.countryRegion) : that.countryRegion != null)
            return false;
        if (countryRegionEnglishName != null ? !countryRegionEnglishName.equals(that.countryRegionEnglishName) : that.countryRegionEnglishName != null)
            return false;
        if (countryRegionId != null ? !countryRegionId.equals(that.countryRegionId) : that.countryRegionId != null)
            return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryRegionId != null ? countryRegionId.hashCode() : 0;
        result = 31 * result + (countryRegion != null ? countryRegion.hashCode() : 0);
        result = 31 * result + (countryRegionEnglishName != null ? countryRegionEnglishName.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + display;
        return result;
    }
}
