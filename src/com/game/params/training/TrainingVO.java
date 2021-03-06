package com.game.params.training;

import java.util.List;
import java.util.ArrayList;
import com.game.params.*;

//英雄试炼信息(工具自动生成，请勿手动修改！）
public class TrainingVO implements IProtocol {
	public int index;//当前关卡索引,从0开始
	public int hp;//血量百分比
	public List<Integer> treasureBox;//获得却还没有找开的箱子的索引
	public List<TrainOpponentVO> opponents;//关卡怪列表


	public void decode(BufferBuilder bb) {
		this.index = bb.getInt();
		this.hp = bb.getInt();
		this.treasureBox = bb.getIntList();
		
        if (bb.getNullFlag())
            this.opponents = null;
        else {
            int length = bb.getInt();
            this.opponents = new ArrayList<TrainOpponentVO>();
            for (int i = 0; i < length; i++)
            {
                //如果元素不够先创建一个，Java泛型创建对象，性能？
                boolean isNull = bb.getNullFlag();

                //如果不是null就解析
                if(isNull)
                {
                    this.opponents.add(null);
                }
                else
                {
                    TrainOpponentVO instance = new TrainOpponentVO();
                    instance.decode(bb);
                    this.opponents.add(instance);
                }

            }
        }
	}

	public void encode(BufferBuilder bb) {
		bb.putInt(this.index);
		bb.putInt(this.hp);
		bb.putIntList(this.treasureBox);
		bb.putProtocolVoList(this.opponents);
	}
}
