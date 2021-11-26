public class Gato extends Animal{
    int num_vidas;
    public Gato(){

    }
    public Gato(String nombre, String raza, String tipo_alimento, int edad, boolean sexo, int num_vidas){
        super(nombre, raza, tipo_alimento, edad, sexo);
        this.num_vidas = num_vidas;

    }
    public int getLadrido(){
        return num_vidas;
    }
    public void setLadrido(int num_vidas){
    this.num_vidas = num_vidas;
    }
    public void mostrarGato(){
    System.out.println("El nombre del Gato es: " + getNombre() + "\n" + " Su raza es: "+ getRaza() + "\n" + " Se alimenta de: "+ getTipo_alimento()+ "\n" + "Edad de: "+ getEdad()+ "\n" + "Su sexo es de: "+ getSexo() + "\n" + "Cuantas vidas tiene: " + num_vidas + "\n");
    }
}