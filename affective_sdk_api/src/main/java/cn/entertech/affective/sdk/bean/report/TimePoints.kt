package cn.entertech.affective.sdk.bean.report

import java.io.Serializable

class TimePoints() : Serializable {
    var affective: AffectiveTimePoints? = null
    var biodata: BiodataTimePoints? = null

    constructor(affective: AffectiveTimePoints?, biodata: BiodataTimePoints?) : this() {
        this.affective = affective
        this.biodata = biodata

    }
}