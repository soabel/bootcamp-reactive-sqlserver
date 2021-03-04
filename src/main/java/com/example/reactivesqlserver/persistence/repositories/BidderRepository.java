package com.example.reactivesqlserver.persistence.repositories;

import com.example.reactivesqlserver.persistence.entities.Bidder;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BidderRepository extends ReactiveCrudRepository<Bidder, Long> {
}

