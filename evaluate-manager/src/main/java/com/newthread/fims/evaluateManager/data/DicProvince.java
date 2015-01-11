package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "DIC_Province", schema = "", catalog = "FIMS")
public class DicProvince {
    private String provinceId;
    private String provinceName;
    private String provinceEnglishName;
    private String notes;
    private int display;

    @Id
    @Column(name = "province_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "province_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Basic
    @Column(name = "province_english_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getProvinceEnglishName() {
        return provinceEnglishName;
    }

    public void setProvinceEnglishName(String provinceEnglishName) {
        this.provinceEnglishName = provinceEnglishName;
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

        DicProvince that = (DicProvince) o;

        if (display != that.display) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (provinceEnglishName != null ? !provinceEnglishName.equals(that.provinceEnglishName) : that.provinceEnglishName != null)
            return false;
        if (provinceId != null ? !provinceId.equals(that.provinceId) : that.provinceId != null) return false;
        if (provinceName != null ? !provinceName.equals(that.provinceName) : that.provinceName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = provinceId != null ? provinceId.hashCode() : 0;
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        result = 31 * result + (provinceEnglishName != null ? provinceEnglishName.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + display;
        return result;
    }
}
