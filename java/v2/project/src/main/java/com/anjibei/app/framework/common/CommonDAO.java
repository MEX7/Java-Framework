package com.anjibei.app.framework.common;

import org.springframework.stereotype.Repository;
import wedev.db.dao.AbstractDAO;

import javax.sql.DataSource;

@Repository
public class CommonDAO extends AbstractDAO implements iCommonDAO {

    public CommonDAO(DataSource dataSource) {
        super(dataSource);
    }

//    public TUser queryUserInfo(int userSid) throws SQLException {
//        Connection connection = null;
//        TUser tUser = new TUser();
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT user_nickname, user_pic_path, user_signature FROM t_user WHERE user_sid = '"+ userSid +"'";
//            PreparedStatement ps = connection.prepareStatement(sql);
//
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                tUser.setUserNickname(rs.getString("user_nickname"));
//                tUser.setUserPicPath(rs.getString("user_pic_path"));
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return tUser;
//    }


}
