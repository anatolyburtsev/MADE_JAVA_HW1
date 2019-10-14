package ca.trade.approach1;

import ca.trade.approach1.exceptions.UnknownTradeTypeException;
import ca.trade.approach1.model.api.TradeDefinition;
import ca.trade.approach1.model.trade.*;

public class Converter {
    public AbstractTrade convertApiToData(TradeDefinition tradeDefinition) {
        int tradePrice = tradeDefinition.getPrice();
        switch (tradeDefinition.getType()) {
            case IR_SWAP:
                return new IrSwapTrade(tradePrice);
            case BOND:
                return new BondTrade(tradePrice);
            case FX_SPOT:
                return new FxSpotTrade(tradePrice);
            case COMMODITY_SPOT:
                return new CommoditySpotTrade(tradePrice);
            default:
                throw new UnknownTradeTypeException(String.valueOf(tradeDefinition.getType()));
        }
    }
}
