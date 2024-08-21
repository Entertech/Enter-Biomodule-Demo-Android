package cn.entertech.affective.sdk.bean.report

import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable

@DatabaseTable(tableName = "report_detail_data")
class Data() : Serializable {

    @Transient
    @DatabaseField(id = true)
    var dataId:Int=0

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var affective: Affective? = null

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var biodata: Biodata? = null

    constructor(affective: Affective?, biodata: Biodata?) : this() {
        this.affective = affective
        this.biodata = biodata
    }
}
