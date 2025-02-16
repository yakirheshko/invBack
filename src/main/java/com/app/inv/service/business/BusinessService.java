package com.app.inv.service.business;

import com.app.inv.contracts.business.CreateBusinessResponse;
import com.app.inv.contracts.business.FindRequestsResponse;
import com.app.inv.service.context.business.CreateBusinessContext;
import com.app.inv.service.context.business.ResponseContext;

public interface BusinessService {
    CreateBusinessResponse create(CreateBusinessContext createBusinessContext);
    CreateBusinessResponse get(String deviceId);
    FindRequestsResponse findRequests(String deviceId);
    void response(ResponseContext responseContext);
}