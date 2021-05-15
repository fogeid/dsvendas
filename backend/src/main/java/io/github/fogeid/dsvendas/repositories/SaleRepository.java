package io.github.fogeid.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fogeid.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
