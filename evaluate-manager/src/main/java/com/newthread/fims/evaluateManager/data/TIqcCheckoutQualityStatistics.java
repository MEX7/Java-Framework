package com.newthread.fims.evaluateManager.data;

import javax.persistence.*;

/**
 * Created by MEX on 2015/1/10.
 */
@Entity
@Table(name = "T_IQCCheckoutQualityStatistics", schema = "", catalog = "FIMS")
public class TIqcCheckoutQualityStatistics {
    private int iqcCheckouQualityId;
    private int checkoutTime;
    private String checkoutRecordId;
    private String batchId;
    private String materialBarcode;
    private String materialId;
    private String materialVersion;
    private String vendorId;
    private String vendorShortName;
    private String externalReceiptNo;
    private float submitCheckoutAmountTotal;
    private float sampleAmountTotal;
    private float sampleQualifiedAmountTotal;
    private float sampleUnqualifiedAmountTotal;
    private float inbatchSampleBadPhenomenonTotalTotal;
    private float averageSampleQualifiedRate;
    private float overallSampleQualifiedRate;
    private float averageSampleUnqualifiedRate;
    private float overallSampleUnqualifiedRate;
    private float overallSampleUnqualifiedRatePpm;
    private float batchQualifiedRate;
    private float submitCheckoutAmount;
    private float sampleAmount;
    private float sampleQualifiedAmount;
    private float sampleUnqualifiedAmount;
    private float inbatchSampleBadPhenomenonTotal;
    private float sampleQualifiedRate;
    private float sampleUnqualifiedRate;
    private float sampleUnqualifiedRatePpm;
    private float aql;
    private String determinationResults;
    private String inspectorName;
    private String badPhenomenonId;
    private int updateTimestamp;
    private String notes;

    @Id
    @Column(name = "iqc_checkou_quality_id", nullable = false, insertable = true, updatable = true)
    public int getIqcCheckouQualityId() {
        return iqcCheckouQualityId;
    }

    public void setIqcCheckouQualityId(int iqcCheckouQualityId) {
        this.iqcCheckouQualityId = iqcCheckouQualityId;
    }

    @Basic
    @Column(name = "checkout_time", nullable = false, insertable = true, updatable = true)
    public int getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(int checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    @Basic
    @Column(name = "checkout_record_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCheckoutRecordId() {
        return checkoutRecordId;
    }

    public void setCheckoutRecordId(String checkoutRecordId) {
        this.checkoutRecordId = checkoutRecordId;
    }

    @Basic
    @Column(name = "batch_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
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
    @Column(name = "vendor_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "vendor_short_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getVendorShortName() {
        return vendorShortName;
    }

    public void setVendorShortName(String vendorShortName) {
        this.vendorShortName = vendorShortName;
    }

    @Basic
    @Column(name = "external_receipt_no", nullable = false, insertable = true, updatable = true, length = 255)
    public String getExternalReceiptNo() {
        return externalReceiptNo;
    }

    public void setExternalReceiptNo(String externalReceiptNo) {
        this.externalReceiptNo = externalReceiptNo;
    }

    @Basic
    @Column(name = "submit_checkout_amount_total", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSubmitCheckoutAmountTotal() {
        return submitCheckoutAmountTotal;
    }

    public void setSubmitCheckoutAmountTotal(float submitCheckoutAmountTotal) {
        this.submitCheckoutAmountTotal = submitCheckoutAmountTotal;
    }

    @Basic
    @Column(name = "sample_amount_total", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleAmountTotal() {
        return sampleAmountTotal;
    }

    public void setSampleAmountTotal(float sampleAmountTotal) {
        this.sampleAmountTotal = sampleAmountTotal;
    }

    @Basic
    @Column(name = "sample_qualified_amount_total", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleQualifiedAmountTotal() {
        return sampleQualifiedAmountTotal;
    }

    public void setSampleQualifiedAmountTotal(float sampleQualifiedAmountTotal) {
        this.sampleQualifiedAmountTotal = sampleQualifiedAmountTotal;
    }

    @Basic
    @Column(name = "sample_unqualified_amount_total", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleUnqualifiedAmountTotal() {
        return sampleUnqualifiedAmountTotal;
    }

    public void setSampleUnqualifiedAmountTotal(float sampleUnqualifiedAmountTotal) {
        this.sampleUnqualifiedAmountTotal = sampleUnqualifiedAmountTotal;
    }

    @Basic
    @Column(name = "inbatch_sample_bad_phenomenon_total_total", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getInbatchSampleBadPhenomenonTotalTotal() {
        return inbatchSampleBadPhenomenonTotalTotal;
    }

    public void setInbatchSampleBadPhenomenonTotalTotal(float inbatchSampleBadPhenomenonTotalTotal) {
        this.inbatchSampleBadPhenomenonTotalTotal = inbatchSampleBadPhenomenonTotalTotal;
    }

    @Basic
    @Column(name = "average_sample_qualified_rate", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getAverageSampleQualifiedRate() {
        return averageSampleQualifiedRate;
    }

    public void setAverageSampleQualifiedRate(float averageSampleQualifiedRate) {
        this.averageSampleQualifiedRate = averageSampleQualifiedRate;
    }

    @Basic
    @Column(name = "overall_sample_qualified_rate", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getOverallSampleQualifiedRate() {
        return overallSampleQualifiedRate;
    }

    public void setOverallSampleQualifiedRate(float overallSampleQualifiedRate) {
        this.overallSampleQualifiedRate = overallSampleQualifiedRate;
    }

    @Basic
    @Column(name = "average_sample_unqualified_rate", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getAverageSampleUnqualifiedRate() {
        return averageSampleUnqualifiedRate;
    }

    public void setAverageSampleUnqualifiedRate(float averageSampleUnqualifiedRate) {
        this.averageSampleUnqualifiedRate = averageSampleUnqualifiedRate;
    }

    @Basic
    @Column(name = "overall_sample_unqualified_rate", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getOverallSampleUnqualifiedRate() {
        return overallSampleUnqualifiedRate;
    }

    public void setOverallSampleUnqualifiedRate(float overallSampleUnqualifiedRate) {
        this.overallSampleUnqualifiedRate = overallSampleUnqualifiedRate;
    }

    @Basic
    @Column(name = "overall_sample_unqualified_rate_ppm", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getOverallSampleUnqualifiedRatePpm() {
        return overallSampleUnqualifiedRatePpm;
    }

    public void setOverallSampleUnqualifiedRatePpm(float overallSampleUnqualifiedRatePpm) {
        this.overallSampleUnqualifiedRatePpm = overallSampleUnqualifiedRatePpm;
    }

    @Basic
    @Column(name = "batch_qualified_rate", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getBatchQualifiedRate() {
        return batchQualifiedRate;
    }

    public void setBatchQualifiedRate(float batchQualifiedRate) {
        this.batchQualifiedRate = batchQualifiedRate;
    }

    @Basic
    @Column(name = "submit_checkout_amount", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSubmitCheckoutAmount() {
        return submitCheckoutAmount;
    }

    public void setSubmitCheckoutAmount(float submitCheckoutAmount) {
        this.submitCheckoutAmount = submitCheckoutAmount;
    }

    @Basic
    @Column(name = "sample_amount", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleAmount() {
        return sampleAmount;
    }

    public void setSampleAmount(float sampleAmount) {
        this.sampleAmount = sampleAmount;
    }

    @Basic
    @Column(name = "sample_qualified_amount", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleQualifiedAmount() {
        return sampleQualifiedAmount;
    }

    public void setSampleQualifiedAmount(float sampleQualifiedAmount) {
        this.sampleQualifiedAmount = sampleQualifiedAmount;
    }

    @Basic
    @Column(name = "sample_unqualified_amount", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleUnqualifiedAmount() {
        return sampleUnqualifiedAmount;
    }

    public void setSampleUnqualifiedAmount(float sampleUnqualifiedAmount) {
        this.sampleUnqualifiedAmount = sampleUnqualifiedAmount;
    }

    @Basic
    @Column(name = "inbatch_sample_bad_phenomenon_total", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getInbatchSampleBadPhenomenonTotal() {
        return inbatchSampleBadPhenomenonTotal;
    }

    public void setInbatchSampleBadPhenomenonTotal(float inbatchSampleBadPhenomenonTotal) {
        this.inbatchSampleBadPhenomenonTotal = inbatchSampleBadPhenomenonTotal;
    }

    @Basic
    @Column(name = "sample_qualified_rate", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleQualifiedRate() {
        return sampleQualifiedRate;
    }

    public void setSampleQualifiedRate(float sampleQualifiedRate) {
        this.sampleQualifiedRate = sampleQualifiedRate;
    }

    @Basic
    @Column(name = "sample_unqualified_rate", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleUnqualifiedRate() {
        return sampleUnqualifiedRate;
    }

    public void setSampleUnqualifiedRate(float sampleUnqualifiedRate) {
        this.sampleUnqualifiedRate = sampleUnqualifiedRate;
    }

    @Basic
    @Column(name = "sample_unqualified_rate_ppm", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getSampleUnqualifiedRatePpm() {
        return sampleUnqualifiedRatePpm;
    }

    public void setSampleUnqualifiedRatePpm(float sampleUnqualifiedRatePpm) {
        this.sampleUnqualifiedRatePpm = sampleUnqualifiedRatePpm;
    }

    @Basic
    @Column(name = "AQL", nullable = false, insertable = true, updatable = true, precision = 0)
    public float getAql() {
        return aql;
    }

    public void setAql(float aql) {
        this.aql = aql;
    }

    @Basic
    @Column(name = "determination_results", nullable = false, insertable = true, updatable = true, length = 255)
    public String getDeterminationResults() {
        return determinationResults;
    }

    public void setDeterminationResults(String determinationResults) {
        this.determinationResults = determinationResults;
    }

    @Basic
    @Column(name = "inspector_name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    @Basic
    @Column(name = "bad_phenomenon_id", nullable = false, insertable = true, updatable = true, length = 255)
    public String getBadPhenomenonId() {
        return badPhenomenonId;
    }

    public void setBadPhenomenonId(String badPhenomenonId) {
        this.badPhenomenonId = badPhenomenonId;
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

        TIqcCheckoutQualityStatistics that = (TIqcCheckoutQualityStatistics) o;

        if (Float.compare(that.aql, aql) != 0) return false;
        if (Float.compare(that.averageSampleQualifiedRate, averageSampleQualifiedRate) != 0) return false;
        if (Float.compare(that.averageSampleUnqualifiedRate, averageSampleUnqualifiedRate) != 0) return false;
        if (Float.compare(that.batchQualifiedRate, batchQualifiedRate) != 0) return false;
        if (checkoutTime != that.checkoutTime) return false;
        if (Float.compare(that.inbatchSampleBadPhenomenonTotal, inbatchSampleBadPhenomenonTotal) != 0) return false;
        if (Float.compare(that.inbatchSampleBadPhenomenonTotalTotal, inbatchSampleBadPhenomenonTotalTotal) != 0)
            return false;
        if (iqcCheckouQualityId != that.iqcCheckouQualityId) return false;
        if (Float.compare(that.overallSampleQualifiedRate, overallSampleQualifiedRate) != 0) return false;
        if (Float.compare(that.overallSampleUnqualifiedRate, overallSampleUnqualifiedRate) != 0) return false;
        if (Float.compare(that.overallSampleUnqualifiedRatePpm, overallSampleUnqualifiedRatePpm) != 0) return false;
        if (Float.compare(that.sampleAmount, sampleAmount) != 0) return false;
        if (Float.compare(that.sampleAmountTotal, sampleAmountTotal) != 0) return false;
        if (Float.compare(that.sampleQualifiedAmount, sampleQualifiedAmount) != 0) return false;
        if (Float.compare(that.sampleQualifiedAmountTotal, sampleQualifiedAmountTotal) != 0) return false;
        if (Float.compare(that.sampleQualifiedRate, sampleQualifiedRate) != 0) return false;
        if (Float.compare(that.sampleUnqualifiedAmount, sampleUnqualifiedAmount) != 0) return false;
        if (Float.compare(that.sampleUnqualifiedAmountTotal, sampleUnqualifiedAmountTotal) != 0) return false;
        if (Float.compare(that.sampleUnqualifiedRate, sampleUnqualifiedRate) != 0) return false;
        if (Float.compare(that.sampleUnqualifiedRatePpm, sampleUnqualifiedRatePpm) != 0) return false;
        if (Float.compare(that.submitCheckoutAmount, submitCheckoutAmount) != 0) return false;
        if (Float.compare(that.submitCheckoutAmountTotal, submitCheckoutAmountTotal) != 0) return false;
        if (updateTimestamp != that.updateTimestamp) return false;
        if (badPhenomenonId != null ? !badPhenomenonId.equals(that.badPhenomenonId) : that.badPhenomenonId != null)
            return false;
        if (batchId != null ? !batchId.equals(that.batchId) : that.batchId != null) return false;
        if (checkoutRecordId != null ? !checkoutRecordId.equals(that.checkoutRecordId) : that.checkoutRecordId != null)
            return false;
        if (determinationResults != null ? !determinationResults.equals(that.determinationResults) : that.determinationResults != null)
            return false;
        if (externalReceiptNo != null ? !externalReceiptNo.equals(that.externalReceiptNo) : that.externalReceiptNo != null)
            return false;
        if (inspectorName != null ? !inspectorName.equals(that.inspectorName) : that.inspectorName != null)
            return false;
        if (materialBarcode != null ? !materialBarcode.equals(that.materialBarcode) : that.materialBarcode != null)
            return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;
        if (materialVersion != null ? !materialVersion.equals(that.materialVersion) : that.materialVersion != null)
            return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (vendorId != null ? !vendorId.equals(that.vendorId) : that.vendorId != null) return false;
        if (vendorShortName != null ? !vendorShortName.equals(that.vendorShortName) : that.vendorShortName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iqcCheckouQualityId;
        result = 31 * result + checkoutTime;
        result = 31 * result + (checkoutRecordId != null ? checkoutRecordId.hashCode() : 0);
        result = 31 * result + (batchId != null ? batchId.hashCode() : 0);
        result = 31 * result + (materialBarcode != null ? materialBarcode.hashCode() : 0);
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        result = 31 * result + (materialVersion != null ? materialVersion.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        result = 31 * result + (vendorShortName != null ? vendorShortName.hashCode() : 0);
        result = 31 * result + (externalReceiptNo != null ? externalReceiptNo.hashCode() : 0);
        result = 31 * result + (submitCheckoutAmountTotal != +0.0f ? Float.floatToIntBits(submitCheckoutAmountTotal) : 0);
        result = 31 * result + (sampleAmountTotal != +0.0f ? Float.floatToIntBits(sampleAmountTotal) : 0);
        result = 31 * result + (sampleQualifiedAmountTotal != +0.0f ? Float.floatToIntBits(sampleQualifiedAmountTotal) : 0);
        result = 31 * result + (sampleUnqualifiedAmountTotal != +0.0f ? Float.floatToIntBits(sampleUnqualifiedAmountTotal) : 0);
        result = 31 * result + (inbatchSampleBadPhenomenonTotalTotal != +0.0f ? Float.floatToIntBits(inbatchSampleBadPhenomenonTotalTotal) : 0);
        result = 31 * result + (averageSampleQualifiedRate != +0.0f ? Float.floatToIntBits(averageSampleQualifiedRate) : 0);
        result = 31 * result + (overallSampleQualifiedRate != +0.0f ? Float.floatToIntBits(overallSampleQualifiedRate) : 0);
        result = 31 * result + (averageSampleUnqualifiedRate != +0.0f ? Float.floatToIntBits(averageSampleUnqualifiedRate) : 0);
        result = 31 * result + (overallSampleUnqualifiedRate != +0.0f ? Float.floatToIntBits(overallSampleUnqualifiedRate) : 0);
        result = 31 * result + (overallSampleUnqualifiedRatePpm != +0.0f ? Float.floatToIntBits(overallSampleUnqualifiedRatePpm) : 0);
        result = 31 * result + (batchQualifiedRate != +0.0f ? Float.floatToIntBits(batchQualifiedRate) : 0);
        result = 31 * result + (submitCheckoutAmount != +0.0f ? Float.floatToIntBits(submitCheckoutAmount) : 0);
        result = 31 * result + (sampleAmount != +0.0f ? Float.floatToIntBits(sampleAmount) : 0);
        result = 31 * result + (sampleQualifiedAmount != +0.0f ? Float.floatToIntBits(sampleQualifiedAmount) : 0);
        result = 31 * result + (sampleUnqualifiedAmount != +0.0f ? Float.floatToIntBits(sampleUnqualifiedAmount) : 0);
        result = 31 * result + (inbatchSampleBadPhenomenonTotal != +0.0f ? Float.floatToIntBits(inbatchSampleBadPhenomenonTotal) : 0);
        result = 31 * result + (sampleQualifiedRate != +0.0f ? Float.floatToIntBits(sampleQualifiedRate) : 0);
        result = 31 * result + (sampleUnqualifiedRate != +0.0f ? Float.floatToIntBits(sampleUnqualifiedRate) : 0);
        result = 31 * result + (sampleUnqualifiedRatePpm != +0.0f ? Float.floatToIntBits(sampleUnqualifiedRatePpm) : 0);
        result = 31 * result + (aql != +0.0f ? Float.floatToIntBits(aql) : 0);
        result = 31 * result + (determinationResults != null ? determinationResults.hashCode() : 0);
        result = 31 * result + (inspectorName != null ? inspectorName.hashCode() : 0);
        result = 31 * result + (badPhenomenonId != null ? badPhenomenonId.hashCode() : 0);
        result = 31 * result + updateTimestamp;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
