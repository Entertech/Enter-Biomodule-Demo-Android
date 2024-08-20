package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class HrV2() : Serializable {
    @SerializedName("hr_avg")
    var hrAvg: Int? = null

    @SerializedName("hr_max")
    var hrMax: Int? = null

    @SerializedName("hr_min")
    var hrMin: Int? = null

    @SerializedName("hr_rec")
    var hrRec: List<Int> = ArrayList()

    @SerializedName("hrv_avg")
    var hrvAvg: Double? = null

    @SerializedName("hrv_rec")
    var hrvRec: List<Double> = ArrayList()
    
    constructor(
        hrAvg: Int?,
        hrMax: Int?,
        hrMin: Int?,
        hrRec: List<Int>,
        hrvAvg: Double?,
        hrvRec: List<Double>
    ):this() {
        this.hrAvg=hrAvg
        this.hrMax=hrMax
        this.hrMin=hrMin
        this.hrRec=hrRec
        this.hrvAvg=hrvAvg
        this.hrvRec=hrvRec
    }
}