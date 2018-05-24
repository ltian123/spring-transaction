package service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import service.UserService;
import dao.UserDao;
import entity.User;

@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add(User user) {
		userDao.insert(user);
		int i=1/0;
	}

	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public List<User> findAll() {
		return userDao.selectAll();
	}

	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public User findById(Integer id) {
		return userDao.selectById(id);
	}

	public void modify(User user) {
		userDao.update(user);
	}

	public void removeById(Integer id) {
		userDao.deleteById(id);
	}

}
