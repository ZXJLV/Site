package cn.wantedjob.dao.impl;

import cn.wantedjob.dao.BaseDao;
import cn.wantedjob.dao.JobInfoDao;
import cn.wantedjob.entity.Jobinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JobInfoDaoImpl extends BaseDao implements JobInfoDao {
    PreparedStatement ps = null;
    Connection conn = null;
    ResultSet rs = null;
    String sql = null;

    //根据输入的行业类型名称查询
    @Override
    public List<Jobinfo> selectJobinfoByjobTypeName(String jobTypeName) {
        List<Jobinfo> JobinfoList = new ArrayList<Jobinfo>();
        Jobinfo jobinfo = null;
        try {
            conn = getConn();

//            sql = "SELECT jobtype.jobTypeName, job.jobName, jobinfo.jobInfoTitle, jobinfo.jobInfoMinSalary, jobinfo.jobInfoMaxSalary,\n" +
//                    "       jobinfo.experieceMinYear, jobinfo.experieceMaxYear, education.educationName, company.companyName,\n" +
//                    "       region.regionId, region_info.provinceName, region_info.cityName, region_info.areaName\n" +
//                    "FROM jobinfo\n" +
//                    "INNER JOIN job ON job.jobId = jobinfo.jobId\n" +
//                    "INNER JOIN jobtype ON jobinfo.jobTypeId = jobtype.jobTypeId\n" +
//                    "INNER JOIN region ON region.regionId = jobinfo.regionId\n" +
//                    "INNER JOIN education ON education.educationId = jobinfo.educationMinId\n" +
//                    "INNER JOIN company ON company.companyId = jobinfo.companyId\n" +
//                    "INNER JOIN (\n" +
//                    "    SELECT region.regionId, province.provinceName, city.cityName, area.areaName FROM region\n" +
//                    "    INNER JOIN province ON province.provinceId = region.provinceId\n" +
//                    "    INNER JOIN city ON city.cityId = region.cityId\n" +
//                    "    INNER JOIN area ON area.areaId = region.areaId\n" +
//                    ") AS region_info ON region_info.regionId = region.regionId\n" +
//                    "WHERE jobtype.jobTypeName = '软件工程师';\n";
            sql = "SELECT jobtype.jobTypeName, job.jobName, jobinfo.jobInfoTitle, jobinfo.jobInfoMinSalary, jobinfo.jobInfoMaxSalary, jobinfo.experieceMinYear, jobinfo.experieceMaxYear, education.educationName, company.companyName, region.regionId, region_info.provinceName, region_info.cityName, region_info.areaName " +
                    "FROM jobinfo " +
                    "INNER JOIN job ON job.jobId = jobinfo.jobId " +
                    "INNER JOIN jobtype ON jobinfo.jobTypeId = jobtype.jobTypeId " +
                    "INNER JOIN region ON region.regionId = jobinfo.regionId " +
                    "INNER JOIN education ON education.educationId = jobinfo.educationMinId " +
                    "INNER JOIN company ON company.companyId = jobinfo.companyId " +
                    "INNER JOIN (SELECT region.regionId, province.provinceName, city.cityName, area.areaName FROM region " +
                    "INNER JOIN province ON province.provinceId = region.provinceId " +
                    "INNER JOIN city ON city.cityId = region.cityId " +
                    "INNER JOIN area ON area.areaId = region.areaId) AS region_info ON region_info.regionId = region.regionId " +
                    "WHERE jobtype.jobTypeName = ?";

            ps = conn.prepareStatement(sql);
            ps.setString(1,jobTypeName);
            rs = ps.executeQuery();

            while (rs.next()) {
                JobinfoList.add(jobinfo = new Jobinfo(
                    rs.getString("jobTypeName"),
                    rs.getString("jobName"),
                    rs.getString("jobInfoTitle"),
                    rs.getDouble("jobInfoMinSalary"),
                    rs.getDouble("jobInfoMaxSalary"),
                    rs.getInt("experieceMinYear"),
                    rs.getInt("experieceMaxYear"),
                    rs.getString("educationName"),
                    rs.getString("companyName"),
                    rs.getInt("regionId"),
                    rs.getString("provinceName"),
                    rs.getString("cityName"),
                    rs.getString("areaName")
                ));
            }

            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return JobinfoList;
    }
//
//    //根据薪资区间、学历、地区、公司规模等条件查询
//    @Override
//    public List<Jobinfo> selectJobinfoByJobInfoSalaryAndEducationAndRegionAndCompanyEmployeeNum(String jobInfoMinSalary, String jobInfoMaxSalary, String education,int regionId, int companyMinEmployeeNum, int companyMaxEmployeeNum) {
//        List<Jobinfo> jobinfoList = new ArrayList<Jobinfo>();
//        Jobinfo jobinfo = null;
//        try {
//            conn = getConn();
//
//            StringBuilder sql = new StringBuilder(
//                    "SELECT jobtype.jobTypeName, job.jobName, jobinfo.jobInfoTitle, jobinfo.jobInfoMinSalary, jobinfo.jobInfoMaxSalary,\n" +
//                    "       jobinfo.experieceMinYear, jobinfo.experieceMaxYear, education.educationName, company.companyName,company.companyMinEmployeeNum,\n" +
//                    "\t\t\t company.companyMaxEmployeeNum,\n" +
//                    "       region.regionId, region_info.provinceName, region_info.cityName, region_info.areaName\n" +
//                    "FROM jobinfo\n" +
//                    "INNER JOIN job ON job.jobId = jobinfo.jobId\n" +
//                    "INNER JOIN jobtype ON jobinfo.jobTypeId = jobtype.jobTypeId\n" +
//                    "INNER JOIN region ON region.regionId = jobinfo.regionId\n" +
//                    "INNER JOIN education ON education.educationId = jobinfo.educationMinId\n" +
//                    "INNER JOIN company ON company.companyId = jobinfo.companyId\n" +
//                    "INNER JOIN (\n" +
//                    "    SELECT region.regionId, province.provinceName, city.cityName, area.areaName FROM region\n" +
//                    "    INNER JOIN province ON province.provinceId = region.provinceId\n" +
//                    "    INNER JOIN city ON city.cityId = region.cityId\n" +
//                    "    INNER JOIN area ON area.areaId = region.areaId\n" +
//                    ") AS region_info ON region_info.regionId = region.regionId\n" +
//                    "WHERE 1=1;"
//            );
//
//            if (jobInfoMinSalary != null){
//                sql.append("AND jobInfoMaxSalary >= ?");
//            }
//            if (jobInfoMaxSalary != null){
//                sql.append("AND jobInfoMaxSalary <= ?");
//            }
//            if (education != null){
//                sql.append("AND education = ?");
//            }
//            if (regionId != -1){
//                sql.append("AND regionId = ?");
//            }
//            if (companyMinEmployeeNum != -1){
//                sql.append("AND companyMaxEmployeeNum = ?");
//            }
//            if (companyMaxEmployeeNum != -1){
//                sql.append("AND companyMinEmployeeNum = ?");
//            }
//
//            ps = conn.prepareStatement(sql.toString());
//
//            int i = 1;
//
//            if (jobInfoMinSalary != null){
//                ps.setString(i++,jobInfoMinSalary);
//            }
//            if (jobInfoMaxSalary != null){
//                ps.setString(i++,jobInfoMaxSalary);
//            }
//            if (education != null){
//                ps.setString(i++,education);
//            }
//            if (regionId != -1){
//                ps.setInt(i++,regionId);
//            }
//            if (companyMinEmployeeNum != -1){
//                ps.setInt(i++,companyMaxEmployeeNum);
//            }
//            if (companyMaxEmployeeNum != -1){
//                ps.setInt(i++,companyMinEmployeeNum);
//            }
//
//            rs = ps.executeQuery();
//
//           /*"SELECT jobtype.jobTypeName, job.jobName, jobinfo.jobInfoTitle, jobinfo.jobInfoMinSalary, jobinfo.jobInfoMaxSalary,\n" +
//                    "       jobinfo.experieceMinYear, jobinfo.experieceMaxYear, education.educationName, company.companyName,company.companyMinEmployeeNum,\n" +
//                    "\t\t\t company.companyMaxEmployeeNum,\n" +
//                    "       region.regionId, region_info.provinceName, region_info.cityName, region_info.areaName\n" */
//
////            while (rs.next()) {
////                jobinfoList.add(jobinfo = new Jobinfo(
////                        rs.getString("jobTypeName"),
////                        rs.getString("jobName"),
////                        rs.getString("jobInfoTitle"),
////                        rs.getDouble("jobInfoMinSalary"),
////                        rs.getDouble("jobInfoMaxSalary"),
////                        rs.getInt("experieceMinYear"),
////                        rs.getInt("experieceMaxYear"),
////                        rs.getString("educationName"),
////                        rs.getString("companyName"),
////                        rs.getInt("companyMinEmployeeNum"),
////                        rs.getInt("companyMaxEmployeeNum"),
////                        rs.getInt("regionId"),
////                        rs.getString("provinceName"),
////                        rs.getString("cityName"),
////                        rs.getString("areaName")
////                ));
////            }
//
//            closeAll(conn,ps,rs);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        return jobinfoList;
//    }


}
