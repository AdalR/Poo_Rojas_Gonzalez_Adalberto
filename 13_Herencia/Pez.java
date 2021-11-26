public class Pez extends Animal{
    String Sonido;
    public Pez(){

    }
    public Pez(String nombre, String raza, String tipo_alimento, int edad, boolean sexo, String Sonido){
        super(nombre, raza, tipo_alimento, edad, sexo);
        this.Sonido = Sonido;
        
    }
    public String getSonido(){
        return Sonido;
    }
    public void setSonido(String Sonido){
        this.Sonido = Sonido;
    }
    public void mostrarPez(){
    System.out.println("El nombre del pez es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" +  "Se alimenta de: " + getTipo_alimento() + "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su sexo es: " + getSexo()+ "\n" + "El sonido que hace es: " + getSonido() + "\n");
    }
}