package jedis.francojuliohenry;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura 
{
	private String numFactura;	// Número de serie de la factura
	private String codCliente; // Código del cliente que hace la compra
	private String codVendedor; // Código del vendedor
	public HashMap<String,String> Productos; // Productos de la factura
	private String fecFactura; // Fecha de la factura
	private String codTienda; // Código de la tienda
	private double subfactura; // Subtotal dela venta
	private double igvFactura; // Impuesto general a las ventas 
	private double totalFactura; // Total de la factura
	private String condicion; // Si la factura es al contado o al crédito
	public Factura()
	{
		Productos = new HashMap<String,String>();
		this.subfactura = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese Número de serie de la factura: ");
		this.codCliente = in.nextLine();
		System.out.println("Ingrese Código del cliente que hace la compra: ");
		in = new Scanner(System.in);
		this.codCliente = in.nextLine();
		System.out.println("Código del vendedor: ");
		in = new Scanner(System.in);
		this.codVendedor = in.nextLine();
		Date fechaActual = new Date();
	    SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
	    this.fecFactura = formateador.format(fechaActual);
		System.out.println("Ingrese Código de la tienda: ");
		in = new Scanner(System.in);
		this.codTienda= in.nextLine();
		System.out.println("Ingrese Impuesto general a las ventas: ");
		in = new Scanner(System.in);
		this.igvFactura = in.nextDouble();
		System.out.println("La factura es al contado o al crédito?? ");
		in = new Scanner(System.in);
		this.condicion = in.nextLine();
		int cantidad = 1;	// Cantidad de producto
		double preciototal = 0; // Precio de venta total del producto
		String resp = "n";
		do
		{
			System.out.println("Ingrese un Producto");
			Producto p = new Producto();
			System.out.println("Ingrese Cantidad de productos vendidos: ");
			in = new Scanner(System.in);
			cantidad = in.nextInt();
			if (Productos.containsKey(p.getCodProducto())) 
			{
			    System.out.println("No se puede introducir el producto. El código esta repetido.");
			} 
			else 
			{
				p.setCantVendida(cantidad);
				preciototal = cantidad * p.getPrecioVenta();
				this.subfactura = this.subfactura + preciototal;
				this.totalFactura = this.totalFactura - (this.totalFactura * this.igvFactura);
		        Productos.put(p.getCodProducto(), p.getData());               
		    }
			System.out.println("Desea continuar??");
		} while (!resp.equals("s"));
		
	}
	public Factura(String numFactura, double subfactura, double igvFactura, String condicion, Cliente cliente, Vendedor vendedor, Tienda tienda)
	{
		this.numFactura = numFactura;
		this.codCliente = cliente.getCodCliente();
		this.codVendedor = vendedor.getCodVendedor();
		this.codTienda = tienda.getCodTienda();
		this.subfactura = subfactura;
		this.igvFactura = igvFactura;
		this.condicion = condicion;
	}
	public String getData()
	{
		String data = "";
		data = "Factura Nº: " + this.getNumFactura() + 
		"\nFecha: " + getFecFactura() +
		"\nCodigo del cliente: " + getCodCliente() +
		"\nCodigo del vendedor: " + getCodVendedor() +
		"\nCodigo de la tienda: " + getCodTienda() + "\nProductos Vendidos\n";
		for (Entry<String, String> entry : Productos.entrySet()) 
		{
	    		data = data + entry.getValue();
		}
		data = data + "\n";
		return data;
	}
	public String getNumFactura() 
	{
		return numFactura;
	}
	public void setNumFactura(String numFactura) 
	{
		this.numFactura = numFactura;
	}
	public String getCodCliente() 
	{
		return codCliente;
	}
	public void setCodCliente(String codCliente) 
	{
		this.codCliente = codCliente;
	}
	public String getCodVendedor() 
	{
		return codVendedor;
	}
	public void setCodVendedor(String codVendedor) 
	{
		this.codVendedor = codVendedor;
	}
	public String getFecFactura() 
	{
		return fecFactura;
	}
	public void setFecFactura(String fecFactura) 
	{
		this.fecFactura = fecFactura;
	}
	public String getCodTienda() 
	{
		return codTienda;
	}
	public void setCodTienda(String codTienda) 
	{
		this.codTienda = codTienda;
	}
	public double getSubfactura() 
	{
		return subfactura;
	}
	public void setSubfactura(double subfactura) 
	{
		this.subfactura = subfactura;
	}
	public double getIgvFactura() 
	{
		return igvFactura;
	}
	public void setIgvFactura(double igvFactura) 
	{
		this.igvFactura = igvFactura;
	}
	public double getTotalFactura() 
	{
		return totalFactura;
	}
	public void setTotalFactura(double totalFactura) 
	{
		this.totalFactura = totalFactura;
	}
	public String getCondicion() 
	{
		return condicion;
	}
	public void setCondicion(String condicion) 
	{
		this.condicion = condicion;
	}
	
}
