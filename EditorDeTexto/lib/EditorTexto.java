package EditorDeTexto.lib;

public class EditorTexto {

    // Convierte todo el texto a mayúsculas
    public static String aMayusculas(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        return texto.toUpperCase();
    }

    // Convierte todo el texto a minúsculas
    public static String aMinusculas(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        return texto.toLowerCase();
    }

    // Capitaliza la primera letra de cada palabra
    public static String capitalizarPalabras(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                String palabraCapitalizada =
                      palabra.substring(0,1).toUpperCase()
                    + palabra.substring(1).toLowerCase();
                resultado.append(palabraCapitalizada).append(" ");
            }
        }
        return resultado.toString().trim();
    }

    // Invierte el texto por completo
    public static String invertirTexto(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        return new StringBuilder(texto).reverse().toString();
    }

    // Elimina espacios extras
    public static String eliminarEspaciosExtras(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        return texto.trim().replaceAll("\\s+", " ");
    }

    // Reemplaza todas las ocurrencias de una palabra por otra
    public static String reemplazarPalabra(String texto, String palabraAntigua, String palabraNueva) {
        if (texto == null || texto.isEmpty()) return "";
        return texto.replace(palabraAntigua, palabraNueva);
    }
}