package modelo;

public class Usuario {
    String usuario;
    String clave;
    boolean conectado;

    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        this.conectado = false;
    }
    
    public boolean conectar(String usuario, String clave){
        if(this.usuario.equalsIgnoreCase(usuario) && 
                    this.clave.equals(clave) && !this.conectado){
            this.conectado = true;
        }
        return this.conectado;
    }
    
    public boolean desconectar(){
        if (this.conectado) {
            this.conectado= false;
        }
        return   this.conectado;
    }
}