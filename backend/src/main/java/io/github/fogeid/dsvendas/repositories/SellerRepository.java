package io.github.fogeid.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fogeid.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
