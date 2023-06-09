package com.entity.view;

import com.entity.HaichejiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 还车记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 

 */
@TableName("haichejilu")
public class HaichejiluView  extends HaichejiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HaichejiluView(){
	}
 
 	public HaichejiluView(HaichejiluEntity haichejiluEntity){
 	try {
			BeanUtils.copyProperties(this, haichejiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
