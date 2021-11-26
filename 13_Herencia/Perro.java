public class Perro extends Animal{
    String ladrido;
    public Perro(){

    }
    public Perro(String nombre, String raza, String tipo_alimento, int edad, boolean sexo, String ladrido){
        super(nombre, raza, tipo_alimento, edad, sexo);
        this.ladrido = ladrido;

    }
    public String getLadrido(){
        return ladrido;
    }
    public void setLadrido(String ladrido){
    this.ladrido = ladrido;
    }
    public void mostrarPerro(){
    System.out.println("El nombre del perro es: " + getNombre() + "\n" + " Su raza es: "+ getRaza() + "\n" + " Se alimenta de: "+ getTipo_alimento()+ "\n" + "Edad de: "+ getEdad()+ "\n" + "Su sexo es de: "+ getSexo() + "\n" + "El tipo de ladrido es: " + ladrido + "\n");
    }
}


