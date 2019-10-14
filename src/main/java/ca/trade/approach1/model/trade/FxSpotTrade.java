package ca.trade.approach1.model.trade;

import lombok.NonNull;

public class FxSpotTrade extends AbstractTrade {
    public FxSpotTrade(@NonNull Integer price) {
        super(price);
    }
}
