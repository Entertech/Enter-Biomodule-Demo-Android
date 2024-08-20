package cn.entertech.affective.sdk.bean.report

import java.io.Serializable

class AffectiveVersion() : Serializable {
    var arousal: String? = null
    var attention: String? = null
    var coherence: String? = null
    var pleasure: String? = null
    var pressure: String? = null
    var relaxation: String? = null

    constructor(
        arousal: String?,
        attention: String?,
        coherence: String?,
        pleasure: String?,
        pressure: String?,
        relaxation: String?
    ) : this() {
        this.arousal = arousal
        this.attention = attention
        this.coherence = coherence
        this.pleasure = pleasure
        this.pressure = pressure
        this.relaxation = relaxation
    }
}