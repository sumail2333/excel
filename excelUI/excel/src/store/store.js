import Vue from 'vue'

import Vuex from 'vuex'

Vue.use(Vuex)

const store = new Vuex.Store({
    state:{
        personInfo:{},
    },
    mutations:{
        getPersonInfo(state,msg){
            state.personInfo = msg;
        }
    }
})

export default store