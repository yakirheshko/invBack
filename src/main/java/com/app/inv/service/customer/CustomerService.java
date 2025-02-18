package com.app.inv.service.customer;

import com.app.inv.contracts.business.FindRequestsResponse;
import com.app.inv.contracts.customer.AskResponse;
import com.app.inv.service.context.customer.AskContext;

public interface CustomerService {
    AskResponse ask(AskContext askContext);
    FindRequestsResponse requests(String deviceId);
    void deactivateRequest(String deviceId);
}