package ca.trade;

import ca.trade.approach1.TradeType;
import ca.trade.approach1.api.TradeDefinition;
import ca.trade.approach1.trade.AbstractTrade;
import ca.trade.approach1.trade.FxSpotTrade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TradeConverterTest {
    private static final TradeType TRADE_TYPE_1 = TradeType.FX_SPOT;
    static final int TRADE_PRICE_1 = 543;
    private static final TradeDefinition TRADE_1 = TradeDefinition.builder()
            .price(TRADE_PRICE_1)
            .type(TRADE_TYPE_1)
            .build();
    private static final Class<? extends AbstractTrade> TRADE_CLASS_1 = FxSpotTrade.class;

    void testConvert_abstractValidData_success() {
        // given
        TradeDefinition tradeDefinition = TRADE_1;

        // when
        AbstractTrade abstractTrade = tradeDefinition.toTrade();

        // then
        assertEquals(TRADE_CLASS_1, abstractTrade.getClass());
        assertEquals(TRADE_PRICE_1, abstractTrade.getPrice());
    }

    @Test
    void testConvert_nonAbstractValidData_success() {
        // given
        TradeDefinition tradeDefinition = TRADE_1;

        // when
        FxSpotTrade trade = (FxSpotTrade) tradeDefinition.toTrade();

        // then
        assertEquals(TRADE_PRICE_1, trade.getPrice());
    }


}