package examen;

public class ArregloTipoCambio {

	/**
  	 .----.----.----.----.----.----.----.----.----.----.
 ==> |    |    |    |    |    |    |    |    |    |    |   
	 '----'----'----'----'----'----'----'----'----'----'
	   0    1    2    3    4    5    6    7    8    9
    indice
    */
	
    private double cambios[];
    private int indice;

    public ArregloTipoCambio() {
        cambios = new double[10];
        indice = 0;
    }

    public int tamaño() {
        return indice;
    }

    public double obtener(int p) {
        return cambios[p];
    }

    public void adicionar(double s) {
        if (indice == tamaño())
            ampliarArreglo();
        cambios[indice] = s;
        indice++;
    }

    private void ampliarArreglo() {
        double aux[] = cambios;
        cambios = new double[indice + 10];
        for (int i = 0; i < indice; i++)
            cambios[i] = aux[i];
    }
    
    public void eliminarTodo() {
        indice = 0;
    }

    public void eliminarFinal() {
        indice--;
    }

	
}
