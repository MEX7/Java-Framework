package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "DIC_City", schema = "", catalog = "FIMS")
public class DicCity {
    private String cityId;
    private String cityName;
    private String cityEnglishName;
    private String notes;
    private int display;

    @Id
    @Column(name = "city_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "city_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "city_english_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCityEnglishName() {
        return cityEnglishName;
    }

    public void setCityEnglishName(String cityEnglishName) {
        this.cityEnglishName = cityEnglishName;
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

        DicCity dicCity = (DicCity) o;

        if (display != dicCity.display) return false;
        if (cityEnglishName != null ? !cityEnglishName.equals(dicCity.cityEnglishName) : dicCity.cityEnglishName != null)
            return false;
        if (cityId != null ? !cityId.equals(dicCity.cityId) : dicCity.cityId != null) return false;
        if (cityName != null ? !cityName.equals(dicCity.cityName) : dicCity.cityName != null) return false;
        if (notes != null ? !notes.equals(dicCity.notes) : dicCity.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId != null ? cityId.hashCode() : 0;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (cityEnglishName != null ? cityEnglishName.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + display;
        return result;
    }
}
