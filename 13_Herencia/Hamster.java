public class Hamster extends Animal{
    String tipo_casa;
    public Hamster(){

    }
    public Hamster(String nombre, String raza, String tipo_alimento, int edad, boolean sexo, String ladrido){
        super(nombre, raza, tipo_alimento, edad, sexo);
        this.tipo_casa = tipo_casa;

    }
    public String getTipo_casa(){
        return tipo_casa;
    }
    public void setTipo_casa(String tipo_casa){
    this.tipo_casa = tipo_casa;
    }
    public void mostrarHamster(){
    System.out.println("El nombre del Hamster es: " + getNombre() + "\n" + " Su raza es: "+ getRaza() + "\n" + " Se alimenta de: "+ getTipo_alimento()+ "\n" + "Edad de: "+ getEdad()+ "\n" + "Su sexo es de: "+ getSexo() + "\n" + "Que tipo de casa tiene: " + tipo_casa + "\n");
    }
}