(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-shuiguoxinxi-add-or-update"],{"1b04":function(e,i,t){"use strict";var r=t("ebef"),n=t.n(r);n.a},"25fb":function(e,i,t){"use strict";t.r(i);var r=t("d6f6"),n=t.n(r);for(var o in r)"default"!==o&&function(e){t.d(i,e,(function(){return r[e]}))}(o);i["default"]=n.a},"427e":function(e,i,t){"use strict";t.r(i);var r=t("7c22"),n=t("25fb");for(var o in n)"default"!==o&&function(e){t.d(i,e,(function(){return n[e]}))}(o);t("1b04");var u,a=t("f0c5"),s=Object(a["a"])(n["default"],r["b"],r["c"],!1,null,"21f7b37b",null,!1,r["a"],u);i["default"]=s.exports},"7c22":function(e,i,t){"use strict";var r={"xia-editor":t("064f").default,"w-picker":t("e2b1").default},n=function(){var e=this,i=e.$createElement,t=e._self._c||i;return t("v-uni-view",{staticClass:"content"},[t("v-uni-view",{style:{width:"100%",padding:"0 0 0 0",position:"relative",background:"#ff993310",height:"auto"}},[t("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx 24rpx 24rpx 24rpx",background:"none",display:"block",height:"auto"}},[t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("水果名称")]),t("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.shuiguomingcheng,placeholder:"水果名称"},model:{value:e.ruleForm.shuiguomingcheng,callback:function(i){e.$set(e.ruleForm,"shuiguomingcheng",i)},expression:"ruleForm.shuiguomingcheng"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.tupianTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("图片")]),e.ruleForm.tupian?t("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.tupian.split(",")[0],mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),t("v-uni-view",{staticClass:"select",style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("水果分类")]),t("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.shuiguofenleiIndex,range:e.shuiguofenleiOptions},on:{change:function(i){arguments[0]=i=e.$handleEvent(i),e.shuiguofenleiChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{border:"2rpx solid #eeeeee",padding:"0 20rpx",color:"#666666",background:"#ffffff",width:"100%",lineHeight:"64rpx",fontSize:"28rpx"}},[e._v(e._s(e.ruleForm.shuiguofenlei?e.ruleForm.shuiguofenlei:"请选择水果分类"))])],1)],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("规格")]),t("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.guige,placeholder:"规格"},model:{value:e.ruleForm.guige,callback:function(i){e.$set(e.ruleForm,"guige",i)},expression:"ruleForm.guige"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("价格")]),t("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.jiage,placeholder:"价格"},model:{value:e.ruleForm.jiage,callback:function(i){e.$set(e.ruleForm,"jiage",i)},expression:"ruleForm.jiage"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("数量")]),t("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.shuliang,placeholder:"数量"},model:{value:e.ruleForm.shuliang,callback:function(i){e.$set(e.ruleForm,"shuliang",i)},expression:"ruleForm.shuliang"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("保质期")]),t("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.baozhiqi,placeholder:"保质期"},model:{value:e.ruleForm.baozhiqi,callback:function(i){e.$set(e.ruleForm,"baozhiqi",i)},expression:"ruleForm.baozhiqi"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("收藏数量")]),t("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.storeupnum,placeholder:"收藏数量"},model:{value:e.ruleForm.storeupnum,callback:function(i){e.$set(e.ruleForm,"storeupnum",i)},expression:"ruleForm.storeupnum"}})],1),t("v-uni-view",{style:{padding:"12rpx 0 12rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",borderWidth:"0 0 0px 0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",fontWeight:"500"}},[e._v("水果详情")]),t("xia-editor",{ref:"editor",style:{minHeight:"320rpx",border:"2rpx solid #eeeeee",padding:"20rpx",color:"#666666",background:"#ffffff",width:"100%",height:"auto"},attrs:{placeholder:"水果详情"},on:{editorChange:function(i){arguments[0]=i=e.$handleEvent(i),e.shuiguoxiangqingChange.apply(void 0,arguments)}},model:{value:e.ruleForm.shuiguoxiangqing,callback:function(i){e.$set(e.ruleForm,"shuiguoxiangqing",i)},expression:"ruleForm.shuiguoxiangqing"}})],1),t("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[t("v-uni-button",{staticClass:"bg-red",style:{border:"0px solid #eeeeee",padding:"0 0 0 0",margin:"0 4% 0 0",color:"#fff",borderRadius:"40rpx",background:"#ff9933",width:"30%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1),t("w-picker",{ref:"clicktime",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(i){arguments[0]=i=e.$handleEvent(i),e.clicktimeConfirm.apply(void 0,arguments)}}})],1)],1)},o=[];t.d(i,"b",(function(){return n})),t.d(i,"c",(function(){return o})),t.d(i,"a",(function(){return r}))},b382:function(e,i,t){var r=t("24fb");i=r(!1),i.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-21f7b37b]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=i},d6f6:function(e,i,t){"use strict";var r=t("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,t("a481"),t("c5f6"),t("f559"),t("456d"),t("ac6a"),t("28a5"),t("96cf");var n=r(t("3b8d")),o=r(t("e2b1")),u=r(t("064f")),a=r(t("bd56")),s={data:function(){return{cross:"",ruleForm:{shuiguomingcheng:"",tupian:"",shuiguofenlei:"",guige:"",jiage:"",shuliang:"",baozhiqi:"",shuiguoxiangqing:"",storeupnum:"0"},shuiguofenleiOptions:[],shuiguofenleiIndex:0,user:{},ro:{shuiguomingcheng:!1,tupian:!1,shuiguofenlei:!1,guige:!1,jiage:!1,shuliang:!1,baozhiqi:!1,shuiguoxiangqing:!1,storeupnum:!1,clicktime:!1}}},components:{wPicker:o.default,xiaEditor:u.default,multipleSelect:a.default},watch:{},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(i){var t,r,n,o;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:return r=e.sent,this.user=r.data,e.next=7,this.$api.option("shuiguofenlei","shuiguofenlei",{});case 7:if(r=e.sent,this.shuiguofenleiOptions=r.data,this.shuiguofenleiOptions.unshift("请选择水果分类"),this.ruleForm.userid=uni.getStorageSync("userid"),i.refid&&(this.ruleForm.refid=i.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!i.id){e.next=18;break}return this.ruleForm.id=i.id,e.next=16,this.$api.info("shuiguoxinxi",this.ruleForm.id);case 16:r=e.sent,this.ruleForm=r.data;case 18:if(this.cross=i.cross,!i.cross){e.next=66;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 22:if((e.t1=e.t0()).done){e.next=66;break}if(o=e.t1.value,"shuiguomingcheng"!=o){e.next=28;break}return this.ruleForm.shuiguomingcheng=n[o],this.ro.shuiguomingcheng=!0,e.abrupt("continue",22);case 28:if("tupian"!=o){e.next=32;break}return this.ruleForm.tupian=n[o].split(",")[0],this.ro.tupian=!0,e.abrupt("continue",22);case 32:if("shuiguofenlei"!=o){e.next=36;break}return this.ruleForm.shuiguofenlei=n[o],this.ro.shuiguofenlei=!0,e.abrupt("continue",22);case 36:if("guige"!=o){e.next=40;break}return this.ruleForm.guige=n[o],this.ro.guige=!0,e.abrupt("continue",22);case 40:if("jiage"!=o){e.next=44;break}return this.ruleForm.jiage=n[o],this.ro.jiage=!0,e.abrupt("continue",22);case 44:if("shuliang"!=o){e.next=48;break}return this.ruleForm.shuliang=n[o],this.ro.shuliang=!0,e.abrupt("continue",22);case 48:if("baozhiqi"!=o){e.next=52;break}return this.ruleForm.baozhiqi=n[o],this.ro.baozhiqi=!0,e.abrupt("continue",22);case 52:if("shuiguoxiangqing"!=o){e.next=56;break}return this.ruleForm.shuiguoxiangqing=n[o],this.ro.shuiguoxiangqing=!0,e.abrupt("continue",22);case 56:if("storeupnum"!=o){e.next=60;break}return this.ruleForm.storeupnum=n[o],this.ro.storeupnum=!0,e.abrupt("continue",22);case 60:if("clicktime"!=o){e.next=64;break}return this.ruleForm.clicktime=n[o],this.ro.clicktime=!0,e.abrupt("continue",22);case 64:e.next=22;break;case 66:this.styleChange(),this.$forceUpdate();case 68:case"end":return e.stop()}}),e,this)})));function i(i){return e.apply(this,arguments)}return i}(),methods:{shuiguoxiangqingChange:function(e){this.ruleForm.shuiguoxiangqing=e},styleChange:function(){this.$nextTick((function(){document.querySelectorAll(".radioText").forEach((function(e){e.removeAttribute("style");var i={color:"#666666"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".radioTextActive").forEach((function(e){e.removeAttribute("style");var i={color:"#ff9933"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".checkText").forEach((function(e){e.removeAttribute("style");var i={color:"#666666"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".checkTextActive").forEach((function(e){e.removeAttribute("style");var i={color:"#ff9933"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".uni-radio-input").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #999999",borderRadius:"0",background:"#ffffff"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".uni-radio-input-checked").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #ff9933",borderRadius:"0",color:"#ff9933",background:"#ffffff"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".uni-checkbox-input").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #999999",borderRadius:"0",background:"#ffffff"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".uni-checkbox-input-checked").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #ff9933",color:"#ff9933",borderRadius:"0",background:"#ffffff"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))}))}))},clicktimeConfirm:function(e){console.log(e),this.ruleForm.clicktime=e.result,this.$forceUpdate()},shuiguofenleiChange:function(e){this.shuiguofenleiIndex=e.target.value,this.ruleForm.shuiguofenlei=this.shuiguofenleiOptions[this.shuiguofenleiIndex]},tupianTap:function(){var e=this;this.$api.upload((function(i){e.ruleForm.tupian="file/"+i.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var i,t,r,n,o,u,a,s,l,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.shuiguomingcheng){e.next=3;break}return this.$utils.msg("水果名称不能为空"),e.abrupt("return");case 3:if(this.ruleForm.shuiguofenlei){e.next=6;break}return this.$utils.msg("水果分类不能为空"),e.abrupt("return");case 6:if(!this.ruleForm.jiage||this.$validate.isNumber(this.ruleForm.jiage)){e.next=9;break}return this.$utils.msg("价格应输入数字"),e.abrupt("return");case 9:if(!this.ruleForm.shuliang||this.$validate.isIntNumer(this.ruleForm.shuliang)){e.next=12;break}return this.$utils.msg("数量应输入整数"),e.abrupt("return");case 12:if(!this.ruleForm.storeupnum||this.$validate.isIntNumer(this.ruleForm.storeupnum)){e.next=15;break}return this.$utils.msg("收藏数量应输入整数"),e.abrupt("return");case 15:if(!this.cross){e.next=32;break}if(uni.setStorageSync("crossCleanType",!0),o=uni.getStorageSync("statusColumnName"),u=uni.getStorageSync("statusColumnValue"),""==o){e.next=32;break}if(i||(i=uni.getStorageSync("crossObj")),o.startsWith("[")){e.next=28;break}for(a in i)a==o&&(i[a]=u);return s=uni.getStorageSync("crossTable"),e.next=26,this.$api.update("".concat(s),i);case 26:e.next=32;break;case 28:t=Number(uni.getStorageSync("userid")),r=i["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 32:if(!r||!t){e.next=55;break}return this.ruleForm.crossuserid=t,this.ruleForm.crossrefid=r,l={page:1,limit:10,crossuserid:t,crossrefid:r},e.next=38,this.$api.list("shuiguoxinxi",l);case 38:if(c=e.sent,!(c.data.total>=n)){e.next=45;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 45:if(!this.ruleForm.id){e.next=50;break}return e.next=48,this.$api.update("shuiguoxinxi",this.ruleForm);case 48:e.next=52;break;case 50:return e.next=52,this.$api.add("shuiguoxinxi",this.ruleForm);case 52:this.$utils.msgBack("提交成功");case 53:e.next=63;break;case 55:if(!this.ruleForm.id){e.next=60;break}return e.next=58,this.$api.update("shuiguoxinxi",this.ruleForm);case 58:e.next=62;break;case 60:return e.next=62,this.$api.add("shuiguoxinxi",this.ruleForm);case 62:this.$utils.msgBack("提交成功");case 63:case"end":return e.stop()}}),e,this)})));function i(){return e.apply(this,arguments)}return i}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var i=new Date,t=i.getFullYear(),r=i.getMonth()+1,n=i.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,n=n>9?n:"0"+n,"".concat(t,"-").concat(r,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};i.default=s},ebef:function(e,i,t){var r=t("b382");"string"===typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);var n=t("4f06").default;n("2ff0b037",r,!0,{sourceMap:!1,shadowMode:!1})}}]);