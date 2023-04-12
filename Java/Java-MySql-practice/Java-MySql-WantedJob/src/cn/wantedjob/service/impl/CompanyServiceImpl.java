package cn.wantedjob.service.impl;

import cn.wantedjob.dao.CompanyDao;
import cn.wantedjob.dao.UserinfoDao;
import cn.wantedjob.dao.impl.CompanyDaoImpl;
import cn.wantedjob.dao.impl.UserinfoDaoImpl;
import cn.wantedjob.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
    CompanyDao companyDao = new CompanyDaoImpl();

    //根据公司名称查询是否有这个公司
    @Override
    public boolean selectCompanyByCompanyName(String companyName) {
        if (!companyDao.selectCompanyByCompanyName(companyName)) {
            System.out.println("未查找到此公司");
            return false;
        }
        return true;
    }

    //根据输入的公司名称查询公司id
    @Override
    public int selectCompanyIdByCompanyName(String companyName) {
        return companyDao.selectCompanyIdByCompanyName(companyName);
    }

}
