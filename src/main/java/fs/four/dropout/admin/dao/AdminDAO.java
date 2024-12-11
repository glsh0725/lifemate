package fs.four.dropout.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import javax.xml.crypto.Data;
import java.util.List;

@Mapper
public interface AdminDAO {

    public List selectAllUserList() throws DataAccessException;

    public List selectAllCommunityList() throws DataAccessException;

    public int deleteUser(String id) throws DataAccessException;

    public int deleteCommunity(String number) throws DataAccessException;

}
