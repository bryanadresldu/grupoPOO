public class Vehiculos {

    public String color;
    public String placa;
    public String modelo;
    public int anio;

    public Vehiculos(String color, String placa, String modelo, int anio) {
        this.color = color;
        this.placa = placa;
        this.modelo = modelo;
        this.anio = anio;

    }
    //metodo Alejandro Guanoluisa
    public void infoVehiculo() {
        System.out.println("Color: " + color+"\nPlaca: " + placa+"\nModelo: " + modelo+"Año: " + anio);
    }


    public void Informacion(){
        System.out.println("------Informacion del Vehiculo------");
        System.out.println("Color: " + color);
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
        System.out.println(" ");

    }


}
