package ca.trade.approach1.model.trade;

import lombok.NonNull;

public class BondTrade extends AbstractTrade {
    public BondTrade(@NonNull Integer price) {
        super(price);
    }
}
