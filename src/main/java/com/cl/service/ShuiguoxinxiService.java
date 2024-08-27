package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShuiguoxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShuiguoxinxiView;


/**
 * 水果信息
 *
 * @author 
 * @email 
 * @date 2024-03-15 10:24:12
 */
public interface ShuiguoxinxiService extends IService<ShuiguoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuiguoxinxiView> selectListView(Wrapper<ShuiguoxinxiEntity> wrapper);
   	
   	ShuiguoxinxiView selectView(@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuiguoxinxiEntity> wrapper);
   	

}

