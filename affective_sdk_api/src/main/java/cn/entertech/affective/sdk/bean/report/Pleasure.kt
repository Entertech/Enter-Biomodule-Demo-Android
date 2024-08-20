package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Pleasure() : Serializable {
    /**
     * 全程愉悦度有效值（除去无效值0）的均值
     * */
    @SerializedName("pleasure_avg")
    var pleasureAvg: Double = 0.0

    /**
     * 全程压力水平记录
     * */
    @SerializedName("pleasure_rec")
    var pleasureRec: List<Double> = java.util.ArrayList<Double>()

    constructor(pleasureAvg: Double, pleasureRec: List<Double>) : this( ) {
        this.pleasureAvg = pleasureAvg
        this.pleasureRec = pleasureRec
    }
}