package com.cl.entity.view;

import com.cl.entity.ShuiguofenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 水果分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-15 10:24:12
 */
@TableName("shuiguofenlei")
public class ShuiguofenleiView  extends ShuiguofenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuiguofenleiView(){
	}
 
 	public ShuiguofenleiView(ShuiguofenleiEntity shuiguofenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shuiguofenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
