package Clases;

import java.util.Date;

public class Documento {
    //Declaración de Atributos	
	protected String codigo;
	protected String titulo;
	protected String descripcion;
	protected String autor;
	protected int año;
	protected Date fecha;
	protected int cantidad;
	protected boolean estado;
	
	//Este es el método constructor por defecto	
	public Documento(){
		this.codigo = "Codigo";
		this.titulo = "Documento";
		this.descripcion = "Descripcion";
		this.autor = "Autor";
		this.año = 2008;
		this.fecha = new Date();
		this.cantidad = 1;
		this.estado = true;
	}
	
	//Métodos de tipo SET
	public void setCodigo(String codigo) {
		this.codigo = codigo; 
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo; 
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion; 
	}

	public void setAutor(String autor) {
		this.autor = autor; 
	}

	public void setAño(int año) {
		this.año = año; 
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha; 
	}
        public void setCantidad(int cantidad) {
		this.cantidad = cantidad; 
	}

	public void setEstado(boolean estado) {
		this.estado = estado; 
	}

	//Métodos de tipo GET
	public String getCodigo() {
		return (this.codigo); 
	}

	public String getTitulo() {
		return (this.titulo); 
	}

	public String getDescripcion() {
		return (this.descripcion); 
	}

	public String getAutor() {
		return (this.autor); 
	}

	public int getAño() {
		return (this.año); 
	}

	public Date getFecha() {
		return (this.fecha); 
	}

	public int getCantidad() {
		return (this.cantidad); 
	}

	public boolean getEstado() {
		return (this.estado); 
	}
}