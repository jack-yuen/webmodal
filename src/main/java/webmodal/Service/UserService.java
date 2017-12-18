package webmodal.Service;

import webmodal.Pojo.User;

public interface UserService {
	int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User findByName(String name);
    
    int selectInsertId();
}
