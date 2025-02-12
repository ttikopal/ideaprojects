package es.ieslavereda.EjercicioHerencia5ConListas;

/*
* Los empleados implementarán la interfaz CotizacionSegSocial.
* Esta interfaz contendrá 3 métodos: cálculo de la retención del IRPF,
* cálculo de las contingencias comunes
* e impresión de una etiqueta identificativa.
*
* En el caso de los secretarios el IRPF es del 21%, en caso de vendedor del 24% y en caso de ser un jefe de zona de un 30%.
* Las contingencias comunes en el caso de los secretarios es del 3%, en caso de vendedor del 4% y en caso de ser un jefe de zona de un 5%.
* Finalmente, las etiquetas imprimen el nombre y los apellidos.
*
* */

public interface CotizacionSegSocial {

    float calcularIRPF();
    float calcularContComunes();
    void mostrarEtiquetaID();

}
