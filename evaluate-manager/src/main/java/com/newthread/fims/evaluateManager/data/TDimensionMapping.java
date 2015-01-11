package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_DimensionMapping", schema = "", catalog = "FIMS")
public class TDimensionMapping {
    private int mappingSid;
    private String scope;
    private String actualDimEnglish;
    private String actualDim;
    private String mappingDim;
    private int updateTimestamp;
    private String notes;

    @Id
    @Column(name = "mapping_sid", nullable = false, insertable = true, updatable = true)
    public int getMappingSid() {
        return mappingSid;
    }

    public void setMappingSid(int mappingSid) {
        this.mappingSid = mappingSid;
    }

    @Basic
    @Column(name = "scope", nullable = false, insertable = true, updatable = true, length = 255)
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "actual_dim_english", nullable = false, insertable = true, updatable = true, length = 255)
    public String getActualDimEnglish() {
        return actualDimEnglish;
    }

    public void setActualDimEnglish(String actualDimEnglish) {
        this.actualDimEnglish = actualDimEnglish;
    }

    @Basic
    @Column(name = "actual_dim", nullable = false, insertable = true, updatable = true, length = 255)
    public String getActualDim() {
        return actualDim;
    }

    public void setActualDim(String actualDim) {
        this.actualDim = actualDim;
    }

    @Basic
    @Column(name = "mapping_dim", nullable = false, insertable = true, updatable = true, length = 255)
    public String getMappingDim() {
        return mappingDim;
    }

    public void setMappingDim(String mappingDim) {
        this.mappingDim = mappingDim;
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

        TDimensionMapping that = (TDimensionMapping) o;

        if (mappingSid != that.mappingSid) return false;
        if (updateTimestamp != that.updateTimestamp) return false;
        if (actualDim != null ? !actualDim.equals(that.actualDim) : that.actualDim != null) return false;
        if (actualDimEnglish != null ? !actualDimEnglish.equals(that.actualDimEnglish) : that.actualDimEnglish != null)
            return false;
        if (mappingDim != null ? !mappingDim.equals(that.mappingDim) : that.mappingDim != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mappingSid;
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (actualDimEnglish != null ? actualDimEnglish.hashCode() : 0);
        result = 31 * result + (actualDim != null ? actualDim.hashCode() : 0);
        result = 31 * result + (mappingDim != null ? mappingDim.hashCode() : 0);
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
