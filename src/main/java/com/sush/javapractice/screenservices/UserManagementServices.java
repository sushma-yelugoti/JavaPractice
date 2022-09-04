package com.sush.javapractice.screenservices;

import com.sush.javapractice.objects.UserSO;

import java.util.List;

public interface UserManagementServices {

    public void addUser(UserSO userSO);

    public void addUser(List<String> userNamesList);

    public void updateUser(UserSO userSO);

    public void deleteUser(UserSO userSO);
}
