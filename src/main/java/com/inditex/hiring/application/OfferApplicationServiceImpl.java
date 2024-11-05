package com.inditex.hiring.application;

import com.inditex.hiring.application.dto.create.CreateOfferCommand;
import com.inditex.hiring.application.dto.create.CreateOfferResponse;
import com.inditex.hiring.application.ports.in.OfferApplicationService;
import com.inditex.hiring.domain.models.entity.Offer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Collections;
import java.util.List;

@Slf4j
@Validated
@Service
public class OfferApplicationServiceImpl implements OfferApplicationService {




    @Override
    public List<Offer> getOffers(int limit) {
        return Collections.emptyList();
    }

    @Override
    public Offer getOfferById(String offerId) {
        return null;
    }

    @Override
    public CreateOfferResponse createOffer(CreateOfferCommand createOfferCommand) {
        return null;
    }

    @Override
    public String removeOffer(String offerId) {
        return "";
    }
}
