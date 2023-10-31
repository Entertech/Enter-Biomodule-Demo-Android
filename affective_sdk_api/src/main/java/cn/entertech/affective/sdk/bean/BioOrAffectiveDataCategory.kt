package cn.entertech.affective.sdk.bean

import com.google.gson.annotations.SerializedName

enum class BioOrAffectiveDataCategory(@SerializedName("value") var value: String) {
    EEG("eeg"), HR("hr-v2"), MCEEG("mceeg"), 
    BCG("bcg"), GYRO("gyro"), PEPR("pepr"), 
    DCEEG_SSVEP("dceeg-ssvep"), SSVEP_MULTI_CLASSIFY("ssvep-multi-classify"),
    ATTENTION("attention"), RELAXATION("relaxation"),
    PRESSURE("pressure"), PLEASURE("pleasure"), AROUSAL("arousal"),
    SLEEP("sleep"), COHERENCE("coherence"), FLOW("meditation")
}