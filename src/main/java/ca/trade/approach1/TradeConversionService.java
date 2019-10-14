package ca.trade.approach1;

import ca.trade.approach1.exceptions.IncorrectInputDataException;
import ca.trade.approach1.model.api.TradeDefinition;
import ca.trade.approach1.model.trade.AbstractTrade;
import com.google.gson.Gson;
import lombok.Builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Builder
public class TradeConversionService implements TradeService {
    private final Gson gson;
    private final TradeConverter tradeConverter;

    public void processTrade(String filepath) {
        TradeDefinition tradeDefinition = loadTradeFromFile(filepath);
        AbstractTrade trade = tradeConverter.convertApiToData(tradeDefinition);
        System.out.println("Trade processing: " + trade);
    }

    private TradeDefinition loadTradeFromFile(String filepath) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filepath))) {
            return gson.fromJson(br, TradeDefinition.class);
        } catch (IOException ex) {
            throw new IncorrectInputDataException("Invalid data format by path: " + filepath, ex);
        }
    }
}
