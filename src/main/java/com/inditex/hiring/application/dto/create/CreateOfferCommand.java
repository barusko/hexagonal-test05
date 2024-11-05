package com.inditex.hiring.application.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Getter
@Builder
@AllArgsConstructor
public class CreateOfferCommand {
    @NotNull
    private final Long offerId;
    @NotNull
    private final Long brandId;
    @NotNull
    private final Timestamp startDate;
    @NotNull
    private final Timestamp endDate;
    @NotNull
    private final Integer priceListId;
    @NotNull
    private final String productPartNumber;
    @NotNull
    private final int priority;
    @NotNull
    private final Long price;
    @NotNull
    private final String currencyIso;

}
