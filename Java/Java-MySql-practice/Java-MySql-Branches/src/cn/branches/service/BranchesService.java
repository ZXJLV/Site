package cn.branches.service;

public interface BranchesService {

    //调用查询所有营业网点信息
    void selectBranchesAll();

    //根据id查询指定网点信息
    void selectBranchesById();

    //根据营业执照号查询指定网点信息
    void selectBranchesByBusinessNo();

    //添加营业网点信息
    void insertBranches();
}
