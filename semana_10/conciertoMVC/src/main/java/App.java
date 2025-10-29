import vista.frmIngreso;

public class App {
    public static void main(String args[]){
        System.out.println("we");
        
        frmIngreso vista = new frmIngreso();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
    }
}