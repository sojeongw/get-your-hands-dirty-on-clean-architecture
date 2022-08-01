package io.reflectoring.buckpal.account.application.port.in;

import io.reflectoring.buckpal.account.domain.Money;
import io.reflectoring.buckpal.shared.SelfValidating;
import io.reflectoring.buckpal.account.domain.Account.AccountId;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

    @NotNull
    private final AccountId sourceAccountId;
    @NotNull
    private final AccountId targetAccountId;
    @NotNull
    private final Money money;

    public SendMoneyCommand(AccountId sourceAccountId, AccountId targetAccountId, Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;

        this.validateSelf();
    }
}
