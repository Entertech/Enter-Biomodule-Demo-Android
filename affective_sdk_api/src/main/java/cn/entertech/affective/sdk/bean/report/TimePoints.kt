package cn.entertech.affective.sdk.bean.report

import cn.entertech.affective.sdk.bean.report.AffectiveTimePoints
import cn.entertech.affective.sdk.bean.report.BiodataTimePoints
import java.io.Serializable

class TimePoints : Serializable {
    val affective: AffectiveTimePoints? = null
    val biodata: BiodataTimePoints? = null
}