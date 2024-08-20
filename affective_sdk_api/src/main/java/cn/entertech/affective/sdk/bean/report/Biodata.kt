package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Biodata constructor(): Serializable{
    var sceegData: Sceeg? = null
    var eeg: Eeg? = null
    @SerializedName("hr-v2")
    var hr: HrV2? = null
    @SerializedName("hr")
    var hrData: HrData? = null
    var pepr: PEPR? = null
    var tag: TagData? = null

    constructor(
        sceegData: Sceeg?,
        eeg: Eeg?,
        hr: HrV2?,
        hrData: HrData?,
        pepr: PEPR?,
        tag: TagData?
    ):this() {
        this.sceegData = sceegData
        this.eeg = eeg
        this.hr = hr
        this.hrData = hrData
        this.pepr = pepr
        this.tag = tag
    }
}