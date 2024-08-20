package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Pressure() : Serializable {
    @SerializedName("pressure_avg")
    var pressureAvg: Double = 0.0

    @SerializedName("pressure_rec")
    var pressureRec: List<Double> = java.util.ArrayList<Double>()

    constructor(pressureAvg: Double, pressureRec: List<Double>):this() {
        this.pressureAvg = pressureAvg
        this.pressureRec = pressureRec
    }
}