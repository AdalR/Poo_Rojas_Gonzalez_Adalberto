public class L1 extends Biblioteca{
    public L1(String Nombre, String Autor, String Sinopsis, double costo, boolean disponible){
        super(Nombre, Autor, Sinopsis, costo, disponible);
    }
    public void mostrarL1(){
        System.out.println("Libro: " + getNombre() + " Autor: "+getAutor()+" Sinopsis: "+getSinopsis()+" El costo es de: "+getcosto()+"El libro esta disponible: "+ getDisponible());
    }
}