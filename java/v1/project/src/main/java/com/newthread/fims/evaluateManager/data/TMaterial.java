package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_Material", schema = "", catalog = "FIMS")
public class TMaterial {
    private String materialId;
    private String materialVersion;
    private String materialName;
    private String materialBarcode;
    private int updateTimestamp;
    private String notes;

    @Id
    @Column(name = "material_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    @Basic
    @Column(name = "material_version", nullable = false, insertable = true, updatable = true, length = 255)
    public String getMaterialVersion() {
        return materialVersion;
    }

    public void setMaterialVersion(String materialVersion) {
        this.materialVersion = materialVersion;
    }

    @Basic
    @Column(name = "material_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    @Basic
    @Column(name = "material_barcode", nullable = false, insertable = true, updatable = true, length = 255)
    public String getMaterialBarcode() {
        return materialBarcode;
    }

    public void setMaterialBarcode(String materialBarcode) {
        this.materialBarcode = materialBarcode;
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

        TMaterial tMaterial = (TMaterial) o;

        if (updateTimestamp != tMaterial.updateTimestamp) return false;
        if (materialBarcode != null ? !materialBarcode.equals(tMaterial.materialBarcode) : tMaterial.materialBarcode != null)
            return false;
        if (materialId != null ? !materialId.equals(tMaterial.materialId) : tMaterial.materialId != null) return false;
        if (materialName != null ? !materialName.equals(tMaterial.materialName) : tMaterial.materialName != null)
            return false;
        if (materialVersion != null ? !materialVersion.equals(tMaterial.materialVersion) : tMaterial.materialVersion != null)
            return false;
        if (notes != null ? !notes.equals(tMaterial.notes) : tMaterial.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialId != null ? materialId.hashCode() : 0;
        result = 31 * result + (materialVersion != null ? materialVersion.hashCode() : 0);
        result = 31 * result + (materialName != null ? materialName.hashCode() : 0);
        result = 31 * result + (materialBarcode != null ? materialBarcode.hashCode() : 0);
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
