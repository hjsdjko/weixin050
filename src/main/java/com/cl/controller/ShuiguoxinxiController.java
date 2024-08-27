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
import com.cl.utils.UserBasedCollaborativeFiltering;

import com.cl.entity.ShuiguoxinxiEntity;
import com.cl.entity.view.ShuiguoxinxiView;

import com.cl.service.ShuiguoxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 水果信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 10:24:12
 */
@RestController
@RequestMapping("/shuiguoxinxi")
public class ShuiguoxinxiController {
    @Autowired
    private ShuiguoxinxiService shuiguoxinxiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShuiguoxinxiEntity shuiguoxinxi,
		HttpServletRequest request){
        EntityWrapper<ShuiguoxinxiEntity> ew = new EntityWrapper<ShuiguoxinxiEntity>();

		PageUtils page = shuiguoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuiguoxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShuiguoxinxiEntity shuiguoxinxi, 
		HttpServletRequest request){
        EntityWrapper<ShuiguoxinxiEntity> ew = new EntityWrapper<ShuiguoxinxiEntity>();

		PageUtils page = shuiguoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuiguoxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShuiguoxinxiEntity shuiguoxinxi){
       	EntityWrapper<ShuiguoxinxiEntity> ew = new EntityWrapper<ShuiguoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shuiguoxinxi, "shuiguoxinxi")); 
        return R.ok().put("data", shuiguoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShuiguoxinxiEntity shuiguoxinxi){
        EntityWrapper< ShuiguoxinxiEntity> ew = new EntityWrapper< ShuiguoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shuiguoxinxi, "shuiguoxinxi")); 
		ShuiguoxinxiView shuiguoxinxiView =  shuiguoxinxiService.selectView(ew);
		return R.ok("查询水果信息成功").put("data", shuiguoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShuiguoxinxiEntity shuiguoxinxi = shuiguoxinxiService.selectById(id);
		shuiguoxinxi = shuiguoxinxiService.selectView(new EntityWrapper<ShuiguoxinxiEntity>().eq("id", id));
        return R.ok().put("data", shuiguoxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShuiguoxinxiEntity shuiguoxinxi = shuiguoxinxiService.selectById(id);
		shuiguoxinxi = shuiguoxinxiService.selectView(new EntityWrapper<ShuiguoxinxiEntity>().eq("id", id));
        return R.ok().put("data", shuiguoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShuiguoxinxiEntity shuiguoxinxi, HttpServletRequest request){
    	shuiguoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shuiguoxinxi);
        shuiguoxinxiService.insert(shuiguoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShuiguoxinxiEntity shuiguoxinxi, HttpServletRequest request){
    	shuiguoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shuiguoxinxi);
        shuiguoxinxiService.insert(shuiguoxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShuiguoxinxiEntity shuiguoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shuiguoxinxi);
        shuiguoxinxiService.updateById(shuiguoxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shuiguoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ShuiguoxinxiEntity shuiguoxinxi, HttpServletRequest request,String pre){
        EntityWrapper<ShuiguoxinxiEntity> ew = new EntityWrapper<ShuiguoxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = shuiguoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuiguoxinxi), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 协同算法（基于用户收藏的协同算法）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ShuiguoxinxiEntity shuiguoxinxi, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("tablename", "shuiguoxinxi"));
        Map<String, Map<String, Double>> ratings = new HashMap<>();
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity storeup : storeups) {
                Map<String, Double> userRatings = null;
                if(ratings.containsKey(storeup.getUserid().toString())) {
                    userRatings = ratings.get(storeup.getUserid().toString());
                } else {
                    userRatings = new HashMap<>();
                    ratings.put(storeup.getUserid().toString(), userRatings);
                }

                if(userRatings.containsKey(storeup.getRefid().toString())) {
                    userRatings.put(storeup.getRefid().toString(), userRatings.get(storeup.getRefid().toString())+1.0);
                } else {
                    userRatings.put(storeup.getRefid().toString(), 1.0);
                }
            }
        }
        // 创建协同过滤对象
        UserBasedCollaborativeFiltering filter = new UserBasedCollaborativeFiltering(ratings);

        // 为指定用户推荐物品
        String targetUser = userId;
        int numRecommendations = limit;
        List<String> recommendations = filter.recommendItems(targetUser, numRecommendations);

        // 输出推荐结果
        System.out.println("Recommendations for " + targetUser + ":");
        for (String item : recommendations) {
            System.out.println(item);
        }

        EntityWrapper<ShuiguoxinxiEntity> ew = new EntityWrapper<ShuiguoxinxiEntity>();
        ew.in("id", String.join(",", recommendations));
        if(recommendations!=null && recommendations.size()>0) {
            ew.last("order by FIELD(id, "+"'"+String.join("','", recommendations)+"'"+")");
        }

        PageUtils page = shuiguoxinxiService.queryPage(params, ew);
        List<ShuiguoxinxiEntity> pageList = (List<ShuiguoxinxiEntity>)page.getList();
        if(pageList.size()<limit) {
            int toAddNum = limit-pageList.size();
            ew = new EntityWrapper<ShuiguoxinxiEntity>();
            ew.notIn("id", recommendations);
            ew.orderBy("id", false);
            ew.last("limit "+toAddNum);
            pageList.addAll(shuiguoxinxiService.selectList(ew));
        } else if(pageList.size()>limit) {
            pageList = pageList.subList(0, limit);
        }
        page.setList(pageList);

        return R.ok().put("data", page);
    }







}
