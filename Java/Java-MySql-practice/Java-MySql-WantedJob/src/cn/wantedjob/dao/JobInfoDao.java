package cn.wantedjob.dao;

import cn.wantedjob.entity.Jobinfo;

import java.util.List;

public interface JobInfoDao {

    //根据输入的行业类型名称查询
    List<Jobinfo> selectJobinfoByjobTypeName(String jobTypeName);

    //根据薪资区间、学历、地区、公司规模等条件查询
    //List<Jobinfo> selectJobinfoByJobInfoSalaryAndEducationAndRegionAndCompanyEmployeeNum(String jobInfoMinSalary, String jobInfoMaxSalary, String education,int regionId, int companyMinEmployeeNum, int companyMaxEmployeeNum);

}
