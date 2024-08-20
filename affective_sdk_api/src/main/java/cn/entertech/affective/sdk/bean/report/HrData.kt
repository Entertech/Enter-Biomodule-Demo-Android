package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

 class HrData: Serializable{
     @SerializedName("hr_avg")
     val hrAvg: Int? = null
     @SerializedName("hr_max")
     val hrMax: Int? = null
     @SerializedName("hr_min")
     val hrMin: Int? = null
     @SerializedName("hr_rec")
     val hrRec: List<Int> = ArrayList()
     @SerializedName("hrv_avg")
     val hrvAvg: Double? = null
     @SerializedName("hrv_rec")
     val hrvRec: List<Double> = ArrayList()
}