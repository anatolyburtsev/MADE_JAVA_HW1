package ca.trade.approach2;

import ca.trade.approach1.trade.AbstractTrade;

public interface TradeCreator {
    AbstractTrade createTrade(int price);
}
