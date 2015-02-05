package animals;

import java.util.Scanner;

public class Reptil extends Animals{
    private String tipus;
    
    @Override
    public void leerDatosDesdeTeclado(Scanner sc){
        super.leerDatosDesdeTeclado(sc);
        System.out.println("Introdueixi el tipus de reptil:");
        this.tipus = sc.nextLine();
    }
    
    @Override
    public void cargarAtributo(String atribut, String valor){
        super.cargarAtributo(atribut, valor);
        if(atribut.equalsIgnoreCase("Tipus")){
            this.tipus = valor;
        }
    }
    public Reptil(){
        super();
        this.tipus ="";
    }
    public Reptil(String tipus){
        super();
        this.tipus =tipus;
    }
    public Reptil(
            String telefonAmo, String dniAmo, String nomAmo, String nomMascota,
            int edatMascota, int numVacunes,
            String tipus){
        super(telefonAmo, dniAmo, nomAmo, nomMascota, edatMascota, numVacunes);
        this.tipus =tipus;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    @Override
    public String toString(){
        return super.toString()+
                "\nTipus: " + this.tipus;
    }
    
}
