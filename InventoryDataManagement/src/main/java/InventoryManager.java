public class InventoryManager extends InventoryFactory {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        //Reading the values from json file.
        inventoryManager.readJsonFile();

        //calculating inventory value for rice,wheat,pulses
        inventoryManager.calculateValue();

        //converting the java object to Json string and writing into a json file
        inventoryManager.writeToJsonFile();
    }
}
