<template>
    <div>
      <el-row style="margin-top:20px;">
        <el-col :span="12" :offset="4">
          <el-form :model="personInfo"  :rules="rules" ref="personInfo" label-width="110px" class="demo-formData">
            <el-form-item label="店铺名称" prop="name">
					</el-form-item>
          </el-form> 
        </el-col>
      </el-row>
    </div>
</template>
<script>
import { mapState } from 'vuex'
export default {
  name:"home",
  data() {
    return {
        
    };
  },
  computed: {
			...mapState(['personInfo']),
		},
};
</script>

<style lang="less" scoped>

</style>