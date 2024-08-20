package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BiodataTimePoints : Serializable{
    val eeg: List<TimePoint> = ArrayList()
    @SerializedName("hr-v2")
    val hr: List<TimePoint> = ArrayList()
    val pepr: List<TimePoint> = ArrayList()
}