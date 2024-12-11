package fs.four.dropout.admin.service;


import fs.four.dropout.community.vo.CommunityVO;
import fs.four.dropout.user.vo.UserVO;

import java.util.List;

public interface AdminService {

    public List listUsers() throws Exception;

    public List listCommunity() throws Exception;

    public int removeUser(String id) throws Exception;

    public int removeCommunity(String number) throws Exception;

    List<UserVO> selectUserList(UserVO userVO);
    List<CommunityVO> selectCommunityList(CommunityVO communityVO);
}
