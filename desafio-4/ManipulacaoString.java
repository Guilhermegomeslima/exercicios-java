public class ManipulacaoString {

    public static int contarVogais(String texto) {
        if (texto == null) {
            return 0;
        }
        int totalVogais = 0;
        String textoMinusculo = texto.toLowerCase();

        for (int i = 0; i < textoMinusculo.length(); i++) {
            char c = textoMinusculo.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' ||
                c == 'ã' || c == 'õ' || c == 'â' || c == 'ê' || c == 'ô') {
                totalVogais++;
            }
        }
        return totalVogais;
    }

    public static String inverter(String texto) {
        if (texto == null) {
            return "";
        }
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }

    public static boolean isPalindromo(String texto) {
        if (texto == null) {
            return false;
        }
        String invertida = inverter(texto);
        return texto.equalsIgnoreCase(invertida);
    }
}