package cn.entertech.affective.sdk.bean

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class RealtimeSleepData(
    /**
     * 实时睡眠程度,该值越小表示睡眠越深；该值越大表示越接近清醒
     * 实时计算的睡眠程度未经过总体校正，因此在清醒、浅睡与深睡之间没有固定的界限划分，但睡眠程度的相对变化仍可实时反映睡眠状态倾向）
     * 数值范围[0, 100],初始化阶段该值为0，初始化完成后的值有效
     * */
    @SerializedName("sleepDegree") var sleepDegree: Double? = null,
    /**
     * 实时睡眠状态判断,可用于控制其他设备在入睡后切换状态
     * 数值范围{0, 1}；未睡着之前为0，入睡后保持为1；数组中数值范围[-500, 500]，信号质量不佳时全为0
     * */
    @SerializedName("sleepState") var sleepState: Double? = null
) : Serializable {

    override fun toString(): String {
        return "RealtimeSleepData(sleepDegree=$sleepDegree, sleepState=$sleepState)"
    }
}
