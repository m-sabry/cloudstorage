package com.udacity.jwdnd.course1.cloudstorage.service;

import com.udacity.jwdnd.course1.cloudstorage.mapper.CredentialsMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.Credentials;
import com.udacity.jwdnd.course1.cloudstorage.model.Notes;
import com.udacity.jwdnd.course1.cloudstorage.model.Users;
import org.apache.catalina.startup.CredentialHandlerRuleSet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredentialService {
    private final CredentialsMapper credentialMapper;

    public CredentialService(CredentialsMapper credentialMapper) {
        this.credentialMapper = credentialMapper;
    }

    public void uploadCredential(String url, String username,String key,String password, int userId) {
        credentialMapper.insert(url, username, key, password, userId);
    }

    public void updateCredential(String url, String username, String key, String password, int credentialId){
        credentialMapper.update(url, username, key, password);
    }

    public List<Credentials> getCredentials(int userId) {
        return credentialMapper.getCredentials(userId);
    }
}


