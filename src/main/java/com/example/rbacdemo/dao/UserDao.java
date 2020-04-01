package com.example.rbacdemo.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rbacdemo.model.SysUser;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface UserDao extends BaseMapper<SysUser> {

  // @Select("select * from sys_user t order by t.id limit #{limit} offset
  // #{offset}")
  // List<SysUser> getUserList(Integer limit, Integer offset);
  // IPage<SysUser> getUserList(Page<?> page);
  //
  // // ${username} 使用字符串拼接， #{username} 使用占位符
  // // @Select("select * from sys_user t where t.username = ${username}")
  // @Select("select * from sys_user t where t.username = #{username}")
  // SysUser getUser(String username);
  //
  // // @Insert("Insert into sys_user(username,password)
  // // values(#{username},#{password})")
  // int save(SysUser user);
  //
  // int updateUser(SysUser user);
  //
  // @Delete("delete from sys_user where id = #{id}")
  // int delete(Long id);
}