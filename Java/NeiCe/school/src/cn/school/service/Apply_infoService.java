package cn.school.service;

public interface Apply_infoService {

    //报名
    void insertApply_info();

    //按比赛项目查询
    void selectApply_infoByGame();

    //按班号查询
    void selectApply_infoByClass1();

    //取消报名
    void deleteApply_infoByName();

}
