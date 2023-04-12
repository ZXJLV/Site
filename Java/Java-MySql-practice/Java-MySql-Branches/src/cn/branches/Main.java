package cn.branches;

import cn.branches.service.BranchesService;
import cn.branches.service.impl.BranchesServiceImpl;

public class Main {
    public static void main(String[] args) {
        BranchesService branchesService = new BranchesServiceImpl();

        //查询所有营业网点信息
        //branchesService.selectBranchesAll();

        //根据id查询指定网点信息
        //branchesService.selectBranchesById();

        //根据id查询指定网点信息
        //branchesService.selectBranchesByBusinessNo();

        //添加营业网点信息
        //branchesService.insertBranches();



    }
}