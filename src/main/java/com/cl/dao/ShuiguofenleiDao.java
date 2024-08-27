package com.cl.dao;

import com.cl.entity.ShuiguofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShuiguofenleiView;


/**
 * 水果分类
 * 
 * @author 
 * @email 
 * @date 2024-03-15 10:24:12
 */
public interface ShuiguofenleiDao extends BaseMapper<ShuiguofenleiEntity> {
	
	List<ShuiguofenleiView> selectListView(@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);

	List<ShuiguofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);
	
	ShuiguofenleiView selectView(@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);
	

}
