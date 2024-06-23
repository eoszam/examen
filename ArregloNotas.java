package examen;

public class ArregloNotas {
	    private static final double Double = 0;
		private double[] notas;
	    private int cantNotas;

	    public ArregloNotas(int capacidad) {
	        notas = new double[capacidad];
	        cantNotas = 0;
	    }

	    public void agregarNota(double nota) {
	        if (cantNotas < notas.length) {
	            notas[cantNotas] = nota;
	            cantNotas++;
	        } else {
	            System.out.println("Arreglo lleno");
	        }
	    }

	    public int posicionPrimeraNotaMayor16() {
	        for (int i = 0; i < cantNotas; i++) {
	            if (notas[i] > 16) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public double sumarNotas() {
	        double sum = 0;
	        for (int i = 0; i < cantNotas; i++) {
	            sum += notas[i];
	        }
	        return sum;
	    }

	    public double retornarNotaMayor() {
	        double mayor = Double;
	        for (int i = 0; i < cantNotas; i++) {
	            if (notas[i] > mayor) {
	                mayor = notas[i];
	            }
	        }
	        return mayor;
	    }

	    public boolean reemplazarNota10() {
	        for (int i = 0; i < cantNotas; i++) {
	            if (notas[i] == 10.5) {
	                notas[i] = retornarNotaMayor();
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean incrementarNotaMayor16() {
	        int posi = posicionPrimeraNotaMayor16();
	        if (posi != -1) {
	            double notaMayor = retornarNotaMayor();
	            notas[posi] += 0.2 * notaMayor;
	            return true;
	        }
	        return false;
	    }

}

