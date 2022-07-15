package io.reflectoring.buckpal.application.port.in;

import io.reflectoring.buckpal.domain.AccountId;
import io.reflectoring.buckpal.domain.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(AccountId accountId);
}
