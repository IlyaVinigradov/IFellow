import java.util.Scanner;

/**
 * BaseConverter
 */
public class BaseConverter {

    private double degrees;
    private boolean celcius = false;
    private boolean kelvins = false;
    private boolean fahrenheit = false;

    public void getDegreesCelcius(double degrees) {
        Scanner scan = new Scanner(System.in);
        this.degrees = scan.nextDouble();
        this.celcius = true;
        scan.close();
    }

    public double setDegrees() {
        return this.degrees;
    }

    public void convertCK() {
        if (this.celcius) {
            this.celcius = false;
            this.kelvins = true;
            this.degrees = this.degrees + 273.15;
        }
    }

    public void convertKC() {
        if (this.kelvins) {
            this.degrees = this.degrees - 273.15;
            this.celcius = true;
            this.kelvins = false;
        }
    }

    public void convertKF() {
        if (this.kelvins) {
            this.degrees = (this.degrees - 273.15) * 9 / 5 + 32;
            this.kelvins = false;
            this.fahrenheit = true;
        }
    }

    public void convertFK() {
        if (this.fahrenheit) {
            this.degrees = (this.degrees - 32) * 5 / 9 + 273.15;
            this.fahrenheit = false;
            this.kelvins = true;
        }
    }

    public void convertCF() {
        if (this.celcius) {
            this.degrees = this.degrees * 9 / 5 + 32;
            this.celcius = false;
            this.fahrenheit = true;
        }
    }

    public void convertFC() {
        if (this.fahrenheit) {
            this.degrees = (this.degrees - 32) * 5 / 9;
            this.celcius = true;
            this.fahrenheit = false;
        }
    }
}