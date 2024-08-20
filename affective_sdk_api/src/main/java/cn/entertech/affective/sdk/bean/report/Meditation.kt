package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

 class Meditation() : Serializable{
     @SerializedName("meditation_avg")
     var meditationAvg: Double = 0.0
     @SerializedName("meditation_rec")
     var meditationRec: List<Double> = java.util.ArrayList<Double>()
     @SerializedName("meditation_tips_rec")
     var meditationTipsRec: List<Int> = java.util.ArrayList<Int>()
     @SerializedName("flow_percent")
     var flowPercent: Double = 0.0
     @SerializedName("flow_duration")
     var flowDuration: Int = 0
     @SerializedName("flow_latency")
     var flowLatency: Int = 0
     @SerializedName("flow_combo")
     var flowCombo: Int = 0
     @SerializedName("flow_depth")
     var flowDepth: Double = 0.0
     @SerializedName("flow_back_num")
     var flowBackNum: Int = 0
     @SerializedName("flow_loss_num")
     var flowLossNum: Int = 0
     
     
     constructor(
         meditationAvg: Double,
         meditationRec: List<Double>,
         meditationTipsRec: List<Int>,
         flowPercent: Double,
         flowDuration: Int,
         flowLatency: Int,
         flowCombo: Int,
         flowDepth: Double,
         flowBackNum: Int,
         flowLossNum: Int
     ):this() {
         this.meditationAvg = meditationAvg
         this.meditationRec = meditationRec
         this.meditationTipsRec = meditationTipsRec
         this.flowPercent = flowPercent
         this.flowDuration = flowDuration
         this.flowLatency = flowLatency
         this.flowCombo = flowCombo
         this.flowDepth = flowDepth
         this.flowBackNum = flowBackNum
         this.flowLossNum = flowLossNum
     }
}