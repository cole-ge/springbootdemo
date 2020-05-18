package com.gzw.demo.service.inter;

import com.gzw.demo.pojo.SpringbootdemoUser;

import java.util.List;

public interface SpringbootdemoUserService {
    public void saveUser(SpringbootdemoUser user) throws Exception;

    public void updateUser(SpringbootdemoUser user);

    public void deleteUser(String userId);

    public SpringbootdemoUser queryUserById(String userId);

    public List<SpringbootdemoUser> queryUserList(SpringbootdemoUser user);

    public List<SpringbootdemoUser> queryUserListPaged(SpringbootdemoUser user, Integer page, Integer pageSize);

    public SpringbootdemoUser queryUserByIdCustom(String userId);

    public void saveUserTransactional(SpringbootdemoUser user);
}
