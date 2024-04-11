public class ConversorTemperatura {
    public static void main(String[] args) {
        System.out.println("Conversor de grados Fahrenheit a Celsius");
        float celsius = (float) 35.3;
        float fahrenheit = (float) ((celsius * 1.8) + 32);
        String mensaje = """
                La conversion de %.2f°C a Fahrenheit es de %.2f°F
                """.formatted(celsius, fahrenheit);
        System.out.println(mensaje);
    }
}
