package com.cl.dao;

import com.cl.entity.ShuiguoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShuiguoxinxiView;


/**
 * 水果信息
 * 
 * @author 
 * @email 
 * @date 2024-03-15 10:24:12
 */
public interface ShuiguoxinxiDao extends BaseMapper<ShuiguoxinxiEntity> {
	
	List<ShuiguoxinxiView> selectListView(@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);

	List<ShuiguoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);
	
	ShuiguoxinxiView selectView(@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);
	

}
