package jedis.francojuliohenry;
import java.util.Scanner;

public class Cliente 
{
	private String codCliente; // C�digo del cliente
	private String nomCliente; // Nombre cliente
	private String dirCliente; // Direcci�n cliente
	private String dniCliente; // Dni del cliente 
	private String rucCliente; // N�mero del RUC
	private String telCliente; // Tel�fono del cliente
	private String estado; // Indica si est� activo el cliente o no
	private String tipoCliente; // Indica si es cliente preferencial
	public Cliente()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese C�digo del cliente: ");
		this.codCliente = in.nextLine();
		System.out.println("Ingrese Nombre del cliente: ");
		in = new Scanner(System.in);
		this.nomCliente = in.nextLine();
		System.out.println("Ingrese Direcci�n del cliente: ");
		in = new Scanner(System.in);
		this.dirCliente = in.nextLine();
		System.out.println("Ingrese Dni del cliente: ");
		in = new Scanner(System.in);
		this.dniCliente = in.nextLine();
		System.out.println("Ingrese RUC del cliente: ");
		in = new Scanner(System.in);
		this.rucCliente = in.nextLine();
		System.out.println("Ingrese Tel�fono del cliente: ");
		in = new Scanner(System.in);
		this.telCliente = in.nextLine();
		System.out.println("Esta est� activo o inactivo el cliente?? ");
		in = new Scanner(System.in);
		this.estado = in.nextLine();
		System.out.println("Es preferencial o cliente normal?? ");
		in = new Scanner(System.in);
		this.tipoCliente = in.nextLine();
	}
	public Cliente(String codCliente, String nomCliente, String dirCliente, String dniCliente, String rucCliente, String telCliente, String estado, String tipoCliente)
	{
		this.codCliente = codCliente;
		this.nomCliente = nomCliente;
		this.dirCliente = dirCliente;
		this.dniCliente = dniCliente;
		this.rucCliente = rucCliente;
		this.telCliente = telCliente;
		this.estado = estado;
		this.tipoCliente = tipoCliente;
	}
	public String getData()
	{
		String data = "";
		data = "Cliente C�digo: " + this.getCodCliente() + "\nNombre: " + getNomCliente() +
				"Direcci�n: "+ getDirCliente() + "\nDni del cliente: " + 
				this.getDniCliente() + "\nRUC: " + 
				this.getRucCliente() + "\nTel�fono del cliente: " +
				this.getTelCliente() + "\nEstado: " + this.getEstado() +
				"\nTipo de cliente: " + this.getTipoCliente() + "\n";
		return data;
	}
	public String getCodCliente() 
	{
		return codCliente;
	}
	public void setCodCliente(String codCliente) 
	{
		this.codCliente = codCliente;
	}
	public String getNomCliente() 
	{
		return nomCliente;
	}
	public void setNomCliente(String nomCliente)
	{
		this.nomCliente = nomCliente;
	}
	public String getDirCliente() 
	{
		return dirCliente;
	}
	public void setDirCliente(String dirCliente) 
	{
		this.dirCliente = dirCliente;
	}
	public String getDniCliente() 
	{
		return dniCliente;
	}
	public void setDniCliente(String ndiCliente) 
	{
		this.dniCliente = ndiCliente;
	}
	public String getRucCliente() 
	{
		return rucCliente;
	}
	public void setRucCliente(String rucCliente) 
	{
		this.rucCliente = rucCliente;
	}
	public String getTelCliente() 
	{
		return telCliente;
	}
	public void setTelCliente(String telCliente) 
	{
		this.telCliente = telCliente;
	}
	public String getEstado() 
	{
		return estado;
	}
	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
	public String getTipoCliente() 
	{
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) 
	{
		this.tipoCliente = tipoCliente;
	}
	
}

