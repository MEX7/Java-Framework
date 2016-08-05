package wedev.db.dao;

import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class ExampleDAO extends AbstractDAO {

    public ExampleDAO(DataSource dataSource) {
        super(dataSource);
    }
//
//    public int registNewUser(User user) throws SQLException {
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "INSERT INTO t_user(" +
//                    "user_id," +
//                    "user_nickname," +
//                    "user_pic_path," +
//                    "user_time" +
//                    ") " +
//                    "VALUES(" +
//                    "'" + user.getUserId() + "'," +
//                    "'" + user.getUserNickname() + "'," +
//                    "'" + user.getUserPicPath() + "'," +
//                    "'" + TimeUtils.getTime() + "'" +
//                    ")";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.executeUpdate(sql);
//
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return getMaxUserSid();
//    }
//    /**
//     * 用户微信是否认证过
//     *
//     */
//    public int isWxAuted(ThirdPartAut thirdPartAut)throws SQLException{
//        Connection connection = null;
//        int userSid = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM t_user WHERE t_user.user_wx_aut = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, thirdPartAut.getThirdPartAutCode());
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                userSid = rs.getInt("user_sid");
//            }
//
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userSid;
//    }
//
//    public int weixinAut(ThirdPartAut thirdPartAut) throws SQLException {
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "INSERT INTO t_user(" +
//                    "user_id," +
//                    "user_wx_aut," +
//                    "user_pic_path," +
//                    "user_nickname," +
//                    "user_time" +
//                    ") " +
//                    "VALUES(" +
//                    "'" + MD5Utils.md5(Integer.toString(TimeUtils.getTime())) + "'," +
//                    "'" + thirdPartAut.getThirdPartAutCode() + "'," +
//                    "'" + thirdPartAut.getUserPicPath() + "'," +
//                    "'" + thirdPartAut.getUserNickname() + "'," +
//                    "'" + TimeUtils.getTime() + "'" +
//                    ")";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.executeUpdate(sql);
//
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return getMaxUserSid();
//    }
//
//    /**
//     * 用户QQ是否认证过
//     *
//     */
//    public int isQqAuted(ThirdPartAut thirdPartAut)throws SQLException{
//        Connection connection = null;
//        int userSid = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM t_user WHERE t_user.user_qq_aut=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, thirdPartAut.getThirdPartAutCode());
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                userSid = rs.getInt("user_sid");
//            }
//
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userSid;
//    }
//
//    public int qqAut(ThirdPartAut thirdPartAut) throws SQLException {
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "INSERT INTO t_user(" +
//                    "user_id," +
//                    "user_qq_aut," +
//                    "user_pic_path," +
//                    "user_nickname," +
//                    "user_time" +
//                    ") " +
//                    "VALUES(" +
//                    "'" + MD5Utils.md5(Integer.toString(TimeUtils.getTime())) + "'," +
//                    "'" + thirdPartAut.getThirdPartAutCode() + "'," +
//                    "'" + thirdPartAut.getUserPicPath() + "'," +
//                    "'" + thirdPartAut.getUserNickname() + "'," +
//                    "'" + TimeUtils.getTime() + "'" +
//                    ")";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.executeUpdate(sql);
//
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return getMaxUserSid();
//    }
//
//    /**
//     * 用户微博是否认证过
//     *
//     */
//    public int isWbAuted(ThirdPartAut thirdPartAut)throws SQLException{
//        Connection connection = null;
//        int userSid = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM t_user WHERE t_user.user_wb_aut=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, thirdPartAut.getThirdPartAutCode());
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                userSid = rs.getInt("user_sid");
//            }
//
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userSid;
//    }
//
//    public int weiboAut(ThirdPartAut thirdPartAut) throws SQLException {
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "INSERT INTO t_user(" +
//                    "user_id," +
//                    "user_wb_aut," +
//                    "user_pic_path," +
//                    "user_nickname," +
//                    "user_time" +
//                    ") " +
//                    "VALUES(" +
//                    "'" +  MD5Utils.md5(Integer.toString(TimeUtils.getTime())) + "'," +
//                    "'" + thirdPartAut.getThirdPartAutCode()  + "'," +
//                    "'" + thirdPartAut.getUserPicPath() + "'," +
//                    "'" + thirdPartAut.getUserNickname() + "'," +
//                    "'" + TimeUtils.getTime() + "'" +
//                    ")";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.executeUpdate(sql);
//
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return getMaxUserSid();
//    }
//
//    public boolean isRegistered(User user)throws SQLException
//    {
//        boolean checkResult = false;
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT count(*) AS taid FROM t_user WHERE t_user.user_id=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, user.getUserId());
//            ResultSet rs = ps.executeQuery();
//            int rowCount = 0;
//            if(rs.next()){
//                rowCount = rs.getInt("taid");
//            }
//            if(rowCount != 0)
//            {
//                checkResult = true;
//            }
//
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return checkResult;
//    }
//
//    public  int getUserCount() throws SQLException{
//        Connection connection = null;
//        int rowCount = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT count(*) AS taid FROM t_user";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                rowCount = rs.getInt("taid");
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return rowCount;
//    }
//
//    public int getMaxUserSid() throws SQLException
//    {
//        Connection connection = null;
//        int maxsid = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT max(user_sid) FROM t_user";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                maxsid = Integer.parseInt(rs.getString(1));
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return maxsid;
//    }
//
//    public int getMaxBabySid() throws SQLException{
//        Connection connection = null;
//        int maxsid = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT max(user_baby_sid) FROM t_user_baby";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                maxsid = Integer.parseInt(rs.getString(1));
//            }
//        }catch (Exception e){
//            throw e;
//        }finally {
//            if(connection != null)
//                connection.close();
//        }
//        return maxsid;
//    }
//
//    public void addNewBaby(int userSid, TUserBaby userBaby) throws SQLException{
//        Connection connection = null;
//        try {
//            connection = getDataSource().getConnection();
//            String sql = "INSERT INTO t_user_baby(" +
//                    "user_sid," +
//                    "user_baby_name," +
//                    "user_baby_sex," +
//                    "user_baby_birth" +
//                    ") " +
//                    "VALUES(" +
//                    "'" + userSid + "'," +
//                    "'" + userBaby.getUserBabyName() + "'," +
//                    "'" + userBaby.getUserBabySex() + "'," +
//                    "'" + userBaby.getUserBabyBirth() + "'" +
//
////                    "'" + MD5Utils.md5(user.getUserPassword()) + "'" +
//                    ")";
//        }catch (Exception e){
//            throw e;
//        }finally {
//            if(connection != null){
//                connection.close();
//            }
//        }
//
//    }
//
//    public void registNewUserKey(User user,int userSid) throws SQLException{
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "INSERT INTO t_user_key(" +
//                    "user_sid," +
//                    "user_password" +
//                    ") " +
//                    "VALUES(" +
//                    "'" + userSid + "'," +
//                    "'" + MD5Utils.md5(user.getUserPassword()) + "'" +
//                    ")";
//                PreparedStatement ps = connection.prepareStatement(sql);
//                ps.executeUpdate(sql);
//
//            }catch (Exception e){
//                throw e;
//            } finally {
//                if (connection != null)
//                    connection.close();
//            }
//    }
//
//    public boolean userLogin(User user)throws SQLException{
//        Connection connection = null;
//        boolean result = false;
//        String password = "";
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT t_user.user_id,t_user_key.user_password FROM t_user,t_user_key WHERE t_user.user_sid = t_user_key.user_sid and t_user.user_id=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, user.getUserId());
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                password = rs.getString("user_password");
//            }
//            if(password.equals(MD5Utils.md5(user.getUserPassword()))){
//                result = true;
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return result;
//    }
//
//    public UserShortInfo getUserShortInfo(int userSid) throws SQLException{
//        Connection connection = null;
//        UserShortInfo userShortInfo = new UserShortInfo();
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT user_nickname,user_pic_path FROM t_user WHERE user_sid = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                userShortInfo.setUserNickname(rs.getString("user_nickname"));
//                userShortInfo.setUserPicPath(rs.getString("user_pic_path"));
//            }
//
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userShortInfo;
//    }
//
//    public OtherUserInfo getOtherUserInfo(int userSid)throws SQLException{
//        Connection connection = null;
//        OtherUserInfo otherUserInfo = new OtherUserInfo();
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM t_user WHERE user_sid = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                otherUserInfo.setUserSid(rs.getInt("user_sid"));
//                otherUserInfo.setUserNickname(rs.getString("user_nickname"));
//                otherUserInfo.setUserPicPath(rs.getString("user_pic_path"));
//                otherUserInfo.setUserSignature(rs.getString("user_signature"));
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return otherUserInfo;
//    }
//
//    public int getUserAttentionCount(int userSid)throws SQLException{
//        Connection connection = null;
//        int userAttentionCount = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT count(*) AS attentionCount FROM t_fan WHERE fan_user_sid=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                userAttentionCount = rs.getInt("attentionCount");
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userAttentionCount;
//    }
//
//    public int getUserFansCount(int userSid)throws SQLException{
//        Connection connection = null;
//        int userFansCount = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT count(*) AS likeCount FROM t_fan WHERE main_user_sid=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                userFansCount = rs.getInt("likeCount");
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userFansCount;
//    }
//
//    public int getUserJoinCount(int userSid)throws SQLException{
//        Connection connection = null;
//        int userJoinCount = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT count(*) AS joinCount FROM t_act_apply WHERE act_apply_user_sid=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                userJoinCount = rs.getInt("joinCount");
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userJoinCount;
//    }
//
//    public int getUserOrganizeCount(int userSid)throws SQLException{
//        Connection connection = null;
//        int userOrganizeCount = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT count(*) AS organizeCount FROM anjibei_sur_act WHERE act_user_sid=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                userOrganizeCount = rs.getInt("organizeCount");
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userOrganizeCount;
//    }
//
//    public TUser getUserInfo(int userSid)throws SQLException{
//        TUser user = new TUser();
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM t_user WHERE user_sid=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                user.setUserSid(rs.getInt("user_sid"));
//                user.setUserId(rs.getString("user_id"));
//                user.setUserNickname(rs.getString("user_nickname"));
//                user.setUserSex(rs.getInt("user_sex"));
//                user.setUserBirth(rs.getInt("user_birth"));
//                user.setUserSignature(rs.getString("user_signature"));
//                user.setUserPicPath(rs.getString("user_pic_path"));
//                user.setUserBabyName(rs.getString("user_baby_name"));
//                user.setUserBabySex(rs.getInt("user_baby_sex"));
//                user.setUserBabyBirth(rs.getInt("user_baby_birth"));
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return user;
//    }
//
//    public String getUserId(int userSid)throws SQLException{
//        String userId = "";
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM t_user WHERE user_sid=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//               userId = rs.getString("user_id");
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userId;
//    }
//
//    public int getUserSid(String userId)throws SQLException{
//        int userSid = -1;
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM t_user WHERE user_id=?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userId);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                userSid = rs.getInt("user_Sid");
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return userSid;
//    }
//
//    public void changePassword(int userSid, String password)throws SQLException{
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "UPDATE t_user_key SET user_password = ? WHERE user_sid = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, password);
//            ps.setObject(2, userSid);
//            ps.executeUpdate();
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//    }
//
//    public int getBabyDays(int userSid)throws SQLException{
//        Connection connection = null;
//        int babyDays = 0;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM t_user WHERE user_sid = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                int dif = TimeUtils.getTime() - rs.getInt("user_baby_birth");
//                if(dif >= 0) {
//                    babyDays = (TimeUtils.getTime() - rs.getInt("user_baby_birth")) / Constant.SECONDS_TO_DAYS + 1;
//                }
//                else {
//                    babyDays = (TimeUtils.getTime() - rs.getInt("user_baby_birth")) / Constant.SECONDS_TO_DAYS - 1;
//                }
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return babyDays;
//    }
//
//    public void modifyUserInfo(TUser user)throws SQLException{
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "UPDATE t_user SET user_sex = ?," +
//                    "user_birth = ?," +
//                    "user_nickname = ?," +
//                    "user_signature = ?," +
//                    "user_baby_birth = ? " +
//                    "WHERE user_sid = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, user.getUserSex());
//            ps.setObject(2, user.getUserBirth());
//            ps.setObject(3, user.getUserNickname());
//            ps.setObject(4, user.getUserSignature());
//            ps.setObject(5, user.getUserBabyBirth());
//            ps.setObject(6, user.getUserSid());
//            ps.executeUpdate();
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//    }
//
//    public void modifyUserPicPath(TUser user) throws SQLException{
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "UPDATE t_user SET user_pic_path = ? " +
//                    "WHERE user_sid = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, user.getUserPicPath());
//            ps.setObject(2, user.getUserSid());
//            ps.executeUpdate();
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//    }
//
//    public void modifyUserId(int userSid, TUser user)throws SQLException{
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "UPDATE t_user SET user_id = ?" +
//                    "WHERE user_sid = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, user.getUserId());
//            ps.setObject(2, userSid);
//            ps.executeUpdate();
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//    }
//
//    public boolean isFans(int userSid, int otherUserSid)throws SQLException{
//        Connection connection = null;
//        boolean result = false;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM t_fan WHERE fan_user_sid = ? AND main_user_sid = ? AND disable = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userSid);
//            ps.setObject(2, otherUserSid);
//            ps.setObject(3, 1);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                result = true;
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return result;
//    }
//
//    public void improveUserInfo(TUser user) throws SQLException{
//        Connection connection = null;
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "UPDATE t_user SET user_pergnancy = ?," +
//                    "user_baby_name = ?," +
//                    "user_baby_sex = ?," +
//                    "user_baby_birth = ? " +
//                    "WHERE user_sid = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, user.getUserPergnancy());
//            ps.setObject(2, user.getUserBabyName());
//            ps.setObject(3, user.getUserBabySex());
//            ps.setObject(4, user.getUserBabyBirth());
//            ps.setObject(5, user.getUserSid());
//            ps.executeUpdate();
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//    }
//
//    public List<AnjibeiRecDicDay> getTag(int userStatus) throws SQLException{
//        Connection connection = null;
//        List<AnjibeiRecDicDay> anjibeiRecDicDayList = new ArrayList<>();
//        try{
//            connection = getDataSource().getConnection();
//            String sql = "SELECT * FROM anjibei_rec_dic_day WHERE dic_custom_sid = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setObject(1, userStatus);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                AnjibeiRecDicDay anjibeiRecDicDay = new AnjibeiRecDicDay();
//                anjibeiRecDicDay.setDicDaySid(rs.getInt("dic_day_sid"));
//                anjibeiRecDicDay.setDicCustomSid(rs.getInt("dic_custom_sid"));
//                anjibeiRecDicDay.setDicDayContent(rs.getString("dic_day_content"));
//                anjibeiRecDicDayList.add(anjibeiRecDicDay);
//            }
//        }catch (Exception e){
//            throw e;
//        } finally {
//            if (connection != null)
//                connection.close();
//        }
//        return anjibeiRecDicDayList;
//    }
}
