# ISFScheduler
Task for Ocado:

!- IMPORTANT -!
Checking the data that is in the store and orders files, I am not sure that for all tests the output data given in the file agreed 100%,
so my output data may differ from the data in the output file
!-------------!

!-INFORMATIONS ABOUT PROJECT-!
Project contains classes:
Store (Store object class)
ParseStore (Parsing store.json)
Order (Order object)
ParseOrder (Parsing orders.json)
SortOrders (small class sorting orders by complete-by)
Main (Run classs)
AssignOrders (algorithm)
!-END-!

How to open: 
1.Clone repository
2. If needed choose SDK 17 (In intellij IDEA: Right click on project -> Open Module Settings -> Modules ->  Dependencies -> Module SDK -> Choose 17)
3. Build a project

How to run: 
1. Open Terminal
2. Insert command:
Should be something like this:
java -jar *your_local_path*\ISFScheduler\out\artifacts\ISFScheduler_jar\ISFScheduler.jar parameter1 parameter2

where: 
ISFScheduler.jar is a .jar file in project
parameter1 is .JSON file path for store
parameter2 is .JSON file path for orders

For example in my case full command is: 

java -jar C:\Users\stefa\OneDrive\Pulpit\ISFScheduler\out\artifacts\ISFScheduler_jar\ISFScheduler.jar C:\Users\stefa\OneDrive\Pulpit\zadanie-java\self-test-data\complete-by\store.json C:\Users\stefa\OneDrive\Pulpit\zadanie-java\self-test-data\complete-by\orders.json

Output is in form of:
picker-id order-id picking-start-time


