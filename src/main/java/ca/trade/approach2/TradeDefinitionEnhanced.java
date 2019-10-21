package ca.trade.approach2;

import ca.trade.approach1.trade.AbstractTrade;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class TradeDefinitionEnhanced {
    @NonNull
    private final TradeTypeEnhanced type;
    private final int price;

    public AbstractTrade toTrade() {
        return getType()
                .createTrade(getPrice());
    }

}
