/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.*;

public class MotorCycle extends Vehicle {

private char name = 'M';

private int numOfMotorcycle = 0;

private int spotsNeeded = 1;

boolean filled = true;

ParkingSpot s = new ParkingSpot();

// Every time a motorcycle is added, numOfMotorcycle is incremented.

MotorCycle() {

super(); // Calls the super class constructor each time so numOfVehicles

// can be incremented.

numOfMotorcycle++;

}

// Getter variable to return the number of motorcycles.

public int getNumOfMotorcycle() {

return numOfMotorcycle;

}

public char[][] parkMotorcycle(char[][] lot, int level) {

// char[][] lot= new char[s.getTotalLevel()][s.getTotalSpot()];

for (int i = 0; i < lot[0].length; i++) {

if (lot[level][i] == 'm' || lot[level][i] == 'c' || lot[level][i] == 'l') {

filled = false;

lot[level][i] = name;

return lot;

}

// We need to return the lot and get main function to set it.

}

// s.setLot(lot);

if (filled == true) {

System.out.println("Sorry!, There are no spaces available!");

return lot;

}

return lot;

}

// Removing motorcycle

public char[][] removeMotorcycle(char[][] lot, int level) {

int large = (int) (lot[0].length * 0.2);

int comp = (int) (lot[0].length * 0.6);

int motor = (int) (lot[0].length * 0.2);

for (int i = 0; i < lot[0].length; i++) {

if (lot[level][i] == name) {

filled = true;

if (i < motor) {

lot[level][i] = 'm';

return lot;

}

if (i >= motor && i < comp + motor) {

lot[level][i] = 'c';

return lot;

}

if (i >= comp + motor && i < lot.length) {

lot[level][i] = 'l';

return lot;

}

}

}

filled = false;

if (filled == false) {

System.out.println("Sorry! There are no motorcycles to remove.");

}

return lot;

}

}