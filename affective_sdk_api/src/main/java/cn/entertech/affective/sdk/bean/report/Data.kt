package cn.entertech.affective.sdk.bean.report

import cn.entertech.affective.sdk.bean.report.Affective
import cn.entertech.affective.sdk.bean.report.Biodata
import java.io.Serializable

class Data(): Serializable{
    var affective: Affective?=null
    var biodata: Biodata?=null

    constructor(affective: Affective?, biodata: Biodata?):this(){
        this.affective = affective
        this.biodata = biodata
    }
}
