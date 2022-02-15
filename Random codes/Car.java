/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

public class Car extends Vehicle {

private char name = 'C';

private int numOfCar = 0;

private int spotsNeeded = 1;

boolean filled = true;

ParkingSpot s = new ParkingSpot();

// Every time a car is added, numOfCar is incremented.

Car() {

super(); // Calls the super class constructor each time so numOfVehicles

// can be incremented.

numOfCar++;

}

// Getter variable to return the number of car.

public int getNumOfCar() {

return numOfCar;

}

public char[][] parkCar(char[][] lot, int level) {

// char[][] lot= new char[s.getTotalLevel()][s.getTotalSpot()];

for (int i = 0; i < lot[0].length; i++) {

if (lot[level][i] == 'c' || lot[level][i] == 'l') {

filled = false;

lot[level][i] = name;

return lot;

}

}

// s.setLot(lot);

if (filled == true) {

System.out.println("Sorry!, There are no spaces available!");

return lot;

}

return lot;

}

// Removing car

public char[][] removeCar(char[][] lot, int level) {

int large = (int) (lot[0].length * 0.2);

int comp = (int) (lot[0].length * 0.6);

int motor = (int) (lot[0].length * 0.2);

for (int i = 0; i < lot[0].length; i++) {

if (lot[level][i] == name) {

filled = true;

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

System.out.println("Sorry! There are no cars to remove.");

}

return lot;

}

}
