package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Coherence() : Serializable {
    /**
     * 全程和谐度有效值（除去无效值0）的均值
     * */
    @SerializedName("coherence_avg")
    var coherenceAvg: Double = 0.0

    @SerializedName("coherence_duration")
    var coherenceDuration: Int? = 0

    @SerializedName("coherence_flag")
    var coherenceFlag: List<Int>? = java.util.ArrayList<Int>()

    /**
     * 全程和谐度记录
     * */
    @SerializedName("coherence_rec")
    var coherenceRec: List<Double> = java.util.ArrayList<Double>()

    constructor(
        coherenceAvg: Double,
        coherenceDuration: Int?,
        coherenceFlag: List<Int>?,
        coherenceRec: List<Double>,

    ) : this() {
        this.coherenceAvg = coherenceAvg
        this.coherenceRec = coherenceRec
        this.coherenceDuration = coherenceDuration
        this.coherenceFlag = coherenceFlag
    }
}