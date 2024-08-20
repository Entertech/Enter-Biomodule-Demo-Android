package cn.entertech.affective.sdk.bean.report

import com.google.gson.annotations.SerializedName
import java.io.Serializable

 class Sceeg(): Serializable{
    @SerializedName("eeg_alpha_curve")
    var sceegAlphaCurve: List<Double> = java.util.ArrayList<Double>()
    @SerializedName("eeg_beta_curve")
    var scegBetaCurve: List<Double> = java.util.ArrayList<Double>()
    @SerializedName("eeg_delta_curve")
    var sceegDeltaCurve: List<Double> = java.util.ArrayList<Double>()
    @SerializedName("eeg_gamma_curve")
    var sceegGammaCurve: List<Double> = java.util.ArrayList<Double>()
    @SerializedName("eeg_theta_curve")
    var sceegThetaCurve: List<Double> = java.util.ArrayList<Double>()
    @SerializedName("eeg_quality_rec")
    var sceegQualityRec: List<Int> = java.util.ArrayList<Int>()
    
    constructor(
        sceegAlphaCurve: List<Double>,
        scegBetaCurve: List<Double>,
        sceegDeltaCurve: List<Double>,
        sceegGammaCurve: List<Double>,
        sceegThetaCurve: List<Double>,
        sceegQualityRec: List<Int>
    ):this() {
        this.sceegAlphaCurve=sceegAlphaCurve
        this.scegBetaCurve=scegBetaCurve
        this.sceegDeltaCurve=sceegDeltaCurve
        this.sceegGammaCurve=sceegGammaCurve
        this.sceegThetaCurve=sceegThetaCurve
        this.sceegQualityRec=sceegQualityRec
    }
}