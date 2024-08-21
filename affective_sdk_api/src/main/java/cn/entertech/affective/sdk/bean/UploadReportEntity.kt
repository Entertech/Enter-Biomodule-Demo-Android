package cn.entertech.affective.sdk.bean

import cn.entertech.affective.sdk.bean.report.Data
import cn.entertech.affective.sdk.bean.report.TimePoints
import cn.entertech.affective.sdk.bean.report.Version
import com.google.gson.annotations.SerializedName
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable

@DatabaseTable(tableName = "report_data")
class UploadReportEntity() : Serializable {
    @DatabaseField()
    var code: Int = 0

    @SerializedName("data")
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var `data`: Data? = null

    @DatabaseField()
    var msg: String = ""

    @SerializedName("report_version")
    @DatabaseField(columnName = "report_version")
    var reportVersion: String = "3"

    @SerializedName("session_id")
    @DatabaseField(columnName = "session_id", id = true)
    var sessionId: String = ""

    @DatabaseField()
    var start: String = ""

    @SerializedName("time_points")
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var timePoints: TimePoints? = null

    @DatabaseField()
    var user_id: Int = 0

    /**
     * 算法版本
     * */
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var version: Version? = null

    @DatabaseField(columnName = "device_string")
    var deviceString: String? = null

    /**
     * 设备的mac地址
     * */
    @DatabaseField(columnName = "mac")
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
        deviceString: String? = null,
        MAC: String? = null
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


