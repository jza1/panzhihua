package com.jz.service;

public interface loginService {
//    boolean findall(String username, String password);
    int findall(String username, String password,String typ);
    int findall1(String workersName,String workersPassword,String typ);
    int findall2(String customerName,String customerPassword,String typ);
}
