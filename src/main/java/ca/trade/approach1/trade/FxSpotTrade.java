package ca.trade.approach1.trade;

import lombok.NonNull;

public class FxSpotTrade extends AbstractTrade {
    public FxSpotTrade(@NonNull Integer price) {
        super(price);
    }
}
