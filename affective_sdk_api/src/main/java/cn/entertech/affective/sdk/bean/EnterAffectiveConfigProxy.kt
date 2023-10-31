package cn.entertech.affective.sdk.bean

import android.content.Context


data class EnterAffectiveConfigProxy(
    val availableAffectiveBioOrAffectiveDataCategories: List<BioOrAffectiveDataCategory>,
    val availableBiodataBioOrAffectiveDataCategories: List<BioOrAffectiveDataCategory>,
    val sex: String = "",
    val userId: String = "",
    val appSecret: String = "",
    val appKey: String = "",
    val age: Int = 0,
    val context: Context?=null

)

