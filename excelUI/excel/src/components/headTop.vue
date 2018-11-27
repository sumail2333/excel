<template>
        <div class="header_container">
		<el-breadcrumb separator="/">
			<el-breadcrumb-item :to="{ path: '/navigator' }">首页</el-breadcrumb-item>
		</el-breadcrumb>
		<el-dropdown @command="handleCommand" menu-align='start'>
            <span class="avator">欢迎,{{personInfo.partyMemberName}}({{personInfo.partyMemberCategory == 1?"普通党员":personInfo.partyMemberCategory == 2?"支部书记":"总支书记"}})</span>
			<el-dropdown-menu slot="dropdown">
				<el-dropdown-item command="home">首页</el-dropdown-item>
				<el-dropdown-item command="singout">退出</el-dropdown-item>
			</el-dropdown-menu>
		</el-dropdown>
    </div>
</template>
<script>
import { mapState } from "vuex";
export default {
  name: "headTop",
  data() {
    return {};
  },
  created() {},
  computed: {
    ...mapState(["personInfo"])
  },
  methods: {
    async handleCommand(command) {
      if (command == "home") {
        this.$router.push("/navigator");
      } else if (command == "singout") {
      }
    }
  }
};
</script>

<style lang="less" scoped>
@import "../style/mixin";
.header_container {
  background-color: #eff2f7;
  height: 60px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-left: 20px;
}
	.avator{
		margin-right: 37px;
	}
.el-dropdown-menu__item {
  text-align: center;
}
</style>