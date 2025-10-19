package EditorDeTexto.lib;

public class Contador {

    // Cuenta el número total de caracteres (incluyendo espacios)
    public static int contarCaracteres(String texto) {
        if (texto == null) return 0;
        return texto.length();
    }

    // Cuenta el número de caracteres sin espacios
    public static int contarCaracteresSinEspacios(String texto) {
        if (texto == null || texto.isEmpty()) return 0;
        String sinEspacios = texto.replace(" ", "");
        return sinEspacios.length();
    }

    // Cuenta el número de palabras en el texto
    public static int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) return 0;
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

    // Cuenta el número de oraciones (considera . ! ?)
    public static int contarOraciones(String texto) {
        if (texto == null || texto.isEmpty()) return 0;
        String[] oraciones = texto.split("[.!?]+");
        int contador = 0;
        for (String oracion : oraciones) {
            if (!oracion.trim().isEmpty()) contador++;
        }
        return contador;
    }

    // Cuenta cuántas veces aparece una palabra específica
    public static int contarOcurrenciasPalabra(String texto, String palabra) {
        if (texto == null || texto.isEmpty() || palabra == null || palabra.isEmpty()) return 0;
        int contador = 0;
        String textoMinusculas = texto.toLowerCase();
        String palabraMinusculas = palabra.toLowerCase();
        String[] palabras = textoMinusculas.split("\\s+");
        for (String p : palabras) {
            p = p.replaceAll("[.,;:!?]", ""); // limpia puntuación
            if (p.equals(palabraMinusculas)) contador++;
        }
        return contador;
    }

    // Cuenta el número de vocales en el texto
    public static int contarVocales(String texto) {
        if (texto == null || texto.isEmpty()) return 0;
        int contador = 0;
        String textoMinusculas = texto.toLowerCase();
        for (char c : textoMinusculas.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') contador++;
        }
        return contador;
    }
}