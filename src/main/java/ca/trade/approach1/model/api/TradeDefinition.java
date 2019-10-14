package ca.trade.approach1.model.api;

import ca.trade.approach1.model.TradeType;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class TradeDefinition {
    @NonNull
    private final TradeType type;
    @NonNull
    private final Integer price;
}
