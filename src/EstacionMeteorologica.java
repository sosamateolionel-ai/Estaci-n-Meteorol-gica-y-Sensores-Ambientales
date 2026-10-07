import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {

    private List<Sensor> sensores;

    public EstacionMeteorologica() {
        this.sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
        System.out.println("Sensor agregado: " + sensor.getTipo());
    }

    public void generarReporteClimatico() {

        System.out.println("\n=== Reporte Climático ===");

        if (sensores.isEmpty()) {
            System.out.println("No hay sensores registrados.");
            return;
        }

        for (Sensor s : sensores) {
            double lectura = s.obtenerLectura(10);
            System.out.printf("%-12s: %.2f%n", s.getTipo(), lectura);
        }

        System.out.println("=== Fin del reporte ===\n");
    }
}