package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Credentials;
import com.udacity.jwdnd.course1.cloudstorage.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CredentialsMapper {

    @Select("SELECT * FROM CREDENTIALS WHERE userid = #{userId}")
    List<Credentials> getCredentials(int userId);

    @Insert("INSERT INTO CREDENTIALS (url, username, key, password, userid) VALUES(#{url}, #{username}, #{key}, #{password}, #{userId})")
    int insert(String url, String username, String key, String password, int userId);

    @Update("UPDATE CREDENTIALS SET url = #{url}, set username = #{username}, set key = #{key}, set password = #{password}" +
            "  WHERE credentialid = #{credentialId}")
    void update(String url, String username, String key, String password);

}

