package ca.trade.approach2;

import ca.trade.approach1.model.trade.AbstractTrade;
import ca.trade.approach2.model.TradeDefinitionEnhanced;

public class TradeConverterEnhanced {
    public AbstractTrade convertApiToData(TradeDefinitionEnhanced tradeDefinition) {
        return tradeDefinition.getType()
                .createTrade(tradeDefinition.getPrice());
    }
}
