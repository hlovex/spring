package com.hlovex.service.impl;

import com.google.common.collect.Lists;
import com.hlovex.service.PetStoreService;

import java.util.List;

public class PetStoreServiceImpl implements PetStoreService {
    public List<String> getUsernameList() {
        return Lists.newArrayList("hlovex");
    }
}
