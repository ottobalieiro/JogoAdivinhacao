public class Main {
    public static void main(String[] args) {

        double temperaturaEmCelsius = 11;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = """
                          A temperatura de %.1f Cº
                          
                          é equivalente a %.1f Fº
                          """.formatted(temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }
}