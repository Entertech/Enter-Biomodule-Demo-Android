package cn.entertech.affective.sdk.bean.type

import com.google.gson.annotations.SerializedName

enum class BioDataCategory(
    @SerializedName("value")
    var value: String
): IDataType {
    DCEEG_SSVEP("dceeg-ssvep"),
    EEG("eeg"), HR("hr-v2"), MCEEG("mceeg"),
    SCEEG("sceeg"), BCG("bcg"), GYRO("gyro"),
    PEPR("pepr"),
}