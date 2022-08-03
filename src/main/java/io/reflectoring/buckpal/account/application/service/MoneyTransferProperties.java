package io.reflectoring.buckpal.account.application.service;

import io.reflectoring.buckpal.account.domain.Money;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Configuration properties for money transfer use cases.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class MoneyTransferProperties {

  private Money maximumTransferThreshold = Money.of(1_000_000L);

}
