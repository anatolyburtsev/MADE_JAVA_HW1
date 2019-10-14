package ca.trade.approach1.model.trade;

import lombok.NonNull;

public class CommoditySpotTrade extends AbstractTrade {
    public CommoditySpotTrade(@NonNull Integer price) {
        super(price);
    }
}
