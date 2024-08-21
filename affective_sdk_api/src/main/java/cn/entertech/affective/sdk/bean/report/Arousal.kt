package cn.entertech.affective.sdk.bean.report

import com.google.gson.Gson
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable

@DatabaseTable(tableName = "report_affective_arousal_data")
class Arousal() : Serializable {

    private val gson by lazy {
        Gson()
    }

    /**
     * 全程激活度有效值（除去无效值0）的均值
     * */
    @DatabaseField(columnName = "arousal_avg")
    var arousal_avg: Int = 0

    @Transient
    @DatabaseField(columnName = "arousal_rec")
    var arousalRecString: String = ""

    /**
     * 全程激活度记录
     * */
    var arousal_rec: List<Double> = java.util.ArrayList<Double>()

    constructor(arousal_avg: Int, arousal_rec: List<Double>) : this() {
        this.arousal_avg = arousal_avg
        this.arousal_rec = arousal_rec
        this.arousalRecString = gson.toJson(arousal_rec)
    }
}