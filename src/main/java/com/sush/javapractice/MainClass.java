package com.sush.javapractice;

import com.sush.javapractice.objects.UserSO;
import com.sush.javapractice.screenservices.UserManagementServices;
import com.sush.javapractice.screenservices.impl.UserManagementServicesImpl;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

        UserManagementServices services = new UserManagementServicesImpl();

        UserManagementServicesImpl servicesImpl = new UserManagementServicesImpl();

        UserSO userSO = new UserSO();
        userSO.setUserName("SUSHMAP18");
        userSO.setFirstName("Sushma");
        userSO.setLastName("Yelugoti");

        servicesImpl.addUser(userSO);

        UserSO userSO1 = new UserSO();
        userSO1.setUserName("SUSHMAP18");
        userSO1.setFirstName("Sushmap");
        userSO1.setLastName("Yelugoti");
        servicesImpl.updateUser(userSO1);

        UserSO userSO2 = null;
        servicesImpl.updateUser(userSO2);

        UserSO userSO3 = new UserSO("SUSHMAP18","Sushmap","Yelugoti","Address");
        servicesImpl.addUser(userSO3);

        List<String> namesList = new ArrayList<>();

        //List<String> namesLinkList = new LinkedList<>();

        //Set<String> namesSet = new HashSet<>();

        namesList.add("sushma");
        namesList.add("sivaji");
        namesList.add("dishvita");
        namesList.add("sahith");

        // java 6
        for(int i=0;i<namesList.size();i++){
            System.out.println(namesList.get(i));
        }

        // java 7
        for(String name :namesList){
            System.out.println(name);
        }

        //java8
      List<String> updatedList =  namesList.stream()
                .map(name->name.replace("ta","tha"))
                .filter(name->name.length()>8)
                .collect(Collectors.toList());

        servicesImpl.addUser(updatedList);

    }
}
