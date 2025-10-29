package Formularios;
//Declaramos las librerias del Java que necesitamos usar
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

//Importamos a las clases que se encuentran en otros paquetes
import Clases.Base;
import Clases.ArregloDeDocumentos;
import Clases.Documento;
import Clases.Libro;

//Declaración de la clase 'jpanMantenimientoLibro'
//que hereda de un 'jpanMantenimientoDocumento'
public class jpanMantenimientoLibro extends jpanMantenimientoDocumento{
			
	//Este es el método constructor por parámetro
	//le llega por parámetro la referencia de un objeto de tipo 'jpanFondo',
	//el tipo de documento, y 'arreglo'
	public jpanMantenimientoLibro(jpanFondo jpanelFondo, String tipoDocumento, ArregloDeDocumentos arreglo){
		//Pasamos por parámetro al constructor por parámetro de la clase padre
		//'jpanMantenimientoDocumento'
		super(jpanelFondo, tipoDocumento, arreglo);		
	}
	
	//Este método devuelve el indice donde se encuentra el documento con código 
	//'codigoDocumento' y que sea de tipo 'Libro'
	//Si no encuentra dicho código, devuelve el valor de -1
	public int devolverIndiceDelDocumentoEnElArreglo(String codigoDocumento){
		ArrayList arregloAuxiliar = arregloRelacionado.devuelveElArregloDeDocumentos();	
		int indice = -1, i;
		for(i=0;i<arregloAuxiliar.size();i++){
			Documento doc = (Documento)arregloAuxiliar.get(i);
			if(doc instanceof Libro){
				if(doc.getCodigo().equals(codigoDocumento)){
					indice = i;
					break;
				}
			}
		}
		return indice;
}
	
	//Este método registra los datos de un nuevo libro
	//Por ello instancia un objeto de tipo libro y le va asignando sus datos
	//utiliza a sus métodos de tipo SET
	//luego se devuelve la referencia a este objeto instanciado
	public Libro registrarNuevoLibro(){
		Libro libro = new Libro();
		
		libro.setCodigo(jtxfCodigo.getText().trim());
		libro.setTitulo(jtxfTitulo.getText().trim());
		libro.setDescripcion(jtxaDescripcion.getText().trim());
		libro.setAutor(jtxfAutor.getText().trim());
		libro.setAño(Base.aEntero(jtxfAño.getText().trim()));
		try{
			libro.setFecha(new Date(jtxfFecha.getText().trim()));
		}catch(Exception e){
			libro.setFecha(new Date());
		}
		libro.setCantidad(Base.aEntero(jtxfCantidad.getText().trim()));
		libro.setEstado(true);
		
		return libro;		
	}
	
	//Este método carga el valor de los atributos de un objeto de tipo 'Libro'
	//los muestra en los componentes gráficos del JPanel
	public void cargarDatosDelLibroEnElFormulario(Libro libro){
		jtxfTitulo.setText(libro.getTitulo());
		jtxaDescripcion.setText(libro.getDescripcion());
		jtxfAutor.setText(libro.getAutor());
		jtxfAño.setText(""+libro.getAño());
		jtxfFecha.setText(libro.getFecha().toString());
		jtxfCantidad.setText(""+libro.getCantidad());
		if(libro.getEstado()){
			jlblImagenEstado.setIcon(new ImageIcon(rutaDeImagenes+"check.png"));
			jlblImagenEstado.setText("Activo");
		}else{
			jlblImagenEstado.setIcon(new ImageIcon(rutaDeImagenes+"uncheck.png"));
			jlblImagenEstado.setText("Inactivo");
		}		
	}
	
	//Este método Graba los datos ingresados de un nuevo libro
	//Primero verifica que no exista otro libro con el mismo código
	//Luego registra los datos del nuevo libro
	//Finalmente lo añade al arreglo de documentos
	//Si ya existe el codigo, mostrará un mensaje
	public void grabarDocumento(){	
		String codigoDocumento = jtxfCodigo.getText().trim();
		if(devolverIndiceDelDocumentoEnElArreglo(codigoDocumento) < 0){
			arregloRelacionado.añadeDocumento( registrarNuevoLibro() );
			JOptionPane.showMessageDialog(null,"Operación realizada con éxito.",									"Grabar Libro",JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"El código YA existe, ingrese un nuevo código.",									"Grabar Libro",JOptionPane.WARNING_MESSAGE);
		}
	}

        //Este método muestra los datos de un objeto de tipo libro
	//Para lo cual, primero busca si se encuentra dicho libro, 
	//lo hace comparando con el código ingresado
	//Si el código Si existe, se invoca al metodó 'cargarDatosDelLibroEnElFormulario'
	//Si el código No existe se mostrará un mensaje
	public void mostrarDocumento(){
		ArrayList arregloAuxiliar = arregloRelacionado.devuelveElArregloDeDocumentos();
		String codigoDocumento = jtxfCodigo.getText().trim();
		int indice = devolverIndiceDelDocumentoEnElArreglo(codigoDocumento);
		if(indice >= 0){
			Documento doc = (Documento)arregloAuxiliar.get(indice);
			cargarDatosDelLibroEnElFormulario((Libro)doc);
			JOptionPane.showMessageDialog(null,"Libro encontrado.",									"Mostrar Libro",JOptionPane.INFORMATION_MESSAGE);				
		}else{
			JOptionPane.showMessageDialog(null,"No existe el código ingresado.",									"Mostrar Libro",JOptionPane.WARNING_MESSAGE);		
		}
	}
	
	//Este método actualiza el atributo estado del libro a 'true'
	//Primero verifica que si existe el libro
	//Luego modifica el atributo 'estado' del libro
	//Finalmente lo añade en su mismo indice dentro arreglo de documentos 
	//Si No existe el codigo ingresado, se mostrará un mensaje
	//Si el valor del atributo estado es 'true', se mostrará un mensaje
	public void activarDocumento(){
		ArrayList arregloAuxiliar = arregloRelacionado.devuelveElArregloDeDocumentos();
		String codigoDocumento = jtxfCodigo.getText().trim();
		int indice = devolverIndiceDelDocumentoEnElArreglo(codigoDocumento);
		if(indice >= 0){
			Documento doc = (Documento)arregloAuxiliar.get(indice);
			Libro libro = (Libro)doc;
			if(libro.getEstado()){
				JOptionPane.showMessageDialog(null,"Libro YA estaba activado.",									"Inactivar Libro",JOptionPane.WARNING_MESSAGE);				}else{
				libro.setEstado(true);
				arregloRelacionado.insertaDocumentoPorIndice(indice,libro);
				cargarDatosDelLibroEnElFormulario(libro);
			
				JOptionPane.showMessageDialog(null,"Libro activado.",									"Activar Libro",JOptionPane.INFORMATION_MESSAGE);	
			}
		}else{
			JOptionPane.showMessageDialog(null,"No existe el código ingresado.",									"Activar Libro",JOptionPane.WARNING_MESSAGE);		
		}		
	}
	
	//Este método actualiza el atributo estado del libro a 'false'
	//Primero verifica que si existe el libro
	//Luego modifica el atributo 'estado' del libro
	//Finalmente lo añade en su mismo indice dentro arreglo de documentos 
	//Si No existe el codigo ingresado, se mostrará un mensaje
	//Si el valor del atributo estado es 'false', se mostrará un mensaje
	public void inactivarDocumento(){
		ArrayList arregloAuxiliar = arregloRelacionado.devuelveElArregloDeDocumentos();
		String codigoDocumento = jtxfCodigo.getText().trim();
		int indice = devolverIndiceDelDocumentoEnElArreglo(codigoDocumento);
		if(indice >= 0){
			Documento doc = (Documento)arregloAuxiliar.get(indice);
			Libro libro = (Libro)doc;
			if(libro.getEstado()){
				libro.setEstado(false);
				arregloRelacionado.insertaDocumentoPorIndice(indice,libro);
				cargarDatosDelLibroEnElFormulario(libro);
			
				JOptionPane.showMessageDialog(null,"Libro inactivado.",									"Inactivar Libro",JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null,"Libro YA estaba inactivado.",									"Inactivar Libro",JOptionPane.WARNING_MESSAGE);			
			}					
		}else{
			JOptionPane.showMessageDialog(null,"No existe el código ingresado.",									"Inactivar Libro",JOptionPane.WARNING_MESSAGE);		
		}			
	}
}
