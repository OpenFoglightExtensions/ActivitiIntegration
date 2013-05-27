package com.dell.software.forge.activiti.svc.impl;

import org.activiti.engine.ActivitiIllegalArgumentException;
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: stefan
 * Date: 24.05.13
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 */
public class ForgeIdentityService implements IdentityService {

    @Override
    public User newUser(String s) {
        throw new ActivitiIllegalArgumentException("User Creation need to be handled by Foglight");
    }

    @Override
    public void saveUser(User user) {
        throw new ActivitiIllegalArgumentException("User Creation need to be handled by Foglight");
    }

    @Override
    public UserQuery createUserQuery() {
        return new FoglightUserQuery();
    }

    @Override
    public void deleteUser(String s) {
        throw new ActivitiIllegalArgumentException("User Creation need to be handled by Foglight");
    }

    @Override
    public Group newGroup(String s) {
        throw new ActivitiIllegalArgumentException("User Creation need to be handled by Foglight");
    }

    @Override
    public GroupQuery createGroupQuery() {
        return new FoglightGroupQuery();
    }

    @Override
    public void saveGroup(Group group) {
        throw new ActivitiIllegalArgumentException("User Creation need to be handled by Foglight");
    }

    @Override
    public void deleteGroup(String s) {
        throw new ActivitiIllegalArgumentException("User Creation need to be handled by Foglight");
    }

    @Override
    public void createMembership(String s, String s2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteMembership(String s, String s2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean checkPassword(String s, String s2) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAuthenticatedUserId(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setUserPicture(String s, Picture picture) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Picture getUserPicture(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setUserInfo(String s, String s2, String s3) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getUserInfo(String s, String s2) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getUserInfoKeys(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteUserInfo(String s, String s2) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
