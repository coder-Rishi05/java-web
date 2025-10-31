/*
31. Write a Java program to create a class called Car with private instance variables 
company_name, model_name, year, and mileage. Provide public getter and setter methods 
to access and modify the company_name, model_name, and year variables. 
However, only provide a getter method for the mileage variable.
*/

class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    // Constructor to initialize values
    public Car(String company_name, String model_name, int year, double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }

    // Getter and Setter for company_name
    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    // Getter and Setter for model_name
    public String getModelName() {
        return model_name;
    }

    public void setModelName(String model_name) {
        this.model_name = model_name;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter only for mileage
    public double getMileage() {
        return mileage;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 18.5);

        System.out.println("Company Name: " + car.getCompanyName());
        System.out.println("Model Name: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage() + " km/l");

        // Modifying company, model, and year
        car.setCompanyName("Honda");
        car.setModelName("Civic");
        car.setYear(2022);

        System.out.println("\nAfter modification:");
        System.out.println("Company Name: " + car.getCompanyName());
        System.out.println("Model Name: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage (unchanged): " + car.getMileage() + " km/l");
    }
}

/*
Sample Output:
Company Name: Toyota
Model Name: Corolla
Year: 2020
Mileage: 18.5 km/l

After modification:
Company Name: Honda
Model Name: Civic
Year: 2022
Mileage (unchanged): 18.5 km/l
*/
