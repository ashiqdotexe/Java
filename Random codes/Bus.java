/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

public class Bus extends Vehicle {

private char name = 'B';

private int numOfBus = 0;

private int spotsNeeded = 5;

boolean filled = true;

ParkingSpot s = new ParkingSpot();

// Every time a bus is added, numOfBus is incremented.

Bus() {

super(); // Calls the super class constructor each time so numOfVehicles

// can be incremented.

numOfBus++;

}

// Getter variable to return the number of bus.

public int getNumOfBus() {

return numOfBus;

}

public char[][] parkBus(char[][] lot, int level, int row) {

// char[][] lot= new char[s.getTotalLevel()][s.getTotalSpot()];

// System.out.print("Total Spot: " + s.getTotalLevel());

for (int i = 0; i < lot[0].length; i++) {

// System.out.print("Total Spot: " + s.getTotalLevel());

if (i + 5 <= lot[0].length) { // This <=

// if ((lot[0].length*.2)

if (row >= 5) {

if (lot[level][i] == 'l' && lot[level][i + 1] == 'l' && lot[level][i + 2] == 'l'

&& lot[level][i + 3] == 'l' && lot[level][i + 4] == 'l') {

filled = false;

lot[level][i] = name;

lot[level][i + 1] = name;

lot[level][i + 2] = name;

lot[level][i + 3] = name;

lot[level][i + 4] = name;

return lot;

}

}

}

// System.out.println("Here's the ARRAY!");

// System.out.println(Arrays.deepToString(lot));

}

// s.setLot(lot);

if (filled == true) {

System.out.println("Sorry!, There are no spaces available!");

return lot;

}

return lot;

}

// Removing bus

public char[][] removeBus(char[][] lot, int level) {

for (int i = 0; i < lot[0].length; i++) {

if (lot[level][i] == name && lot[level][i + 1] == name && lot[level][i + 2] == name

&& lot[level][i + 3] == name && lot[level][i + 4] == name) {

filled = true;

lot[level][i] = 'l';

lot[level][i + 1] = 'l';

lot[level][i + 2] = 'l';

lot[level][i + 3] = 'l';

lot[level][i + 4] = 'l';

return lot;

}

}

filled = false;

if (filled == false) {

System.out.println("Sorry! There are no buses to remove.");

}

return lot;

}

}
