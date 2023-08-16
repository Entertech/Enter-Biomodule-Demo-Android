package cn.entertech.affective.sdk.bean

import cn.entertech.affective.sdk.utils.map
class MCEOGWaveData(
    mapData: Map<Any, Any>
) {
    private val _vEOG_L: Any by map(mapData, "vEOG-L")
    val vEOG_L: List<Double>
        get() {
            return _vEOG_L as List<Double>
        }

    private val _vEOG_R: Any by map(mapData, "vEOG-R")
    val vEOG_R: List<Double>
        get() {
            return _vEOG_R as List<Double>
        }
}