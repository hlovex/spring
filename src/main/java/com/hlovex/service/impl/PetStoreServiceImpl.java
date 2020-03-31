package com.hlovex.service.impl;

import com.google.common.collect.Lists;
import com.hlovex.dao.JpaAccountDao;
import com.hlovex.dao.JpaItemDao;
import com.hlovex.service.PetStoreService;

import java.util.List;

public class PetStoreServiceImpl implements PetStoreService {

    private JpaAccountDao accountDao;
    private JpaItemDao itemDao;
    private String className;

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<String> getUsernameList() {
        return Lists.newArrayList("hlovex");
    }
}
