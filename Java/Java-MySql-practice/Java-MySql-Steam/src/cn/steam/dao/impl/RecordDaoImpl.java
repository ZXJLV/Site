package cn.steam.dao.impl;

import cn.steam.dao.BaseDao;
import cn.steam.dao.RecordDao;

import java.sql.SQLException;

public class RecordDaoImpl extends BaseDao implements RecordDao {

    //根据用户id删除订单
    @Override
    public int deleteRecordByUserInfoId(int userInfoId) {
        String sql = "DELETE FROM record WHERE userInfoId = ?";
        Object[] objects = {userInfoId};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
