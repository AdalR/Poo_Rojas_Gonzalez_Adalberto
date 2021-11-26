public class L5 extends Biblioteca{
    public L5(String Nombre, String Autor, String Sinopsis, double costo, boolean disponible){
        super(Nombre, Autor, Sinopsis, costo, disponible);
    }
    public void mostrarL5(){
        System.out.println("Libro: " + getNombre() + " Autor: "+getAutor()+" Sinopsis: "+getSinopsis()+" El costo es de: "+getcosto()+"El libro esta disponible: "+ getDisponible());
    }
}