package cn.entertech.affective.sdk.bean

import cn.entertech.affective.sdk.bean.report.Data
import cn.entertech.affective.sdk.bean.report.TimePoints
import cn.entertech.affective.sdk.bean.report.Version
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UploadReportEntity(
    val code: Int,
    @SerializedName("data")
    val `data`: Data? = null,
    val msg: String = "",

    @SerializedName("report_version")
    val reportVersion: String = "3",
    @SerializedName("session_id")
    var sessionId: String = "",
    var start: String = "",
    @SerializedName("time_points")
    var timePoints: TimePoints? = null,
    val user_id: Int = 0,
    /**
     * 算法版本
     * */
    val version: Version? = null,
    var deviceString: String? = null,
    /**
     * 设备的mac地址
     * */
    var MAC: String? = null
) : Serializable {
}


