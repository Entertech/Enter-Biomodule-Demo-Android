package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Eeg() : Serializable {
    @SerializedName("eeg_alpha_curve")
    var eegAlphaCurve: List<Double> = java.util.ArrayList<Double>()

    @SerializedName("eeg_beta_curve")
    var eegBetaCurve: List<Double> = ArrayList()

    @SerializedName("eeg_delta_curve")
    var eegDeltaCurve: List<Double> = ArrayList()

    @SerializedName("eeg_gamma_curve")
    var eegGammaCurve: List<Double> = ArrayList()

    @SerializedName("eeg_theta_curve")
    var eegThetaCurve: List<Double> = ArrayList()

    @SerializedName("eeg_quality_rec")
    var eegQualityRec: List<Int> = ArrayList()
    
    constructor(
        eegAlphaCurve: List<Double>,
        eegBetaCurve: List<Double>,
        eegDeltaCurve: List<Double>,
        eegGammaCurve: List<Double>,
        eegThetaCurve: List<Double>,
        eegQualityRec: List<Int>
    ):this() {
        this.eegAlphaCurve=eegAlphaCurve
        this.eegBetaCurve=eegBetaCurve
        this.eegDeltaCurve=eegDeltaCurve
        this.eegGammaCurve=eegGammaCurve
        this.eegThetaCurve=eegThetaCurve
        this.eegQualityRec=eegQualityRec
    }
}