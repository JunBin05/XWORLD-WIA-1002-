package W2.TUTO.Q8;
public void displayList(ArrayList<?> numOfCars, ArrayList<?> milesPerHour){
    System.out.println("--- List 1 Data ---");
    for (Object item : numOfCars) {
        System.out.print(item + " ");
    }
    System.out.println("\n");

    System.out.println("--- List 2 Data ---");
    for (Object item : milesPerHour) {
        System.out.print(item + " ");
    }
    System.out.println("\n");
 }