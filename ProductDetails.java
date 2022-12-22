package ExceptionHandeling;

import java.io.IOException;

class Product
{
	int productId;
	String productName;
	double productPrice;
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	
}
public class ProductDetails {
	static Product product[]=new Product[2];
	public static void getProductById(int id)
			throws ProductIdNotFoundException,IOException
	{
		for(int i=0;i<product.length;i++)
		{
			if(product[i].getProductId()==id)
			{
				System.out.println("Product id : "+product[i].getProductId());
				System.out.println("Product name : "+product[i].getProductName());
				System.out.println("Product id : "+product[i].getProductPrice());
				break;
			}
			else
			{
				throw new ProductIdNotFoundException("Product id not found");
			}
		}
	}
public static void main(String []args)
{
	product[0]=new Product(2345,"Mobile",40000);
	product[1]=new Product(6789,"laptop",50000);
	
	try
	{
		ProductDetails.getProductById(2);
	}
	
	//catch(ProductIdNotFoundException p)
	//{
		//System.out.println(p.getMessage());
	//p.printStackTrace();
	//}
	
	catch(IOException p)
		{
		System.out.println(p.getMessage());
		p.printStackTrace();
		}
	catch(Exception e)
	{
		System.out.println("e.getMessage");
	}
	
	
	
}
}
