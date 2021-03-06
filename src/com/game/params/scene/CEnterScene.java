package com.game.params.scene;

import com.game.params.*;

//进入场景信息(工具自动生成，请勿手动修改！）
public class CEnterScene implements IProtocol {
	public int sceneId;//场景id
	public float x;//坐标点x
	public float z;//坐标点z


	public void decode(BufferBuilder bb) {
		this.sceneId = bb.getInt();
		this.x = bb.getFloat();
		this.z = bb.getFloat();
	}

	public void encode(BufferBuilder bb) {
		bb.putInt(this.sceneId);
		bb.putFloat(this.x);
		bb.putFloat(this.z);
	}
}
