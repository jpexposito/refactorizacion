package es.iespuerto.refactorizacion;

public class NodoPila {

    Object elemento;
	NodoPila siguiente;
	
	// Costructor por defecto, crea un nodo con elemento null y apuntador siguiente null
	public NodoPila(){
		this.elemento = null;
		this.siguiente = null;
	}
	
	// Constructor Elemento, recibe un objeto como parametro y lo asigna al elemento y el apuntador null 
	public NodoPila(Object elem){
		this.elemento = elem;
		this.siguiente = null;
	}

    public NodoPila(double nuevo_dato, NodoPila arriba) {
        this.elemento = nuevo_dato;
		this.siguiente = arriba;
    }

}
