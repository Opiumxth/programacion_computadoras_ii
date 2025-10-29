package Formularios;

import Clases.ArregloDeDocumentos;

public class jpanMantenimientoRevista extends jpanMantenimientoDocumento{
		
	public jpanMantenimientoRevista(jpanFondo jpanelFondo, String tipoDocumento, ArregloDeDocumentos arreglo){
		super(jpanelFondo, tipoDocumento, arreglo);		
	}

        @Override
	public void grabarDocumento(){
	}
        @Override
	public void mostrarDocumento(){
	}
        @Override
	public void activarDocumento(){
	}
        @Override
	public void inactivarDocumento(){
	}
	
}
