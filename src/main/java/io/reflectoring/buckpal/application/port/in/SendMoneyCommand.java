package io.reflectoring.buckpal.application.port.in;

import io.reflectoring.buckpal.domain.AccountId;
import io.reflectoring.buckpal.domain.Money;
import io.reflectoring.buckpal.shared.SelfValidating;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
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
