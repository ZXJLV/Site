package cn.branches.dao;

import cn.branches.entity.Branches;

import java.util.List;

public interface BranchesDao {

    //查询所有营业网点信息
    List<Branches> selectBranchesAll();

    //根据id查询指定网点信息
    Branches selectBranchesById(int id);

    //根据营业执照号查询指定网点信息
    Branches selectBranchesByBusinessNo(String businessNo);

    //添加营业网点信息
    int insertBranches(Branches branches);

}
