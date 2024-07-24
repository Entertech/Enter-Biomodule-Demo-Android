package cn.entertech.affective.sdk.bean.report

import java.io.Serializable

/**
 * @param tag_position: the position of the tag, it can be left or right
 * */
class TagData : Serializable {
    companion object {
        const val TAG_POSITION_LEFT = "left"
        const val TAG_POSITION_RIGHT = "right"
        const val TAG_POSITION_UNKNOWN = ""
    }
    var hr_avg: Int = 0
    var hr_max: Int = Int.MIN_VALUE
    var hr_min: Int = Int.MAX_VALUE
    var hr_rec: List<Int> = emptyList()
    var hrv_avg: Double = 0.0
    var hrv_rec: List<Double> = emptyList()
    var rr_avg: Double = 0.0
    var rr_rec: List<Double> = emptyList()
    var rri_quality_rec: List<Int> = emptyList()
    var tag_position: String = TAG_POSITION_UNKNOWN
}