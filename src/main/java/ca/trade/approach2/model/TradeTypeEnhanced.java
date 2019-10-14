package ca.trade.approach2.model;

import ca.trade.approach1.model.trade.*;

public enum TradeTypeEnhanced implements TradeCreator {
    FX_SPOT {
        public AbstractTrade createTrade(int price) {
            return new FxSpotTrade(price);
        }
    },
    BOND {
        public AbstractTrade createTrade(int price) {
            return new BondTrade(price);
        }
    },
    COMMODITY_SPOT {
        public AbstractTrade createTrade(int price) {
            return new CommoditySpotTrade(price);
        }
    },
    IR_SWAP {
        public AbstractTrade createTrade(int price) {
            return new IrSwapTrade(price);
        }
    }

}
