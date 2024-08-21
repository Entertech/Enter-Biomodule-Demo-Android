package cn.entertech.affective.sdk.bean.report

import java.io.Serializable

class Version(): Serializable{
    var affective: AffectiveVersion?=null
    var biodata: BiodataVersion?=null

    constructor(affective: AffectiveVersion?, biodata: BiodataVersion?):this(){
        this.affective = affective
        this.biodata = biodata
    }
}