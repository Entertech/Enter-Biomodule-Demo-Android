package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Attention() : Serializable {
    /**
     * 全程注意力有效值（除去无效值0）的均值
     * */
    @SerializedName("attention_avg")
    var attentionAvg: Double = 0.0

    /**
     * 全程注意力记录
     * */
    @SerializedName("attention_rec")
    var attentionRec: List<Double> = java.util.ArrayList<Double>()

    constructor(attentionAvg: Double, attentionRec: List<Double>) : this() {
        this.attentionAvg = attentionAvg
        this.attentionRec = attentionRec
    }

}