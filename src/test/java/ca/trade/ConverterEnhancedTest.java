package ca.trade;

import ca.trade.approach1.model.trade.FxSpotTrade;
import ca.trade.approach2.ConverterEnhanced;
import ca.trade.approach2.model.TradeDefinitionEnhanced;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ca.trade.TradeTestFixture.TRADE_ENHANCED_1;
import static ca.trade.TradeTestFixture.TRADE_PRICE_1;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterEnhancedTest {
    private ConverterEnhanced converter;

    @BeforeEach
    void init() {
        converter = new ConverterEnhanced();
    }

    @Test
    void testConvert_nonAbstractValidData_success() {
        // given
        TradeDefinitionEnhanced tradeDefinition = TRADE_ENHANCED_1;

        // when
        FxSpotTrade trade = (FxSpotTrade) converter.convertApiToData(tradeDefinition);

        // then
        assertEquals(TRADE_PRICE_1, trade.getPrice());
    }
}
