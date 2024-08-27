package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.DiscussshuiguoxinxiDao;
import com.cl.entity.DiscussshuiguoxinxiEntity;
import com.cl.service.DiscussshuiguoxinxiService;
import com.cl.entity.view.DiscussshuiguoxinxiView;

@Service("discussshuiguoxinxiService")
public class DiscussshuiguoxinxiServiceImpl extends ServiceImpl<DiscussshuiguoxinxiDao, DiscussshuiguoxinxiEntity> implements DiscussshuiguoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshuiguoxinxiEntity> page = this.selectPage(
                new Query<DiscussshuiguoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshuiguoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshuiguoxinxiEntity> wrapper) {
		  Page<DiscussshuiguoxinxiView> page =new Query<DiscussshuiguoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussshuiguoxinxiView> selectListView(Wrapper<DiscussshuiguoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshuiguoxinxiView selectView(Wrapper<DiscussshuiguoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
