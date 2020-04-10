package com.example.rbacdemo;

import javax.annotation.Resource;
import javax.sql.DataSource;

import com.example.rbacdemo.dao.UserDao;
import com.example.rbacdemo.model.SysUser;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RbacdemoApplicationTests {

	@Autowired
	DataSource dataSource;
	@Resource
	UserDao userDao;

	@Test
	void testGetUser() {
		System.out.println(dataSource.getClass());
		System.out.println(userDao.getUser("admin"));
	}

	@Test
	void testInsertUser() {
		final SysUser user = new SysUser();
		user.setUsername("test1");
		user.setPassword("111");
		System.out.println(userDao.save(user));
	}

	@Test
	void testUpdateUser() {
		final SysUser user = new SysUser();
		user.setUsername("test2");
		user.setPassword("111");
		user.setId((long) 5);
		userDao.updateUser(user);
	}

	@Test
	void testDeleteUser() {
		userDao.delete((long) 3);
	}

}
