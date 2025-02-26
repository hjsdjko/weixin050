package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussshuiguoxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussshuiguoxinxiView;


/**
 * 水果信息评论表
 *
 * @author 
 * @email 
 * @date 2024-03-15 10:24:12
 */
public interface DiscussshuiguoxinxiService extends IService<DiscussshuiguoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshuiguoxinxiView> selectListView(Wrapper<DiscussshuiguoxinxiEntity> wrapper);
   	
   	DiscussshuiguoxinxiView selectView(@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshuiguoxinxiEntity> wrapper);
   	

}

