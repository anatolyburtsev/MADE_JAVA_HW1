package ca.trade.approach2.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class TradeDefinitionEnhanced {
    @NonNull
    private final TradeTypeEnhanced type;
    @NonNull
    private final Integer price;

}
