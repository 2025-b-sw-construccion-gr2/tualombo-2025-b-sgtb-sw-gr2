package EditorDeTexto.lib;

public class Formateador {

    // Centra un texto dentro de un ancho específico con espacios extra
    public static String centrarTexto(String texto, int ancho) {
        if (texto == null || texto.length() >= ancho) return texto;
        int espaciosTotal = ancho - texto.length();
        int espaciosIzquierda = espaciosTotal / 2;
        int espaciosDerecha = espaciosTotal - espaciosIzquierda;
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < espaciosIzquierda; i++) resultado.append(" ");
        resultado.append(texto);
        for (int i = 0; i < espaciosDerecha; i++) resultado.append(" ");
        return resultado.toString();
    }

    // Crea una línea decorativa con un carácter y longitud
    public static String crearLinea(char caracter, int longitud) {
        StringBuilder linea = new StringBuilder();
        for (int i = 0; i < longitud; i++) linea.append(caracter);
        return linea.toString();
    }

    // Agrega un marco alrededor del texto
    public static String crearMarco(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        int longitud = texto.length() + 4;
        String lineaSuperior = crearLinea('*', longitud);
        StringBuilder resultado = new StringBuilder();
        resultado.append(lineaSuperior).append("\n");
        resultado.append("* ").append(texto).append(" *\n");
        resultado.append(lineaSuperior);
        return resultado.toString();
    }

    // Añade numeración a cada línea de texto
    public static String numerarLineas(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        String[] lineas = texto.split("\n");
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < lineas.length; i++) {
            resultado.append((i + 1)).append(". ").append(lineas[i]).append("\n");
        }
        return resultado.toString();
    }

    // Convierte el texto en formato título (primera letra en mayúscula)
    public static String formatoTitulo(String texto) {
        return EditorTexto.capitalizarPalabras(texto);
    }

    // Trunca el texto a una longitud máxima y agrega "..."
    public static String truncarTexto(String texto, int longitudMaxima) {
        if (texto == null || texto.length() <= longitudMaxima) return texto;
        return texto.substring(0, longitudMaxima - 3) + "...";
    }
}