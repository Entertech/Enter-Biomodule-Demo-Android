package cn.entertech.affective.sdk.bean.type

import com.google.gson.annotations.SerializedName

enum class PhysiologyDataCategory(
    @SerializedName("value")
    var value: String
) : IDataType {
    SSVEP_MULTI_CLASSIFY("ssvep-multi-classify"),
    ATTENTION("attention"), RELAXATION("relaxation"),
    PRESSURE("pressure"), PLEASURE("pleasure"),
    AROUSAL("arousal"), SLEEP("sleep"),
    COHERENCE("coherence"), FLOW("meditation");

    companion object {
        fun getDefaultList() = listOf(
            ATTENTION, RELAXATION, PRESSURE, PLEASURE, AROUSAL, SLEEP, COHERENCE, FLOW,
        )
    }


}