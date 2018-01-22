package jedis.francojuliohenry;

import java.util.Scanner;

public class Tienda 
{
	private String codTienda; // Código de la tienda
	private String nomTienda; // Nombre de la tienda
	private String dirTienda; // Dirección de la tienda
	private String telTienda; // Teléfono de la tienda
	public Tienda()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese Código de la tienda: ");
		this.codTienda = in.nextLine();
		System.out.println("Ingrese Nombre de la tienda: ");
		in = new Scanner(System.in);
		this.nomTienda = in.nextLine();
		System.out.println("Ingrese Dirección de la tienda: ");
		in = new Scanner(System.in);
		this.dirTienda = in.nextLine();
		System.out.println("Ingrese Teléfono de la tienda: ");
		in = new Scanner(System.in);
		this.telTienda = in.nextLine();
	}
	public Tienda(String codTienda, String nomTienda, String dirTienda, String telTienda)
	{
		this.codTienda = codTienda;
		this.nomTienda = nomTienda;
		this.dirTienda = dirTienda;
		this.telTienda = telTienda;
	}
	public String getData()
	{
		String data = "";
		data = "Tienda Código: " + this.getCodTienda() + "\nNombre: " + getNomTienda() +
		"\nDireccion: "+ getDirTienda() + "\nTelefono: " + 
		this.getTelTienda() + "\n";
		return data;
	}
	public String getCodTienda() 
	{
		return codTienda;
	}
	public void setCodTienda(String codTienda) 
	{
		this.codTienda = codTienda;
	}
	public String getNomTienda() 
	{
		return nomTienda;
	}
	public void setNomTienda(String nomTienda) 
	{
		this.nomTienda = nomTienda;
	}
	public String getDirTienda() 
	{
		return dirTienda;
	}
	public void setDirTienda(String dirTienda) 
	{
		this.dirTienda = dirTienda;
	}
	public String getTelTienda() 
	{
		return telTienda;
	}
	public void setTelTienda(String telTienda) 
	{
		this.telTienda = telTienda;
	}
	
}
