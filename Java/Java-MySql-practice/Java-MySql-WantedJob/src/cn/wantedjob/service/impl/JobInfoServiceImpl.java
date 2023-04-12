package cn.wantedjob.service.impl;

import cn.wantedjob.dao.JobInfoDao;
import cn.wantedjob.dao.impl.JobInfoDaoImpl;
import cn.wantedjob.entity.Jobinfo;
import cn.wantedjob.entity.Userinfotype;
import cn.wantedjob.service.JobInfoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobInfoServiceImpl implements JobInfoService {
    JobInfoDao jobInfoDao = new JobInfoDaoImpl();

    //根据输入的行业类型名称查询
    @Override
    public void selectJobInfoByJobTypeName(String jobTypeName) {

        List<Jobinfo> jobinfoList = jobInfoDao.selectJobinfoByjobTypeName(jobTypeName);

        for (Jobinfo jobinfo : jobinfoList) {
            System.out.println(jobinfo);
        }






    }
}
