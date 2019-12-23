import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import VueAxios from 'vue-axios'
import { Header } from 'mint-ui';

// import Mui from './assets/mui/js/mui.js'
import './assets/mui/css/mui.css'


Vue.component(Header.name, Header);

import 'mint-ui/lib/style.css'


Vue.use(VueAxios, axios)
Vue.config.productionTip = false

var vm = new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
