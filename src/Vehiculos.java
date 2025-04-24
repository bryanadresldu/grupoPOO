public class Vehiculos {

    public String color;
    public int placa;
    public String modelo;
    public int anio;

    public Vehiculos(String color, int placa, String modelo, int anio) {
        this.color = color;
        this.placa = placa;
        this.modelo = modelo;
        this.anio = anio;

    }
    //metodo Alejandro Guanoluisa
    public void infoVehiculo() {
        System.out.println("Color: " + color+"\nPlaca: " + placa+"\nModelo: " + modelo+"Año: " + anio);
    }


}
