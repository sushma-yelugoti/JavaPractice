package com.sush.javapractice.screenservices.impl;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import com.sush.javapractice.objects.UserSO;
import com.sush.javapractice.screenservices.UserManagementServices;

import java.util.List;

public class UserManagementServicesImpl implements UserManagementServices {


    @Override
    public void addUser(UserSO userSO) {
        System.out.println("ADD User "+userSO.getUserName());
    }

    @Override
    public void addUser(List<String> userNamesList) {
        userNamesList.forEach(System.out::println);
    }

    @Override
    @Nullable
    public void updateUser(UserSO userSO) {
        System.out.println("Update User "+userSO.getUserName());

    }

    @Override
    public void deleteUser(UserSO userSO) {
        System.out.println("Delete User "+userSO.getUserName());
    }

}
