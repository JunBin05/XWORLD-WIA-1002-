a. Identify the instance variables for each of the class (i.e. Dispenser, Cash Register, Candy Machine)
-> Dispenser Class: String type, double cost, int stock
-> Cash Register: double balance
-> Candy Machine: BagInterface <Dispenser> machine, CashRegister register

b. Identify the methods/operations for each of the class (i.e. Dispenser, Cash Register, Candy Machine)
-> Dispenser: boolean releaseItem(), int getCurrentQuantity(), double getCost()
-> Candy Machine: String showProduct(), boolean chooseToBuy(double moneyReceive, Dispenser product), boolean addItem(Dispenser product), boolean removeItem(Dispenser product)
-> Cash Register: double calculateChange(double charge, double moneyReceive), double getCurrentBalance()

c. Produce a UML class diagram to represent the three classes


