import Vue from 'vue'
import Router from 'vue-router'
import login from '@/components/login'
import navigator from "@/components/navigator"
import home from "@/components/home"
import 'element-ui/lib/theme-chalk/index.css'
Vue.use(Router)


export default new Router({
  routes: [
    {
      path: '/',
      name: 'lgin',
      component: login
    },
    {
      path:"/navigator",
      component:navigator,
      name:"",
      children:[
        {
          path: '',
          component: home,
          meta: [],
        },
      ]
    }
  ]
})
