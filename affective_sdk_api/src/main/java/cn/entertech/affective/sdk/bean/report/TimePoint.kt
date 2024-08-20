package cn.entertech.affective.sdk.bean.report

import java.io.Serializable

/**
 * 持续的时间段，可能中途会断开
 * */
class TimePoint : Serializable {
    var start: String?= null
    var stop: String?= null
}