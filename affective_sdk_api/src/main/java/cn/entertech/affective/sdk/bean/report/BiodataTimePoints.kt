package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BiodataTimePoints() : Serializable {
    var eeg: List<TimePoint> = ArrayList()

    @SerializedName("hr-v2")
    var hr: List<TimePoint> = ArrayList()
    var pepr: List<TimePoint> = ArrayList()
    var tag: List<TimePoint> = ArrayList()

    constructor(eeg: List<TimePoint>, hr: List<TimePoint>, pepr: List<TimePoint>,tag:List<TimePoint>) : this() {
        this.eeg = eeg
        this.hr = hr
        this.pepr = pepr
        this.tag = tag
    }
}