package com.inditex.hiring.application.dto.offers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
public class OfferQuery {
    @NotNull
    private Long offerId;
}
