package com.wxl.testmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wxl.testmybatis.pojo.User;

public interface UserMapper {
	@Select("select id,name,email from user where 1=1")
	@Results({
		@Result(property = "id", column = "id"),
		@Result(property = "name", column = "name"),
		@Result(property = "email", column = "email")
	})
	List<User> getAll();
	
	@Select("select id,name,email from user where id=#{id}")
	@Results({
		@Result(property = "id", column = "id"),
		@Result(property = "name", column = "name"),
		@Result(property = "email", column = "email")
	})
	User getOne(Long id);
	
	@Insert("insert into user(name,email) values(#{name},#{email}) ")
	int save(User user);
	
	@Update("update user set name=#{name},email=#{email} where id=#{id}")
	int update(User user);
	
	@Delete("delete from user where id=#{id}")
	int delete(Long id);
}
