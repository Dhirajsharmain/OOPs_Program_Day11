# OOPs_Program_Day11

1. JSON Inventory Data Management of Rice, Pulses and Wheats
   
   **a. Desc ->** Create a JSON file having Inventory Details for Rice, Pulses and Wheats
   with properties name, weight, price per kg.
   
   **b. Use Library** : Java JSON Library, For IOS JSON Library use
   NSJSONSerialization for parsing the JSON.
   
   **c. I/P ->** read in JSON File
   
   **d. Logic ->** Get JSON Object in Java or NSDictionary in iOS. Create Inventory
   Object from JSON. Calculate the value for every Inventory.
   
   **e. O/P ->** Create the JSON from Inventory Object and output the JSON String

   
2. **Inventory Management Program**

   **a. Desc ->** Extend the above program to Create InventoryManager to manage the
   Inventory. The Inventory Manager will use InventoryFactory to create Inventory
   Object from JSON. The InventoryManager will call each Inventory Object in its list
   to calculate the Inventory Price and then call the Inventory Object to return the
   JSON String. The main program will be with InventoryManager

   **b. I/P ->** read in JSON File

   **c. Logic ->** Get JSON Object in Java or NSDictionary in iOS. Create Inventory
   Object from JSON. Calculate the value for every Inventory.

   **d. O/P ->** Create the JSON from Inventory Object and output the JSON String.
