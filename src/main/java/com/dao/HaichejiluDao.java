package com.dao;

import com.entity.HaichejiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaichejiluVO;
import com.entity.view.HaichejiluView;


/**
 * 还车记录
 * 
 * @author 
 * @email 

 */
public interface HaichejiluDao extends BaseMapper<HaichejiluEntity> {
	
	List<HaichejiluVO> selectListVO(@Param("ew") Wrapper<HaichejiluEntity> wrapper);
	
	HaichejiluVO selectVO(@Param("ew") Wrapper<HaichejiluEntity> wrapper);
	
	List<HaichejiluView> selectListView(@Param("ew") Wrapper<HaichejiluEntity> wrapper);

	List<HaichejiluView> selectListView(Pagination page,@Param("ew") Wrapper<HaichejiluEntity> wrapper);
	
	HaichejiluView selectView(@Param("ew") Wrapper<HaichejiluEntity> wrapper);
	
}
