package jedis.francojuliohenry;
import java.util.Scanner;

public class Producto 
{
	private String codProducto; // Código del producto
	private String desProducto; // Descripción del producto
	private String unimedida; // Unidad de medida
	private double precioVenta; // Precio de venta
	private String clasificacion; // Clasificación del producto
	private int cantVendida; // Cantidad vendida del producto
	public Producto()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese Código del producto: ");
		this.codProducto = in.nextLine();
		System.out.println("Ingrese Descripción del producto: ");
		in = new Scanner(System.in);
		this.desProducto = in.nextLine();
		System.out.println("Ingrese Unidad de medida del producto: ");
		in = new Scanner(System.in);
		this.unimedida = in.nextLine();
		System.out.println("Ingrese Precio de venta del producto: ");
		in = new Scanner(System.in);
		this.precioVenta = in.nextDouble();
		System.out.println("Ingrese Clasificación del producto: ");
		in = new Scanner(System.in);
		this.clasificacion = in.nextLine();
		this.cantVendida = 0;
	}
	public Producto(String codProducto, String desProducto, String unimedida, double precioVenta, String clasificacion)
	{
		this.codProducto = codProducto;
		this.desProducto = desProducto;
		this.unimedida = unimedida;
		this.precioVenta = precioVenta;
		this.clasificacion = clasificacion;
	}
	public String getData()
	{
		String data = "";
		data = "Producto Código: " + this.getCodProducto() + "\nDescripcion: " + getDesProducto() +
		"\nUnidad de medida: "+ getUnimedida() + "\nPrecio de venta: " + 
		Double.toString(this.getPrecioVenta()) + "\nclasificacion: " + 
		this.getClasificacion() + 
		"\nCantidad Vendida: " + this.getClasificacion() + 	"\n";
		return data;
	}
	public String getData(String key)
	{
		String data = "";
		data = "Producto Código: " + this.getCodProducto() + "\nDescripcion: " + getDesProducto() +
		"\nUnidad de medida: "+ getUnimedida() + "\nPrecio de venta: " + 
		Double.toString(this.getPrecioVenta()) + "\nclasificacion: " + 
		this.getClasificacion() + 
		"\nCantidad Vendida: " + this.getClasificacion() + 	"\n";
		return data;
	}
	public String getCodProducto() 
	{
		return codProducto;
	}
	public void setCodProducto(String codProducto) 
	{
		this.codProducto = codProducto;
	}
	public String getDesProducto() 
	{
		return desProducto;
	}
	public void setDesProducto(String desProducto) 
	{
		this.desProducto = desProducto;
	}
	public String getUnimedida() 
	{
		return unimedida;
	}
	public void setUnimedida(String unimedida) 
	{
		this.unimedida = unimedida;
	}
	public double getPrecioVenta() 
	{
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) 
	{
		this.precioVenta = precioVenta;
	}
	public String getClasificacion() 
	{
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) 
	{
		this.clasificacion = clasificacion;
	}
	public int getCantVendida() 
	{
		return cantVendida;
	}
	public void setCantVendida(int cantVendida) 
	{
		this.cantVendida = cantVendida;
	}
	
	
}
