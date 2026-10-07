import java.util.Random;

public class Sensor {

    private String tipo; // "temperatura", "humedad", "presion"
    private Random random;

    public Sensor(String tipo) {

        this.tipo = tipo;
        this.random = new Random();

    }

    public String getTipo() {
        return tipo;
    }

    public double obtenerLectura(double valor) {



        if (tipo.equals("temperatura")) {
            valor = -5 + (random.nextDouble() * 40); // entre -5°C y 35°C
        } else if (tipo.equals("humedad")) {
            valor = random.nextDouble() * 100; // entre 0% y 100%
        } else if (tipo.equals("presion")) {
            valor = 980 + (random.nextDouble() * 50); // entre 980 y 1030 hPa
        } else {
            valor = 0;
        }

        return valor;
    }
}