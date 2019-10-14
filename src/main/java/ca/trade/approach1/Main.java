package ca.trade.approach1;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        TradeConversionService tradeConversionService = TradeConversionService.builder()
                .tradeConverter(new TradeConverter())
                .gson(new Gson()).build();

        if (args.length != 1) {
            throw new RuntimeException("Excepting only 1 argument - filepath");
        }
        String filepath = args[0];
        tradeConversionService.processTrade(filepath);
    }
}
