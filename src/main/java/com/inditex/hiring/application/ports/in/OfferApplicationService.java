package com.inditex.hiring.application.ports.in;

import com.inditex.hiring.application.dto.create.CreateOfferCommand;
import com.inditex.hiring.application.dto.create.CreateOfferResponse;
import com.inditex.hiring.domain.models.entity.Offer;

import javax.validation.Valid;
import java.util.List;

public interface OfferApplicationService {
    List<Offer> getOffers(int limit);
    Offer getOfferById(String offerId);
    CreateOfferResponse createOffer(@Valid  CreateOfferCommand createOfferCommand);
    String removeOffer(String offerId);
}
