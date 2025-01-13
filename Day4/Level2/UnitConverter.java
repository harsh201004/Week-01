
public class UnitConverter {
    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmTomiLes = 0.621371;
        return km * kmTomiLes;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm ;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersTofeet = 3.28084;
        return meters * metersTofeet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetTometers = 0.3048;
        return feet * feetTometers;
    }

    public static void main(String[] args) {
        
        double km = 5.0;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        double milesInput = 3.0;
        double kmResult = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmResult + " kilometers.");

        double meters = 10.0;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        double feetInput = 20.0;
        double metersResult = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersResult + " meters.");
    }
}

