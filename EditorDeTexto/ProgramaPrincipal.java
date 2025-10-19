package EditorDeTexto;

import EditorDeTexto.lib.Contador;
import EditorDeTexto.lib.EditorTexto;
import EditorDeTexto.lib.Formateador;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        String texto = "  hola   mundo.  este es un   ejemplo de TEXTO   ";

        // EditorTexto
        System.out.println("Mayúsculas: " + EditorTexto.aMayusculas(texto));
        System.out.println("Minúsculas: " + EditorTexto.aMinusculas(texto));
        System.out.println("Capitalizado: " + EditorTexto.capitalizarPalabras(texto));
        System.out.println("Invertido: " + EditorTexto.invertirTexto(texto));
        System.out.println("Sin espacios extra: " + EditorTexto.eliminarEspaciosExtras(texto));
        System.out.println("Reemplazar 'mundo' por 'universidad': " + EditorTexto.reemplazarPalabra(texto, "mundo", "universidad"));

        // Contador
        System.out.println("Caracteres totales: " + Contador.contarCaracteres(texto));
        System.out.println("Caracteres sin espacios: " + Contador.contarCaracteresSinEspacios(texto));
        System.out.println("Palabras: " + Contador.contarPalabras(texto));
        System.out.println("Oraciones: " + Contador.contarOraciones(texto));
        System.out.println("Ocurrencias de 'texto': " + Contador.contarOcurrenciasPalabra(texto, "texto"));
        System.out.println("Vocales: " + Contador.contarVocales(texto));

        // Formateador
        System.out.println("Centrado (ancho 40): |" + Formateador.centrarTexto("Hola Universidad", 40) + "|");
        System.out.println("Línea decorativa: " + Formateador.crearLinea('-', 30));
        System.out.println("Marco: \n" + Formateador.crearMarco("Ejemplo de Marco"));
        System.out.println("Numerar líneas: \n" + Formateador.numerarLineas("Primera línea\nSegunda línea\nTercera línea"));
        System.out.println("Formato título: " + Formateador.formatoTitulo(texto));
        System.out.println("Truncar texto (15): " + Formateador.truncarTexto(texto, 15));
    }
}
