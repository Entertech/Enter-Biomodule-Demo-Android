package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BiodataVersion : Serializable {
    var eeg: String? = null

    @SerializedName("hr-v2")
    var hr: String? = null
    var pepr: String? = null
    var tag: String? = null

    constructor(
        eeg: String?,
        hr: String?,
        pepr: String?,
        tag: String?
    ) {
        this.eeg = eeg
        this.hr = hr
        this.pepr = pepr
        this.tag = tag
    }
}