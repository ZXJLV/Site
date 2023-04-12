package cn.branches.service.impl;

import cn.branches.dao.BranchesDao;
import cn.branches.dao.impl.BranchesDaoImpl;
import cn.branches.entity.Branches;
import cn.branches.service.BranchesService;

import java.util.Scanner;

public class BranchesServiceImpl implements BranchesService {
    Scanner input = new Scanner(System.in);
    BranchesDao branchesDao = new BranchesDaoImpl();


    //调用查询所有营业网点信息
    @Override
    public void selectBranchesAll() {

        for (Branches branches : branchesDao.selectBranchesAll()) {
            System.out.println(branches);
        }

    }

    //根据id查询指定网点信息
    @Override
    public void selectBranchesById() {

        System.out.println("请输入网点id：");
        int id = input.nextInt();

        if (branchesDao.selectBranchesById(id)==null) {
            System.out.println("未查找到此网点id");
        }else {
            System.out.println(branchesDao.selectBranchesById(id));
        }

    }

    //根据营业执照号查询指定网点信息
    @Override
    public void selectBranchesByBusinessNo() {

        System.out.println("请输入营业执照号：");
        String businessNo = input.next();

        if (branchesDao.selectBranchesByBusinessNo(businessNo)==null) {
            System.out.println("未查找到此营业执照");
        }else {
            System.out.println(branchesDao.selectBranchesByBusinessNo(businessNo));
        }

    }

    //添加营业网点信息
    @Override
    public void insertBranches() {
        Branches branches = new Branches();

        System.out.println("请输入营业执照号：");
        branches.setBusinessNo(input.next());

        if (branchesDao.selectBranchesByBusinessNo(branches.getBusinessNo()) != null) {
            System.out.println("营业执照不能重复！");
        }else {
            System.out.println("请输入网点名称：");
            branches.setName(input.next());
            System.out.println("请输入所在城区:");
            branches.setCityArea(input.next());
            System.out.println("请输入网点地址：");
            branches.setAddress(input.next());
            System.out.println("请输入联系电话:");
            branches.setTelephone(input.next());
            System.out.println("请输入网点简介:");
            branches.setSummary(input.next());

            int rowInsertBranches = branchesDao.insertBranches(branches);

            if (rowInsertBranches>0) {
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }

        }
    }





}
