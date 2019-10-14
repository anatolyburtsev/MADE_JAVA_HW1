package ca.trade.approach1.model.trade;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString
public abstract class AbstractTrade {
    @NonNull
    @Getter
    private final Integer price;

    public AbstractTrade(Integer price) {
        this.price = price;
    }
}
