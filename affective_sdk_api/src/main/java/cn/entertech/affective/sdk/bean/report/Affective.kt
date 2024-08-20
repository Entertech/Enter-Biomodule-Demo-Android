package cn.entertech.affective.sdk.bean.report

import java.io.Serializable

class Affective() : Serializable {
    var arousal: Arousal = Arousal()
    var attention: Attention = Attention()
    var coherence: Coherence = Coherence()
    var pleasure: Pleasure = Pleasure()
    var pressure: Pressure = Pressure()
    var relaxation: Relaxation = Relaxation()
    var meditation: Meditation = Meditation()
    var sleep: Sleep = Sleep()

    constructor(
        arousal: Arousal,
        attention: Attention,
        coherence: Coherence,
        pleasure: Pleasure,
        pressure: Pressure,
        relaxation: Relaxation,
        meditation: Meditation,
        sleep: Sleep
    ) : this() {
        this.arousal = arousal
        this.attention = attention
        this.coherence = coherence
        this.pleasure = pleasure
        this.pressure = pressure
        this.relaxation = relaxation
        this.meditation = meditation
        this.sleep = sleep
    }
}