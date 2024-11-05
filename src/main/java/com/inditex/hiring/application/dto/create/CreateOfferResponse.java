package com.inditex.hiring.application.dto.create;

import com.inditex.hiring.domain.models.vo.OfferStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Getter
@Builder
@AllArgsConstructor
public class CreateOfferResponse {
    @NotNull
    private final Long offerId;
    @NotNull
    private final OfferStatus OfferStatus;
    @NotNull
    private final Timestamp createdAt;
}
