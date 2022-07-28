package io.reflectoring.buckpal.adaptor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface ActivityRepository extends JpaRepository<ActivityJpaEntity, Long> {

    @Query("select a from ActivityJpaEntity a where a.ownerAccountId = :ownerAccountId and a.timestamp >= :since")
    List<ActivityJpaEntity> findByOwnerSince(@Param("ownerAccountId") Long ownerAccountId, @Param("since") LocalDateTime localDateTime);

    @Query("select sum(a.amount) from ActivityJpaEntity a where a.targetAccountId = :accountId and a.ownerAccountId = :ownerAccountId and a.timestamp >= :until")
    List<ActivityJpaEntity> getDepositBalanceUntil(@Param("accountId") Long accountId, @Param("until") LocalDateTime until);

    @Query("select sum(a.amount) from ActivityJpaEntity a where a.sourceAccountId = :accountId and a.ownerAccountId = :accountId and a.timestamp < :until")
    Long getWithdrawalBalanceUtil(@Param("accountId") Long accountId, @Param("until") LocalDateTime until);
}
