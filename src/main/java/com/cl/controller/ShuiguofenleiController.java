package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ShuiguofenleiEntity;
import com.cl.entity.view.ShuiguofenleiView;

import com.cl.service.ShuiguofenleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 水果分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 10:24:12
 */
@RestController
@RequestMapping("/shuiguofenlei")
public class ShuiguofenleiController {
    @Autowired
    private ShuiguofenleiService shuiguofenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShuiguofenleiEntity shuiguofenlei,
		HttpServletRequest request){
        EntityWrapper<ShuiguofenleiEntity> ew = new EntityWrapper<ShuiguofenleiEntity>();

		PageUtils page = shuiguofenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuiguofenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShuiguofenleiEntity shuiguofenlei, 
		HttpServletRequest request){
        EntityWrapper<ShuiguofenleiEntity> ew = new EntityWrapper<ShuiguofenleiEntity>();

		PageUtils page = shuiguofenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuiguofenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShuiguofenleiEntity shuiguofenlei){
       	EntityWrapper<ShuiguofenleiEntity> ew = new EntityWrapper<ShuiguofenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shuiguofenlei, "shuiguofenlei")); 
        return R.ok().put("data", shuiguofenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShuiguofenleiEntity shuiguofenlei){
        EntityWrapper< ShuiguofenleiEntity> ew = new EntityWrapper< ShuiguofenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shuiguofenlei, "shuiguofenlei")); 
		ShuiguofenleiView shuiguofenleiView =  shuiguofenleiService.selectView(ew);
		return R.ok("查询水果分类成功").put("data", shuiguofenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShuiguofenleiEntity shuiguofenlei = shuiguofenleiService.selectById(id);
		shuiguofenlei = shuiguofenleiService.selectView(new EntityWrapper<ShuiguofenleiEntity>().eq("id", id));
        return R.ok().put("data", shuiguofenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShuiguofenleiEntity shuiguofenlei = shuiguofenleiService.selectById(id);
		shuiguofenlei = shuiguofenleiService.selectView(new EntityWrapper<ShuiguofenleiEntity>().eq("id", id));
        return R.ok().put("data", shuiguofenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShuiguofenleiEntity shuiguofenlei, HttpServletRequest request){
    	shuiguofenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shuiguofenlei);
        shuiguofenleiService.insert(shuiguofenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShuiguofenleiEntity shuiguofenlei, HttpServletRequest request){
    	shuiguofenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shuiguofenlei);
        shuiguofenleiService.insert(shuiguofenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShuiguofenleiEntity shuiguofenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shuiguofenlei);
        shuiguofenleiService.updateById(shuiguofenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shuiguofenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
