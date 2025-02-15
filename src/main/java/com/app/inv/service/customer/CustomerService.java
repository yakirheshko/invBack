package com.app.inv.service.customer;

import com.app.inv.contracts.customer.AskResponse;
import com.app.inv.service.context.customer.AskContext;

public interface CustomerService {
    AskResponse ask(AskContext askContext);
}