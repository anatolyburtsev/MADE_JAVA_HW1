package ca.trade.approach1.api;

import ca.trade.approach1.TradeType;
import ca.trade.approach1.trade.*;
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

    public AbstractTrade toTrade() {
        int tradePrice = getPrice();
        switch (getType()) {
            case IR_SWAP:
                return new IrSwapTrade(tradePrice);
            case BOND:
                return new BondTrade(tradePrice);
            case FX_SPOT:
                return new FxSpotTrade(tradePrice);
            case COMMODITY_SPOT:
                return new CommoditySpotTrade(tradePrice);
            default:
                throw new RuntimeException("Unknown trade type: " + getType());
        }
    }
}
