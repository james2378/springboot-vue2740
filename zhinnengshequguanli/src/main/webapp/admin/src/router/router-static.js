import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import anbaoweihu from '@/views/modules/anbaoweihu/list'
    import chewei from '@/views/modules/chewei/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import gonggao from '@/views/modules/gonggao/list'
    import gonggongchangsuo from '@/views/modules/gonggongchangsuo/list'
    import gonggongchangsuoCollection from '@/views/modules/gonggongchangsuoCollection/list'
    import gonggongchangsuoLiuyan from '@/views/modules/gonggongchangsuoLiuyan/list'
    import gonggongchangsuoOrder from '@/views/modules/gonggongchangsuoOrder/list'
    import liuyan from '@/views/modules/liuyan/list'
    import news from '@/views/modules/news/list'
    import shequhuodong from '@/views/modules/shequhuodong/list'
    import shequhuodongCollection from '@/views/modules/shequhuodongCollection/list'
    import shequhuodongLiuyan from '@/views/modules/shequhuodongLiuyan/list'
    import shequhuodongOrder from '@/views/modules/shequhuodongOrder/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhengwufuwu from '@/views/modules/zhengwufuwu/list'
    import config from '@/views/modules/config/list'
    import dictionaryAnbaoweihu from '@/views/modules/dictionaryAnbaoweihu/list'
    import dictionaryChewei from '@/views/modules/dictionaryChewei/list'
    import dictionaryForum from '@/views/modules/dictionaryForum/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryGonggongchangsuo from '@/views/modules/dictionaryGonggongchangsuo/list'
    import dictionaryGonggongchangsuoCollection from '@/views/modules/dictionaryGonggongchangsuoCollection/list'
    import dictionaryGonggongchangsuoOrderYesno from '@/views/modules/dictionaryGonggongchangsuoOrderYesno/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryShequhuodong from '@/views/modules/dictionaryShequhuodong/list'
    import dictionaryShequhuodongCollection from '@/views/modules/dictionaryShequhuodongCollection/list'
    import dictionaryShequhuodongOrderYesno from '@/views/modules/dictionaryShequhuodongOrderYesno/list'
    import dictionaryShijianduan from '@/views/modules/dictionaryShijianduan/list'
    import dictionaryZhengwufuwu from '@/views/modules/dictionaryZhengwufuwu/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryAnbaoweihu',
        name: '安保维护类型',
        component: dictionaryAnbaoweihu
    }
    ,{
        path: '/dictionaryChewei',
        name: '社区车位类型',
        component: dictionaryChewei
    }
    ,{
        path: '/dictionaryForum',
        name: '帖子类型',
        component: dictionaryForum
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryGonggongchangsuo',
        name: '公共场所类型',
        component: dictionaryGonggongchangsuo
    }
    ,{
        path: '/dictionaryGonggongchangsuoCollection',
        name: '收藏表类型',
        component: dictionaryGonggongchangsuoCollection
    }
    ,{
        path: '/dictionaryGonggongchangsuoOrderYesno',
        name: '审核状态',
        component: dictionaryGonggongchangsuoOrderYesno
    }
    ,{
        path: '/dictionaryNews',
        name: '新闻类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryShequhuodong',
        name: '社区活动类型',
        component: dictionaryShequhuodong
    }
    ,{
        path: '/dictionaryShequhuodongCollection',
        name: '收藏表类型',
        component: dictionaryShequhuodongCollection
    }
    ,{
        path: '/dictionaryShequhuodongOrderYesno',
        name: '审核状态',
        component: dictionaryShequhuodongOrderYesno
    }
    ,{
        path: '/dictionaryShijianduan',
        name: '时间段',
        component: dictionaryShijianduan
    }
    ,{
        path: '/dictionaryZhengwufuwu',
        name: '政务服务类型',
        component: dictionaryZhengwufuwu
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/anbaoweihu',
        name: '安保维护',
        component: anbaoweihu
      }
    ,{
        path: '/chewei',
        name: '社区车位',
        component: chewei
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/gonggao',
        name: '公告',
        component: gonggao
      }
    ,{
        path: '/gonggongchangsuo',
        name: '公共场所',
        component: gonggongchangsuo
      }
    ,{
        path: '/gonggongchangsuoCollection',
        name: '公共场所收藏',
        component: gonggongchangsuoCollection
      }
    ,{
        path: '/gonggongchangsuoLiuyan',
        name: '公共场所留言',
        component: gonggongchangsuoLiuyan
      }
    ,{
        path: '/gonggongchangsuoOrder',
        name: '公共场所预约',
        component: gonggongchangsuoOrder
      }
    ,{
        path: '/liuyan',
        name: '留言板',
        component: liuyan
      }
    ,{
        path: '/news',
        name: '新闻信息',
        component: news
      }
    ,{
        path: '/shequhuodong',
        name: '社区活动',
        component: shequhuodong
      }
    ,{
        path: '/shequhuodongCollection',
        name: '社区活动收藏',
        component: shequhuodongCollection
      }
    ,{
        path: '/shequhuodongLiuyan',
        name: '社区活动留言',
        component: shequhuodongLiuyan
      }
    ,{
        path: '/shequhuodongOrder',
        name: '社区活动预约',
        component: shequhuodongOrder
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/zhengwufuwu',
        name: '政务服务',
        component: zhengwufuwu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
