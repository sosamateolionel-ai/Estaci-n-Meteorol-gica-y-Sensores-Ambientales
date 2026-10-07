//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    EstacionMeteorologica estacion = new EstacionMeteorologica();

    Sensor sensorTemp = new Sensor("temperatura");
    Sensor sensorHumedad = new Sensor("humedad");
    Sensor sensorPresion = new Sensor("presion");

    estacion.agregarSensor(sensorTemp);
    estacion.agregarSensor(sensorHumedad);
    estacion.agregarSensor(sensorPresion);

    estacion.generarReporteClimatico();
}
