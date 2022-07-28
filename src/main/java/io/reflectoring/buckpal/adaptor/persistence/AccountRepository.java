package io.reflectoring.buckpal.adaptor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface AccountRepository  extends JpaRepository<AccountJpaEntity, Long> {
}
