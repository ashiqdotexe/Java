
package vehicle;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

ParkingSpot spot = new ParkingSpot();

int total_level = 0;

int spot_row = 0;

int spot_level = 0;

int level = 0;

String whatType = "a";

boolean isNumber;

// Getting the inputs required

@SuppressWarnings("resource")

Scanner input = new Scanner(System.in);

// Input checking to make sure only integers are entered.

do {

System.out.print("How many levels do you want in your parking lot? ");

if (input.hasNextInt()) {

isNumber = true;

total_level = input.nextInt();

} else {

System.out.println("Sorry, invalid input: Please try again:");

isNumber = false;

input.next();

}

} while (isNumber == false);

do {

System.out.print("How many spots do you want in each level? ");

if (input.hasNextInt()) {

isNumber = true;

spot_level = input.nextInt();

} else {

System.out.println("Sorry, invalid input: Please try again:");

isNumber = false;

input.next();

}

} while (isNumber == false);

do {

System.out.print("How many spots do you want in each row? ");

if (input.hasNextInt()) {

isNumber = true;

spot_row = input.nextInt();

} else {

System.out.println("Sorry, invalid input: Please try again:");

isNumber = false;

input.next();

}

} while (isNumber == false);

// Setting the new inputs. If invalid input, default is used.

if (total_level >= 0 && spot_row >= 0 && spot_level >= 0) {

spot.setRow(spot_row);

spot.setLevel(spot_level);

spot.setTotalLevel(total_level);

}

spot.setLarge();

spot.setCompact();

spot.setMotorcycle();

// System.out.print("Total level: " + spot.getNumOfLevel());

// System.out.println("Total row: " + spot.getTotalLevel());

// Creating the lot

spot.createLot();

// spot.printLot();

// Asking the user what level they want to park on

while (level != -1) {

System.out.print("What level would you like to park in?[-1 to end]: ");

level = input.nextInt();

// spot.setParkLevel(level);

if (level < 0 || level > total_level) {

System.out.print("Invalid level, ending program...");

System.exit(0);

}

// Getting the type of car

System.out.println("Choose your car type:\nBus: B\nCar: C\nMotorcycle: M");

System.out.print("Please enter your choice: ");

whatType = input.next();

whatType = whatType.trim();

whatType = whatType.toLowerCase();

char[][] lot = spot.getLot();

// System.out.println("Here's the ARRAY!");

// System.out.println(Arrays.deepToString(lot));

if (whatType.charAt(0) == 'b') {

Bus b = new Bus();

lot = b.parkBus(lot, level, spot_row);

}

else if (whatType.charAt(0) == 'c') {

Car c = new Car();

lot = c.parkCar(lot, level);

}

else if (whatType.charAt(0) == 'm') {

MotorCycle m = new MotorCycle();

lot = m.parkMotorcycle(lot, level);

}

spot.setLot(lot);

spot.printLot();

}

}

}
