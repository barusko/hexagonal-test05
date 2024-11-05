package com.inditex.hiring.infraestructure.rest;

import com.inditex.hiring.domain.models.entity.Offer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/offers", produces = "application/vnd.api.v1+json")
public class OfferController {

    @GetMapping()
    public ResponseEntity<List<Offer>> getAllOffers() {
        return null;
    }



}
