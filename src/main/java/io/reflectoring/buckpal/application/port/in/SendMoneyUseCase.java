package io.reflectoring.buckpal.application.port.in;

import io.reflectoring.buckpal.application.port.in.SendMoneyCommand;

public interface SendMoneyUseCase {

    boolean sendMoney(SendMoneyCommand command);

}
