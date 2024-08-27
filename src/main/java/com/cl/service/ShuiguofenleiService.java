package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShuiguofenleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShuiguofenleiView;


/**
 * 水果分类
 *
 * @author 
 * @email 
 * @date 2024-03-15 10:24:12
 */
public interface ShuiguofenleiService extends IService<ShuiguofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuiguofenleiView> selectListView(Wrapper<ShuiguofenleiEntity> wrapper);
   	
   	ShuiguofenleiView selectView(@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuiguofenleiEntity> wrapper);
   	

}

