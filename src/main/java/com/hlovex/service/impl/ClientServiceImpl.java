package com.hlovex.service.impl;

import com.hlovex.service.ClientService;

public class ClientServiceImpl implements ClientService {
    private static ClientService clientService = new ClientServiceImpl();
    private ClientServiceImpl() {}

    public static ClientService createInstance() {
        return clientService;
    }

    public String getClient(String clientName) {
        return clientName;
    }
}
