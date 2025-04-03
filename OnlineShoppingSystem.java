abstract class Product{
	protected String productId;
	protected String name;
	protected double price;
	public Product(String productId,String name,double price){
		this.productId=productId;
		this.name=name;
		this.price=price;
	}
	public abstract double calculateDiscountPrice();
		public void displayDetails(){
			System.out.println("productId:"+productId);
			System.out.println("name:"+name);
			System.out.println("original price:$"+price);
			System.out.println("Discount price:$"+calculateDiscountPrice());
}}
		class Electronics extends Product{
			public Electronics(String productId,String name,double price)
			{
				super(productId,name,price);
			}
			public double calculateDiscountPrice(){
				return price*0.90;
		}}
		class Clothing extends Product{
			public Clothing(String productId,String name,double price){
				super(productId,name,price);
			}
			public double calculateDiscountPrice()
			{
				return price*0.85;
		}
		}
		public class OnlineShoppingSystem{
			public static void main(String[]args){
				Product laptop=new Electronics("E001","laptop",1000);
				Product tshirt=new Clothing("C001","tshirt",500);
				laptop.displayDetails();
				tshirt.displayDetails();
		}}
		
output:
D:\oops34>java OnlineShoppingSystem
productId:E001
name:laptop
original price:$1000.0
Discount price:$900.0
productId:C001
name:tshirt
original price:$500.0
Discount price:$425.0

