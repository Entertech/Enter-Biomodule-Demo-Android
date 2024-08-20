package cn.entertech.affective.sdk.bean.report

import java.io.Serializable

class AffectiveTimePoints: Serializable{
    val arousal: List<TimePoint> = ArrayList()
    val attention: List<TimePoint> = ArrayList()
    val coherence: List<TimePoint> = ArrayList()
    val pleasure: List<TimePoint> = ArrayList()
    val pressure: List<TimePoint> = ArrayList()
    val relaxation: List<TimePoint> = ArrayList()
    val meditation: List<TimePoint> = ArrayList()
}