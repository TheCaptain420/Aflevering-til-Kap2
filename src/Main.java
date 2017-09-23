import java.util.Scanner;

public class Main {
    //Har "commented" alle løste opgaver, så Scanner ikke ødelægger det, og jeg ikke skal lave 8 classes.
    // Mads Nielsen.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Opgave 2.1
       /*
        System.out.println("Enter Miles: ");
        double miles = input.nextDouble();
        double kilome = miles * 1.6;

        System.out.println(miles +" miles is " + kilome + " kilometres.");
        */

        //Opgave 2.2
        /*
        System.out.println("Enter length of triangle : ");
        double side = input.nextDouble();
        double area = (((Math.sqrt(3))/4)*(side*side));
        double volume = area * side;
        System.out.println("The volume is : " + volume);
        */

        //Opgave 2.3
        /*
        System.out.println("Enter Meter :");
        double meter = input.nextDouble();
        double feet = meter*3.2786;
        System.out.println(meter + " meter er det samme som " + feet + " fod.");
        */

        //Opgave 2.8
        /*
        System.out.println("Enter Time Zone (GMT) : ");
        int tidz = input.nextInt();

        //ms
        long ms = System.currentTimeMillis();

        //s
        long s = ms / 1000;

        //Current seconds
        long currentS = s % 60;

        //min
        long min = s / 60;

        //Current Minuts
        long currentMin = min%60;

        //Hours
        long hours=min/60;

        //Current Hour
        long currentHour = (hours%24)+tidz;

        System.out.println("Time is: " +currentHour+":" +currentMin+ ":"+currentS);
        */

        //Opgave 2.11
        /*
        System.out.println("Enter years :");
        int years = input.nextInt();

        //31 556 926 seconds in a year
        //One birth every 7 seconds
        //One death every 13 seconds
        //One new immigrant every 45 second
        int totalBornPrYear = 31556926/7;
        int totalDeathPrYear = 31556926/13;
        int totalImmiPrYear = 31556926/45;

        int totalIncreasePrYear = ((totalBornPrYear+totalImmiPrYear)-totalDeathPrYear)*years;
        System.out.println("Antal Mennesker tilføjet : "+totalIncreasePrYear + ".");
        */

        //Opgave 2.15
        /*
        System.out.println("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Now enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double udenKvadr = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double medKvadr = Math.pow(udenKvadr, 0.5);

        System.out.println("Distance between the two points :" + medKvadr);
        */

        //Opgave 2.23
        //Har ændret det til danske værdier fordi metric > imperial.
        /*
        System.out.print("Enter driving distance in KM : ");
        double distance = input.nextDouble();
        System.out.print("Enter km/l for your car : ");
        double kml = input.nextDouble();
        System.out.print("Enter price(DKK) of litre : ");
        double prisPr = input.nextDouble();

        double totalPrice = (distance/kml) *  prisPr ;
        System.out.println("Price for the Journy :" + totalPrice +" dkk.");
        */



    }
}
