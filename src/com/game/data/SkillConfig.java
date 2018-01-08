package com.game.data;

/**
* j技能表.xlsx(自动生成，请勿编辑！)
*/
public class SkillConfig {
	public int id;//技能ID
	public String name;//技能名称
	public String icon;//图标
	public int vocation;//职业
	public int lev;//等级
	public String desc;//技能描述
	public String logicDataFile;//技能逻辑文件
	public int logicId;//技能逻辑ID
	public int[] attachedBuff;//增加到自身的buff
	public int[] givedBuff;//增加到受击方的buff
	public float[] attackRange;//攻击范围
	public boolean isRegular;//技能类型
	public int skillInteruptPriority;//施法打断优先级
	public int strickenInteruptPriority;//受击打断优先级
	public int hitFactor;//伤害系数
	public int attackCount;//次数
	public float cd;//CD
	public int offsetRefer;//位移参照
	public float followSpeed;//追踪速度
	public float successiveAttackProb;//再次攻击概率
	public int nextSkillId;//下个技能ID
	public int parentSkillId;//父技能id
	public String actionId;//动作ID
	public int[] actionEffectId;//动作特效ID
	public int[] actionEffectGiddyId;//动作特效ID眩晕卡
	public int[] actionEffectFrozenId;//动作特效ID冰冻卡
	public int[] actionEffectFossilId;//动作特效ID石化卡
	public int[] actionEffectPoisonId;//动作特效ID中毒卡
	public int[] actionEffectFlareId;//动作特效ID灼烧卡
	public int[] actionEffectBloodedId;//动作特效ID流血卡
	public int[] actionEffectArmorBreakId;//动作特效ID破甲卡
	public int[] actionEffectPropertyBuffId;//动作特效ID增益BUFF
	public int[] actionEffectEndureId;//动作特效ID霸体卡
	public int[] actionEffectDecreaseCDId;//动作特效ID减CD卡
	public int[] actionEffectCriPercentageId;//动作特效ID暴击几率卡
	public int[] actionEffectDamageRanId;//动作特效ID伤害浮动卡
	public int[] actionEffectVampireId;//动作特效ID吸血卡
	public int[] actionEffectCriDamageId;//动作特效ID暴击伤害卡
	public int[] actionEffectPercentageRaiseId;//动作特效ID百分比提高伤害卡
	public int[] actionEffectDecBloodRecoverId;//动作特效ID减少血量恢复卡
	public int[] actionEffectReflectDamageId;//动作特效ID反伤卡
	public int[] actionEffectMoveSpeedId;//动作特效ID移动速度卡
	public int[] actionEffectDeBuffId;//动作特效ID给目标释放减益效果卡
	public int attackDirection;//技能攻击方向
	public int actionSoundEffect;//动作声效
	public boolean enableMoving;//释放中可移动
	public boolean forbidSwing;//释放中是否禁止转向
	public int audioEffectId;//动作音效ID
	public boolean isUltimateSkill;//是否黑屏大招
	public boolean isCrackSkill;//是否自爆技能
	public boolean isGravityField;//是否重力吸引
	public int waiting;//待机
	public int running;//跑步
	public int attack;//普通攻击
	public int skillOnGround;//技能地面段
	public int strickenGiddy;//眩晕
	public int strickenFallback;//击退
	public int attackInAir;//普攻空中段
	public int skillInAir;//技能空中段
	public int strickenFly;//击飞
	public int strickenShotdown;//击落
	public int lyingDown;//倒地
	public int[] skillParams;//被动技能参数(受击，击飞，击落，起身)
	public int coin;//升级消耗金币
	public int nextId;//升级下个技能ID
	public int setPainting;//立绘特效
	public int duelBossEffect;//砍杀Boss特效
	public int[] duleCameraAnimId;//触发死亡镜头动画ID
}