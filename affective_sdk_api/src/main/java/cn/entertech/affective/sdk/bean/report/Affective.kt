package cn.entertech.affective.sdk.bean.report

import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable

@DatabaseTable(tableName = "report_affective_data")
class Affective() : Serializable {
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var arousal: Arousal = Arousal()

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var attention: Attention = Attention()

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var coherence: Coherence = Coherence()

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var pleasure: Pleasure = Pleasure()

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var pressure: Pressure = Pressure()

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var relaxation: Relaxation = Relaxation()

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var meditation: Meditation = Meditation()

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    var sleep: Sleep = Sleep()

    constructor(
        arousal: Arousal,
        attention: Attention,
        coherence: Coherence,
        pleasure: Pleasure,
        pressure: Pressure,
        relaxation: Relaxation,
        meditation: Meditation,
        sleep: Sleep
    ) : this() {
        this.arousal = arousal
        this.attention = attention
        this.coherence = coherence
        this.pleasure = pleasure
        this.pressure = pressure
        this.relaxation = relaxation
        this.meditation = meditation
        this.sleep = sleep
    }
}