package com.javamysql.Service.impl;

import com.javamysql.Service.CheckitemService;
import com.javamysql.dao.CheckitemDao;
import com.javamysql.dao.DepartmentDao;
import com.javamysql.dao.Department_checkitemDao;
import com.javamysql.dao.impl.CheckitemDaoImpl;
import com.javamysql.dao.impl.DepartmentDaoImpl;
import com.javamysql.dao.impl.Department_checkitemDaoImpl;
import com.javamysql.dao.impl.PrescriptionDaoImpl;
import com.javamysql.dao.PrescriptionDao;
import com.javamysql.entity.Checkitem;

import java.util.Scanner;

public class CheckitemServiceImpl implements CheckitemService {
    Scanner input = new Scanner(System.in);
    CheckitemDao checkitemDao = new CheckitemDaoImpl();
    Department_checkitemDao departmentCheckitemDao = new Department_checkitemDaoImpl();
    DepartmentDao departmentDao = new DepartmentDaoImpl();
    PrescriptionDao prescriptionDao = new PrescriptionDaoImpl();

    //添加检查项目
    @Override
    public void insertCheckitem() throws Exception {
        System.out.println("请输入检查项目名称：");
        String checkItemName = input.next();
        System.out.println("请输入检查项目价格：");
        Double checkItemCost = input.nextDouble();

        int rowCheckItemInsert = checkitemDao.insertCheckItem(new Checkitem(0,checkItemName,checkItemCost));

        departmentDao.selectDepartment();
        System.out.println("请选择科室（输入科室id）：");
        int depID = input.nextInt();

        int rowDepartmentCheckItemInsert =
                        departmentCheckitemDao.insertDepartmentCheckItem(
                        depID,checkitemDao.selectCheckItemId(checkItemName)
        );

        if (rowCheckItemInsert > 0 && rowDepartmentCheckItemInsert > 0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    //删除检查项目
    @Override
    public void deleteCheckitem() throws Exception {

        checkitemDao.selectCheckItem();

        System.out.println("请输入要删除检查项目的ID：");
        int checkItemId = input.nextInt();

        prescriptionDao.deletePrescriptionByCheckitemID(checkItemId);
        departmentCheckitemDao.deleteDepartmentCheckItemByCheckItemID(checkItemId);
        int rowDeleteCheckItem = checkitemDao.deleteCheckItemByCheckItemID(checkItemId);

        if(rowDeleteCheckItem > 0){
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    //改检查项目名称和价格
    @Override
    public void updateCheckItemNameAndCheckItemCost() throws Exception {

        checkitemDao.selectCheckItem();

        System.out.println("请输入要更改检查项目的ID：");
        int checkItemId = input.nextInt();
        System.out.println("请输入新的检查项目名称：");
        String checkItemName = input.next();
        System.out.println("请输入新的检查项目价格：");
        double checkItemCost = input.nextDouble();

        int rowUpdateCheckItem = checkitemDao.updateCheckItemCost(checkItemId, checkItemName, checkItemCost);

        if(rowUpdateCheckItem > 0){
            System.out.println("更改成功");
        }else {
            System.out.println("更改失败");
        }

    }





}
