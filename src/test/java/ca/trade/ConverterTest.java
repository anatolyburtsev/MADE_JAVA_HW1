package ca.trade;

import ca.trade.approach1.Converter;
import ca.trade.approach1.model.api.TradeDefinition;
import ca.trade.approach1.model.trade.AbstractTrade;
import ca.trade.approach1.model.trade.FxSpotTrade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ca.trade.TradeTestFixture.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {
    private Converter converter;

    @BeforeEach
    void init() {
        converter = new Converter();
    }

    @Test
    void testConvert_abstractValidData_success() {
        // given
        TradeDefinition tradeDefinition = TRADE_1;

        // when
        AbstractTrade abstractTrade = converter.convertApiToData(tradeDefinition);

        // then
        assertEquals(TRADE_CLASS_1, abstractTrade.getClass());
        assertEquals(TRADE_PRICE_1, abstractTrade.getPrice());
    }

    @Test
    void testConvert_nonAbstractValidData_success() {
        // given
        TradeDefinition tradeDefinition = TRADE_1;

        // when
        FxSpotTrade trade = (FxSpotTrade) converter.convertApiToData(tradeDefinition);

        // then
        assertEquals(TRADE_PRICE_1, trade.getPrice());
    }


}