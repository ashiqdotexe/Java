
package parkinglotproject;


public class ParkingLotProject {

static int numOfVehicles = 0;

// Each time a new vehicle is added, numOfVehicles is incremented.

 {

numOfVehicles++;

}

}

Code(ParkingSpot.java ):
//Removing spot: extra point

public class ParkingSpot {

// Multiple levels, each level has multiple spots

private int NUM_OF_LEVELS = 5;

private int SPOTS_PER_LEVEL = 30;

private int SPOTS_PER_ROW = 10;

private int TOTAL_SPOT = NUM_OF_LEVELS * SPOTS_PER_LEVEL;

private int LEVEL_TO_PARK = 0;

private char[][] spots;;

public int large_spot = (int) (getTotalLevel() * 0.2);

public int compact_spot = (int) (getTotalLevel() * 0.6);

public int motorcycle_spot = (int) (getTotalLevel() * 0.2);

ParkingSpot() {

}

public void createLot() {

// System.out.print(motorcycle.getSpots());

// int motor = motorcycle.getSpots();

// int comp = compact.getSpots();

// int motor = motorcycle.motorcycle_spot;

// int comp = compact.compact_spot;

spots = new char[NUM_OF_LEVELS][SPOTS_PER_LEVEL];

int motor = motorcycle_spot;

int comp = compact_spot;

// Setting the motorcycle spots

for (int i = 0; i < NUM_OF_LEVELS; i++) {

for (int j = 0; j < motor; j++) {

spots[i][j] = 'm';

}

}

// Setting the compact car spots

for (int i1 = 0; i1 < NUM_OF_LEVELS; i1++) {

for (int j = motor; j < comp + motor; j++) {

spots[i1][j] = 'c';

}

}

// Setting large spots

for (int i2 = 0; i2 < NUM_OF_LEVELS; i2++) {

for (int j = comp + motor; j < this.SPOTS_PER_LEVEL; j++) {

spots[i2][j] = 'l';

}

}

}

public void printLot() {

for (int i = 0; i < NUM_OF_LEVELS; i++) {

for (int j = 0; j < SPOTS_PER_LEVEL; j++) {

if (j == 0) {

System.out.print("Level " + i + ": ");

}

if (j % SPOTS_PER_ROW == 0) {

System.out.print(" ");

}

System.out.print(spots[i][j]);

}

System.out.println();

}

}

public boolean isFilled(int level, Vehicle type) {

boolean isFilled = true;

// If the vehicle type can't fit on this row, return false

return isFilled;

}

public int getNumOfRow() {

return SPOTS_PER_ROW;

}

public int levelToPark() {

return LEVEL_TO_PARK;

}

public int getTotalLevel() {

return SPOTS_PER_LEVEL;

}

public int getNumOfLevel() {

return NUM_OF_LEVELS;

}

public int getTotalSpot() {

return TOTAL_SPOT;

}

public char[][] getLot() {

return spots;

}

public void setRow(int spot_row) {

SPOTS_PER_ROW = spot_row;

}

public void setTotalLevel(int total_level) {

NUM_OF_LEVELS = total_level;

}

public void setLevel(int spot_level) {

SPOTS_PER_LEVEL = spot_level;

}

public void setParkLevel(int levelToPark) {

LEVEL_TO_PARK = levelToPark;

}

public void setLot(char[][] lot) {

// spots = lot;

for (int i = 0; i < lot.length; i++) {

for (int j = 0; j < lot[i].length; j++) {

spots[i][j] = lot[i][j];

}

}

}

public void setLarge() {

large_spot = (int) (SPOTS_PER_LEVEL * 0.2);

}

public void setCompact() {

compact_spot = (int) (SPOTS_PER_LEVEL * 0.6);

}

public void setMotorcycle() {

motorcycle_spot = (int) (SPOTS_PER_LEVEL * 0.2);

}

public int getLarge() {

return large_spot;

}

}

Code(MotorCycle.java):
//20% Per level

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

Code(Car.java):
//60% per level

public class Car extends Vehicle {

private char name = 'C';

private int numOfCar = 0;

private int spotsNeeded = 1;

boolean filled = true;

ParkingSpot s = new ParkingSpot();

// Every time a car is added, numOf
