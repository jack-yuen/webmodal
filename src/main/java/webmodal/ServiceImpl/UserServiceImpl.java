package webmodal.ServiceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import webmodal.IDao.UserMapper;
import webmodal.Pojo.User;
import webmodal.Service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public int deleteByPrimaryKey(String id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(User record) {
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public User findByName(String name) {
		return userMapper.findByName(name);
	}

	@Override
	public int selectInsertId() {
		return userMapper.selectInsertId();
	}

}
