package ca.trade.approach1.trade;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public abstract class AbstractTrade {
    @Getter
    private final int price;
}
