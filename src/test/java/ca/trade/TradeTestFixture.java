package ca.trade;

import ca.trade.approach1.model.TradeType;
import ca.trade.approach1.model.api.TradeDefinition;
import ca.trade.approach1.model.trade.AbstractTrade;
import ca.trade.approach1.model.trade.FxSpotTrade;
import ca.trade.approach2.model.TradeDefinitionEnhanced;
import ca.trade.approach2.model.TradeTypeEnhanced;

public class TradeTestFixture {
    public static final TradeType TRADE_TYPE_1 = TradeType.FX_SPOT;
    public static final int TRADE_PRICE_1 = 543;
    public static final TradeDefinition TRADE_1 = TradeDefinition.builder()
            .price(TRADE_PRICE_1)
            .type(TRADE_TYPE_1)
            .build();
    public static final Class<? extends AbstractTrade> TRADE_CLASS_1 = FxSpotTrade.class;

    public static final TradeTypeEnhanced TRADE_TYPE_ENHANCED_1 = TradeTypeEnhanced.FX_SPOT;
    public static final TradeDefinitionEnhanced TRADE_ENHANCED_1 = TradeDefinitionEnhanced.builder()
            .price(TRADE_PRICE_1)
            .type(TRADE_TYPE_ENHANCED_1)
            .build();

}
