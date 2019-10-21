package ca.trade.service;

import ca.trade.approach1.api.TradeDefinition;
import ca.trade.approach1.trade.AbstractTrade;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

@AllArgsConstructor
public class TradeConversionService implements TradeService {
    private final Gson gson;

    public void processTrade(String filepath) {
        TradeDefinition tradeDefinition = loadTradeFromFile(filepath);
        AbstractTrade trade = tradeDefinition.toTrade();
        System.out.println("Trade processing: " + trade);
    }

    @SneakyThrows
    private TradeDefinition loadTradeFromFile(String filepath) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filepath))) {
            return gson.fromJson(br, TradeDefinition.class);
        }
    }
}
