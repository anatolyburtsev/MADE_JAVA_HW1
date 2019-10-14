package ca.trade.approach2.model;

import ca.trade.approach1.model.trade.AbstractTrade;

public interface ITradeCreator {
    AbstractTrade createTrade(int price);
}
