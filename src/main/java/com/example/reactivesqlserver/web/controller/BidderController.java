package com.example.reactivesqlserver.web.controller;

import com.example.reactivesqlserver.persistence.entities.Bidder;
import com.example.reactivesqlserver.persistence.repositories.BidderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("bidders")
public class BidderController {

    private final BidderRepository bidderRepository;

    public BidderController(BidderRepository bidderRepository) {
        this.bidderRepository = bidderRepository;
    }

    @GetMapping
    public Flux<Bidder> list() {
        return bidderRepository.findAll();
    }
}

