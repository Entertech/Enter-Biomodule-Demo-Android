package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PEPR() : Serializable {
    @SerializedName("hr_avg")
    var hrAvg: Int = 0

    @SerializedName("hr_max")
    var hrMax: Int = 0

    @SerializedName("hr_min")
    var hrMin: Int = 0

    @SerializedName("hr_rec")
    var hrRec: List<Int> = ArrayList()

    @SerializedName("hrv_avg")
    var hrvAvg: Double = 0.0

    @SerializedName("hrv_rec")
    var hrvRec: List<Double> = ArrayList()

    @SerializedName("rr_avg")
    var rrAvg: Double = 0.0

    @SerializedName("rr_rec")
    var rrRec: List<Double> = ArrayList()

    @SerializedName("bcg_quality_rec")
    var bcgQualityRec: List<Int> = ArrayList()

    @SerializedName("rw_quality_rec")
    var rwQualityRec: List<Int> = ArrayList()

    constructor(
        hrAvg: Int,
        hrMax: Int,
        hrMin: Int,
        hrRec: List<Int>,
        hrvAvg: Double,
        hrvRec: List<Double>,
        rrAvg: Double,
        rrRec: List<Double>,
        bcgQualityRec: List<Int>,
        rwQualityRec: List<Int>
    ) : this() {
        this.hrAvg = hrAvg
        this.hrMax = hrMax
        this.hrMin = hrMin
        this.hrRec = hrRec
        this.hrvAvg = hrvAvg
        this.hrvRec = hrvRec
        this.rrAvg = rrAvg
        this.rrRec = rrRec
        this.bcgQualityRec = bcgQualityRec
        this.rwQualityRec = rwQualityRec
    }
}