abstract class Vehicle{
	String VehicleNumber;
	String brand;
	double dailyRate;
	 public Vehicle(String VehicleNumber,String brand,double dailyRate){
		this.VehicleNumber=VehicleNumber;
		this.brand=brand;
		this.dailyRate=dailyRate;
	}
	abstract double calculateRent(int days);
	public void printDetails(int days){
		System.out.println("VehicleNumber:"+VehicleNumber);
		System.out.println("dailyRate:$"+dailyRate);
		System.out.println("brand:"+brand);
		System.out.println("total Rent for"+days+"days:$"+calculateRent(days));
}}
class Car extends Vehicle{
	public Car(String VehicleNumber,String brand,double dailyRate){
		super(VehicleNumber,brand,dailyRate);
	}
	double calculateRent(int days){
		return (dailyRate*days);
}}
class Bike extends Vehicle{
	Bike(String VehicleNumber,String brand,double dailyRate){
		super(VehicleNumber,brand,dailyRate);
	}
	double calculateRent(int days){
	return (dailyRate*days)*0.90;
}}
public class VehicleRent{
	public static void main(String[]args){
		Vehicle car=new Car("149","BMW",70);
		Vehicle bike=new Bike("419","yamaha",50);
		System.out.println("Car Rental Details:");
		car.printDetails(5);
		System.out.println("\nBike Rental Details:");
		bike.printDetails(5);
}}

output:
Car Rental Details:
VehicleNumber:149
dailyRate:$70.0
brand:BMW
total Rent for5days:$350.0

Bike Rental Details:
VehicleNumber:419
dailyRate:$50.0
brand:yamaha
total Rent for5days:$225.0

