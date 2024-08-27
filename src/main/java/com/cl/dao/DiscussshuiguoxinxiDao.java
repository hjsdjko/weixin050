package com.cl.dao;

import com.cl.entity.DiscussshuiguoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussshuiguoxinxiView;


/**
 * 水果信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-15 10:24:12
 */
public interface DiscussshuiguoxinxiDao extends BaseMapper<DiscussshuiguoxinxiEntity> {
	
	List<DiscussshuiguoxinxiView> selectListView(@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);

	List<DiscussshuiguoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);
	
	DiscussshuiguoxinxiView selectView(@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);
	

}
