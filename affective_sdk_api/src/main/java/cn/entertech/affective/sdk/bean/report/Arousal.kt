package cn.entertech.affective.sdk.bean.report

import java.io.Serializable

class Arousal() : Serializable {
    /**
     * 全程激活度有效值（除去无效值0）的均值
     * */
    var arousal_avg: Int = 0

    /**
     * 全程激活度记录
     * */
    var arousal_rec: Any = java.util.ArrayList<Double>()

    constructor(arousal_avg: Int, arousal_rec: Any):this() {
        this.arousal_avg = arousal_avg
        this.arousal_rec = arousal_rec
    }
}