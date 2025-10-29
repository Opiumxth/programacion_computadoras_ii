package Clases;

import java.util.ArrayList;

public class ArregloDeDocumentos {
    //Declaración de Atributos
    //Declamos un objeto de tipo ArrayList que forma parte de la familia COLLECTION
    private ArrayList documentos;
    
    //Este es el método constructor por defecto	
    public ArregloDeDocumentos(){
        //Instanciamos al objeto de tipo ArrayList
        documentos = new ArrayList();	
    }
	
    //Este método áñade un objeto de tipo Documento dentro del ArrayList
    public void añadeDocumento(Documento documento){
        documentos.add(documento);
    }
        
    //Este método áñade por índice a un objeto de tipo Documento dentro del ArrayList	
    public void insertaDocumentoPorIndice(int indice, Documento documento){
        documentos.set(indice,documento);
    }
    
    //Este método devuelve la referencia al ArrayList
    public ArrayList devuelveElArregloDeDocumentos(){
        return documentos;
    }
	
    //Este método devuelve por índice a un objeto que está dentro del ArrayList
    public Documento devuelveUnDocumentoPorIndice(int indice){
        return (Documento)documentos.get(indice);
    }

}