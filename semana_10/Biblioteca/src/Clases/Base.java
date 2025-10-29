package Clases;

public class Base {
    
    public static int aEntero(String texto) {
        try {
            if (texto == null || texto.trim().isEmpty()) {
                return 0;
            }
            return Integer.parseInt(texto.trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    public static double aDecimal(String texto) {
        try {
            if (texto == null || texto.trim().isEmpty()) {
                return 0.0;
            }
            return Double.parseDouble(texto.trim());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
    
    public static boolean aBooleano(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        texto = texto.trim().toLowerCase();
        return texto.equals("true") || texto.equals("1") || 
               texto.equals("si") || texto.equals("yes");
    }
    
    public static boolean esEnteroValido(String texto) {
        try {
            if (texto == null || texto.trim().isEmpty()) {
                return false;
            }
            Integer.valueOf(texto.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean esTextoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
}