package io.reflectoring.buckpal.domain;

public class Money {

    private Long amount;

    public Money(Long amount) {
        this.amount = amount;
    }

    static Money add(Money baselineBalance, ActivityWindow activityWindow) {
        return new Money();
    }

    public static Money of(Long amount) {
        return new Money(amount);
    }

    public ActivityWindow negate() {
        return null;
    }

    public boolean isPositive() {
        return false;
    }
}
