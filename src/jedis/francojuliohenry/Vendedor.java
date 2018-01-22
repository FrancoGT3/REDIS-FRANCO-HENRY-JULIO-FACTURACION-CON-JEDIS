package jedis.francojuliohenry;

import java.util.Scanner;

public class Vendedor 
{
	private String codVendedor; // Código del vendedor
	private String tipoVendedor; // Tipo de vendedor
	private String nomVendedor; // Nombre del vendedor
	public Vendedor()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese Código del vendedor: ");
		this.codVendedor = in.nextLine();
		System.out.println("Ingrese Tipo de vendedor: ");
		in = new Scanner(System.in);
		this.tipoVendedor = in.nextLine();
		System.out.println("Ingrese Nombre del vendedor: ");
		in = new Scanner(System.in);
		this.nomVendedor = in.nextLine();
	}
	public Vendedor(String codVendedor, String tipoVendedor, String nomVendedor, double porVendedor)
	{
		this.codVendedor = codVendedor;
		this.tipoVendedor = tipoVendedor;
		this.nomVendedor = nomVendedor;
	}
	public String getData()
	{
		String data = "";
		data = "Vendedor Código: " + this.getCodVendedor() + "\nNombre: " + getNomVendedor() +
		"\nTipo: "+ getNomVendedor() + "\nTipo: " + 
		this.getTipoVendedor() + "\n";
		return data;
	}
	public String getCodVendedor() 
	{
		return codVendedor;
	}
	public void setCodVendedor(String codVendedor) 
	{
		this.codVendedor = codVendedor;
	}
	public String getTipoVendedor() 
	{
		return tipoVendedor;
	}
	public void setTipoVendedor(String tipoVendedor) 
	{
		this.tipoVendedor = tipoVendedor;
	}
	public String getNomVendedor() 
	{
		return nomVendedor;
	}
	public void setNomVendedor(String nomVendedor) 
	{
		this.nomVendedor = nomVendedor;
	}
}
