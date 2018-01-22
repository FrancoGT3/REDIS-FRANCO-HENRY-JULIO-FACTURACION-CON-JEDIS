package jedis.francojuliohenry;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import redis.clients.jedis.*;

public class Principal 
{
	private Jedis jedis = new Jedis("localhost");
	private String nombreLista;
	private HashMap<String,String> Clientes; // Clientes
	private HashMap<String,String> Productos; // Productos
	private HashMap<String,String> Tiendas; // Tiendas
	private HashMap<String,String> Vendedores; // Vendedores
	private HashMap<String,String> Facturas; // Facturas
	//insert
	public void insertarCliente()
	{
		Cliente registro = new Cliente();
		this.nombreLista = "clientes";
		this.jedis.sadd(nombreLista,registro.getCodCliente());
		this.Clientes.put(registro.getCodCliente(), registro.getData());
	}
	public void insertarProducto()
	{
		Producto registro = new Producto();
		this.nombreLista = "productos";
		this.jedis.sadd(nombreLista,registro.getCodProducto());
		Productos.put(registro.getCodProducto(), registro.getData());
	}
	public void insertarTienda()
	{
		Tienda registro = new Tienda();
		this.nombreLista = "tiendas";
		this.jedis.sadd(nombreLista,registro.getCodTienda());
		this.Tiendas.put(registro.getCodTienda(), registro.getData());
	}
	public void insertarVendedor()
	{
		Vendedor registro = new Vendedor();
		this.nombreLista = "vendedores";
		this.jedis.sadd(nombreLista,registro.getCodVendedor());
		this.Vendedores.put(registro.getCodVendedor(), registro.getData());
	}
	public void insertarFactura()
	{
		Factura registro = new Factura();
		this.nombreLista = "facturas";
		this.jedis.sadd(nombreLista,registro.getNumFactura());
		this.Facturas.put(registro.getNumFactura(), registro.getData());
	}
	//select
	public String buscarCliente()
	{
		String data = "No existe el registro";
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (this.Clientes.containsKey(cod))
		{
			for (Entry<String, String> entry : Clientes.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    data = entry.getValue();
				    break;
				}
			}
			return data;
		}
		else
			return data;
	}
	public String buscarProducto()
	{
		String data = "No existe el registro";
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (jedis.sismember("productos", cod))
		{
			for (Entry<String, String> entry : Productos.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    data = entry.getValue();
				    break;
				}
			}
			return data;
		}
		else
			return data;
	}
	public String buscarTienda()
	{
		String data = "No existe el registro";
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (jedis.sismember("tiendas", cod))
		{
			for (Entry<String, String> entry : Tiendas.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    data = entry.getValue();
				    break;
				}
			}
			return data;
		}
		else
			return data;
	}
	public String buscarVendedor()
	{
		String data = "No existe el registro";
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (jedis.sismember("vendedores", cod))
		{
			for (Entry<String, String> entry : Vendedores.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    data = entry.getValue();
				    break;
				}
			}
			return data;
		}
		else
			return data;
	}
	public String buscarFactura()
	{
		String data = "No existe el registro";
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (jedis.sismember("facturas", cod))
		{
			for (Entry<String, String> entry : Facturas.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    data = entry.getValue();
				    break;
				}
			}
			return data;
		}
		else
			return data;
	}
	//update
	public void actualizarCliente()
	{
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (jedis.sismember("clientes", cod))
		{
			Cliente nuevoR = new Cliente();
			for (Entry<String, String> entry : Clientes.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    entry.setValue(nuevoR.getData());
				    break;
				}
			}
			System.out.println("Se actualizo un registro ");
		}
		else
			System.out.println("No existe el registro ");
	}
	public void actualizarProducto()
	{
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (jedis.sismember("productos", cod))
		{
			Producto nuevoR = new Producto();
			for (Entry<String, String> entry : Productos.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    entry.setValue(nuevoR.getData());
				    break;
				}
			}
			System.out.println("Se actualizo un registro ");
		}
		else
			System.out.println("No existe el registro ");
	}
	public void actualizarTienda()
	{
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (jedis.sismember("tiendas", cod))
		{
			Tienda nuevoR = new Tienda();
			for (Entry<String, String> entry : Tiendas.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    entry.setValue(nuevoR.getData());
				    break;
				}
			}
			System.out.println("Se actualizo un registro ");
		}
		else
			System.out.println("No existe el registro ");
	}
	public void actualizarVendedor()
	{
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (jedis.sismember("vendedores", cod))
		{
			Vendedor nuevoR = new Vendedor();
			for (Entry<String, String> entry : Vendedores.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    entry.setValue(nuevoR.getData());
				    break;
				}
			}
			System.out.println("Se actualizo un registro ");
		}
		else
			System.out.println("No existe el registro ");
	}
	public void actualizarFactura()
	{
		System.out.println("Ingrese Código: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (jedis.sismember("facturas", cod))
		{
			Factura nuevoR = new Factura();
			for (Entry<String, String> entry : Facturas.entrySet()) 
			{
    			if (entry.getKey() == cod)
				{
				    entry.setValue(nuevoR.getData());
				    break;
				}
			}
			System.out.println("Se actualizo un registro ");
		}
		else
			System.out.println("No existe el registro ");
	}
	//delete
	public void eliminarFactura()
	{
		System.out.println("Ingrese numero de factura: ");
		Scanner in = new Scanner(System.in);
		String cod = in.nextLine();
		if (this.Facturas.containsKey(cod))
		{
			Productos.remove(cod);
		}
		else
			System.out.println("No existe el registro ");
	}
	public static void main(String[] args) 
	{
		Principal app = new Principal();
		app.insertarCliente();
		app.insertarProducto();
		app.insertarTienda();
		app.insertarVendedor();
		app.insertarFactura();
		app.actualizarProducto();
		app.eliminarFactura();
	}

}
