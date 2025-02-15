package com.app.inv.service.business;

import com.app.inv.contracts.business.CreateBusinessResponse;
import com.app.inv.contracts.customer.AskResponse;
import com.app.inv.service.context.business.CreateBusinessContext;
import com.app.inv.service.context.customer.AskContext;

public interface BusinessService {
    CreateBusinessResponse create(CreateBusinessContext createBusinessContext);
}