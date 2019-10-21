package ca.trade;

import ca.trade.service.TradeConversionService;
import ca.trade.service.TradeService;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        TradeService tradeConversionService = new TradeConversionService(new Gson());

        if (args.length != 1) {
            throw new RuntimeException("Excepting only 1 argument - filepath");
        }
        String filepath = args[0];
        tradeConversionService.processTrade(filepath);
    }
}
