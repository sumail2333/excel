<template>
    <div>
      <el-row style="margin-top:20px;">
        <el-col :span="12" :offset="4">
          <el-form :model="personInfo" ref="personInfo" label-width="110px" class="demo-formData">
            <el-form-item label="姓名">
              <el-input v-model="personInfo.partyMemberName"></el-input>
					  </el-form-item>
            <el-form-item label="性别">
              <el-input v-model="sex"></el-input>
					  </el-form-item>
            <el-form-item label="身份证">
              <el-input v-model="personInfo.partyMemberIdcard"></el-input>
					  </el-form-item>
            <el-form-item label="公司" prop="partyMemberCompany">
              <el-input v-model="personInfo.partyMemberCompany"></el-input>
					  </el-form-item>
            <el-form-item label="手机号码" prop="partyMemberNumber">
              <el-input v-model="personInfo.partyMemberNumber"></el-input>
					  </el-form-item>
            <el-form-item label="邮箱" prop="partyMemberMail">
              <el-input v-model="personInfo.partyMemberMail"></el-input>
					  </el-form-item>
            <el-form-item label="备用邮箱" prop="partyMemberBackupMail">
              <el-input v-model="personInfo.partyMemberBackupMail"></el-input>
					  </el-form-item>
            <el-form-item label="入党时间" prop="partyMemberJoinDate">
              <el-input v-model="personInfo.partyMemberJoinDate"></el-input>
					  </el-form-item>
            <el-form-item label="转出时间" prop="partyMemberChangeDate">
              <el-input v-model="personInfo.partyMemberChangeDate"></el-input>
					  </el-form-item>
          </el-form> 
        </el-col>
      </el-row>
    </div>
</template>
<script>

export default {
  name:"home",
  data() {
    return {
      personInfo:null, 
      sex:"", 
      joinDate:new Date(),
      leaveDate:new Date(),
    };
  },
  mounted(){
    this.personInfo = JSON.parse(localStorage.getItem("personInfo"));
    this.sex = this.personInfo.partyMemberSex == 1? "男":"女";
    this.joinDate = new Date(this.personInfo.partyMemberJoinDate);
    this.leaveDate = new Date(this.personInfo.partyMemberChangeDate);
    console.log(this.personInfo);
  },
  computed: {
			
		},
};
</script>

<style lang="less" scoped>

</style>