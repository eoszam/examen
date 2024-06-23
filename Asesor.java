package examen;

public class Asesor {
	private String nombre;
	private int dni;
	private int codigo;
	private double remuneracionDolares;
	
	private static int aCreados;
	private static double tremuneraciones;
	public static final String institucion = "ISIL";
	 
	public Asesor(String nombre, int dni, int codigo, double remuneracionDolares) {
		this.codigo = codigo;
		this.dni = dni;
		this.nombre = nombre;
		this.remuneracionDolares = remuneracionDolares;
		this.aCreados++;
		this.tremuneraciones+= remuneracionDolares;
	}
	public Asesor(String nombre, int dni) {
		this(nombre, dni, 55555, 2000.00);
	}
	public Asesor() {
		this("NN", 88888888);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getRemuneracionDolares() {
		return remuneracionDolares;
	}
	public void setRemuneracionDolares(double remuneracionDolares) {
		this.remuneracionDolares = remuneracionDolares;
	}
	public static int getAsesorCreados() {
		return aCreados;
	}
	public static void setAsesorCreados(int asesorCreados) {
		Asesor.aCreados = asesorCreados;
	}
	public static double getTodasremuneraciones() {
		return tremuneraciones;
	}
	public static void setTodasremuneraciones(double todasremuneraciones) {
		Asesor.tremuneraciones = todasremuneraciones;
	}
	public static String getInstitucion() {
		return institucion;
	}
}
