package cn.entertech.affective.sdk.bean

import cn.entertech.affective.sdk.bean.report.Data
import cn.entertech.affective.sdk.bean.report.TimePoints
import cn.entertech.affective.sdk.bean.report.Version
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class UploadReportEntity() : Serializable {
    var code: Int = 0
    @SerializedName("data")
    var `data`: Data? = null
    var msg: String = ""
    @SerializedName("report_version")
    var reportVersion: String = "3"
    @SerializedName("session_id")
    var sessionId: String = ""
    var start: String = ""
    @SerializedName("time_points")
    var timePoints: TimePoints? = null
    var user_id: Int = 0
    /**
     * 算法版本
     * */
    var version: Version? = null
    var deviceString: String? = null

    /**
     * 设备的mac地址
     * */
    var MAC: String? = null

    constructor(
        code: Int,
        data: Data?,
        msg: String,
        reportVersion: String,
        sessionId: String,
        start: String,
        timePoints: TimePoints?,
        user_id: Int,
        version: Version?,
        deviceString: String?=null,
        MAC: String?=null
    ) : this() {
        this.code = code
        this.`data` = data
        this.msg = msg
        this.reportVersion = reportVersion
        this.sessionId = sessionId
        this.start = start
        this.timePoints = timePoints
        this.user_id = user_id
        this.version = version
        this.deviceString = deviceString
        this.MAC = MAC
    }
}


