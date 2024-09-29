import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PriceReader {
    private static Map<String, Double> priceMap = new HashMap<>();

    static {
        try {
            loadPricesFromFile("src/price.txt");
        } catch (IOException e) {
            System.out.println("Error loading prices: " + e.getMessage());
        }
    }

    // Method to load prices from a file
    private static void loadPricesFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("=");
            if (parts.length == 2) {
                String productName = parts[0].trim();
                double price = Double.parseDouble(parts[1].trim());
                priceMap.put(productName, price);
            }
        }
        reader.close();
    }

    // Method to get the price of a product
    public static double getPrice(String productName) {
        return priceMap.getOrDefault(productName, 0.0);
    }
}
