package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

 class Relaxation(): Serializable{
    /**
     * 全程放松度有效值（除去无效值0）的均值
     * */
    @SerializedName("relaxation_avg")
    var relaxationAvg: Double = 0.0
    /**
     * 全程放松度记录
     * */
    @SerializedName("relaxation_rec")
    var relaxationRec: List<Double> = java.util.ArrayList<Double>()

    constructor(relaxationAvg: Double, relaxationRec: List<Double>):this() {
        this.relaxationAvg = relaxationAvg
        this.relaxationRec = relaxationRec
    }
}