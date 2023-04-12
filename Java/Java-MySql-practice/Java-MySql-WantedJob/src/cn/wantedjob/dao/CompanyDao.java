package cn.wantedjob.dao;

public interface CompanyDao {

    //根据公司名称查询是否有这个公司
    boolean selectCompanyByCompanyName(String companyName);

    //根据输入的公司名称查询公司id
    int selectCompanyIdByCompanyName(String companyName);

}
