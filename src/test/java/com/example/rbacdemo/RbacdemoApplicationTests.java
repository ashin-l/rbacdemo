package com.example.rbacdemo;

import java.util.HashMap;

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
		HashMap map = new HashMap<>();
		map.put("username", "admin");
		System.out.println(userDao.selectByMap(map));
	}

	@Test
	void testInsertUser() {
		final SysUser user = new SysUser();
		user.setUsername("test1");
		user.setPassword("111");
		System.out.println(userDao.insert(user));
	}

	@Test
	void testUpdateUser() {
		final SysUser user = new SysUser();
		user.setUsername("test2");
		user.setPassword("111");
		user.setId((long) 5);
		userDao.updateById(user);
	}

	@Test
	void testDeleteUser() {
		userDao.deleteById(3);
	}

}
