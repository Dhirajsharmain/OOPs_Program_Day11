
import model.InventoryMap;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class InventoryFactory {
    protected InventoryMap inventory;

    /**
     * Method for reading the Json file and convert to java object using Jackson ObjectMapper
     */
    protected void readJsonFile() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // JSON file to Java object
            inventory = mapper.readValue(new File("E:\\BridgeLabs Training\\Java\\OOPs Program\\InventoryDataManagement\\InventoryData.json"), InventoryMap.class);
            System.out.println("Data From JSON File : " + inventory.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for calculating inventory value for rice,wheat,pulses
     */
    protected void calculateValue() {

        for (int i = 0; i < inventory.getRiceList().size(); i++) {
            inventory.getRiceList().get(i).setValue(inventory.getRiceList().get(i).getPricePerKg() * inventory.getRiceList().get(i).getWeight());
            inventory.getPulsesList().get(i).setValue(inventory.getPulsesList().get(i).getPricePerKg() * inventory.getPulsesList().get(i).getWeight());
            inventory.getWheatList().get(i).setValue(inventory.getWheatList().get(i).getPricePerKg() * inventory.getWheatList().get(i).getWeight());
        }
    }


    /**
     * Method for converting the java object to Json string and writing into a json file using Jackson ObjectMapper
     */
    protected void writeToJsonFile() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(Paths.get("CalculatedInventoryData.json").toFile(), inventory);
            String jsonString = mapper.writeValueAsString(inventory);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
