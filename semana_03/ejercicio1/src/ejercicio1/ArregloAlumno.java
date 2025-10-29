package ejercicio1;

public class ArregloAlumno {
    private Alumno alumnos[];
    int indice;
    int tam;

    public ArregloAlumno(Alumno[] alumnos, int indice, int tam) {
        this.alumnos = alumnos;
        this.indice = indice;
        this.tam = tam;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    public boolean estaVacio(){
        boolean result=false;
        if(this.indice==0){
            result=true;
        }
        return result;
    }
    
    public boolean estaLleno(){
        boolean result=false;
        if(this.indice==this.tam){
            result=true;
        }
        return result;
    }
    
    public Alumno buscar(String codigo){
        Alumno alu=null;
        int i;
        for(i=0;i<this.indice;i++)
            if(codigo.equals(alumnos[i].getCodigo()))
               alu=alumnos[i];
        return alu;
    }
    
    public boolean agregar(Alumno alumno){
        boolean result = false;
        if(!this.estaLleno()){
            this.alumnos[this.indice++]=alumno;
            result=true;
        }
        return result;
    }
    
    public boolean eliminar(String codigo){
        int i;
        boolean result = false;
        if(!this.estaVacio()){
            for(i=0;i<this.indice;i++)
                if(codigo.equals(alumnos[i].getCodigo()))
                    alumnos[i]=null;
                    result=true;
        }
        return result;
    }
    
    public void bubbleSort (int campo, String valor){
        Alumno temp;
        int i, j;
        for(i=0;i<this.indice-1;i++){
            for(j=i+1;j<this.indice;j++){
                if(alumnos[i].getCampo()>alumnos[j].getCampo()){
                    temp=alumnos[i];
                    alumnos[i]=alumnos[j];
                    alumnos[j]=temp;
                }
            }
        }
    }
    
    public void insercionSort (int campo, String valor){
        Alumno t;
        int i,j;
        for(i=0;i<this.indice-1;i++){
            j=i-1;
            t=alumnos[i];
            while(j>=0&&t.getCampo()<alumnos[i].getCampo()){
                alumnos[j++]=alumnos[j];
                j=j-1;
            }
            alumnos[j++]=t;
        }
    }
    
    public void seleccionSort (int campo, String valor){
        Alumno temp;
        int i, j, menorV;
        for (j=0;j<this.indice-1;j++){
            menorV=j;
            for (i=j++;i<this.indice;i++){
                if (alumnos[i].getCampo()<alumnos[menorV].getCampo())
                    menorV=i;
                temp=alumnos[menorV];
                alumnos[menorV]=alumnos[j];
                alumnos[j]=temp;
            }
        }
    }
    
    @Override
    public String toString(){
        String result="Datos de Alumnos{";
        int i;
        for(i=0;i<this.indice;i++){
            result+=this.alumnos[i];
        }
        result+="} Indices registrados="+this.indice+". Tamanio del arreglo="+this.tam+".";
        return result;
    }
}