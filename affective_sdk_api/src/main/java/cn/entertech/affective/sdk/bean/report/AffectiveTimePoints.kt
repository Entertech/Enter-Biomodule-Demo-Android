package cn.entertech.affective.sdk.bean.report

import java.io.Serializable

class AffectiveTimePoints(): Serializable{
    var arousal: List<TimePoint> = ArrayList()
    var attention: List<TimePoint> = ArrayList()
    var coherence: List<TimePoint> = ArrayList()
    var pleasure: List<TimePoint> = ArrayList()
    var pressure: List<TimePoint> = ArrayList()
    var relaxation: List<TimePoint> = ArrayList()
    var meditation: List<TimePoint> = ArrayList()
    constructor(
        arousal: List<TimePoint>,
        attention: List<TimePoint>,
        coherence: List<TimePoint>,
        pleasure: List<TimePoint>,
        pressure: List<TimePoint>,
        relaxation: List<TimePoint>,
        meditation: List<TimePoint>
    ) : this() {
        this.arousal = arousal
        this.attention = attention
        this.coherence = coherence
        this.pleasure = pleasure
        this.pressure = pressure
        this.relaxation = relaxation
        this.meditation = meditation
    }
    
}