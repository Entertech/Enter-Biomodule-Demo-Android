package cn.entertech.affective.sdk.bean

import cn.entertech.affective.sdk.bean.type.BioDataCategory
import cn.entertech.affective.sdk.bean.type.PhysiologyDataCategory


data class EnterAffectiveConfigProxy(
    val availableBiaCategory: List<BioDataCategory> = BioDataCategory.values().toList(),
    val availableAffectiveCategories: List<PhysiologyDataCategory> = PhysiologyDataCategory.values().toList(),
    val sex: String = "",
    val userId: Int = -1,
    val appSecret: String = "",
    val appKey: String = "",
    val age: Int = 0,
)

