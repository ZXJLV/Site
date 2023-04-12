package cn.wantedjob.service;

public interface JobInfoService {

    //根据输入的行业类型名称查询
    void selectJobInfoByJobTypeName(String jobTypeName);

}
