package ca.trade;

import ca.trade.approach1.trade.FxSpotTrade;
import ca.trade.approach2.TradeDefinitionEnhanced;
import ca.trade.approach2.TradeTypeEnhanced;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ca.trade.TradeConverterTest.TRADE_PRICE_1;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradeTradeConverterEnhancedTest {

    private static final TradeTypeEnhanced TRADE_TYPE_ENHANCED_1 = TradeTypeEnhanced.FX_SPOT;
    private static final TradeDefinitionEnhanced TRADE_ENHANCED_1 = TradeDefinitionEnhanced.builder()
            .price(TRADE_PRICE_1)
            .type(TRADE_TYPE_ENHANCED_1)
            .build();

    @Test
    void testConvert_nonAbstractValidData_success() {
        // given
        TradeDefinitionEnhanced tradeDefinition = TRADE_ENHANCED_1;

        // when
        FxSpotTrade trade = (FxSpotTrade) tradeDefinition.toTrade();

        // then
        assertEquals(TRADE_PRICE_1, trade.getPrice());
    }
}
