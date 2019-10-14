package ca.trade.approach1;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Service service = Service.builder()
                .converter(new Converter())
                .gson(new Gson()).build();

        if (args.length != 1) {
            throw new RuntimeException("Excepting only 1 argument - filepath");
        }
        String filepath = args[0];
        service.processTrade(filepath);
    }
}
