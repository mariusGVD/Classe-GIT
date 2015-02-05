package animals;

import java.util.Scanner;

public class Gos extends Mamifer{
    private String raza;
    
    @Override
    public void leerDatosDesdeTeclado(Scanner sc){
        super.leerDatosDesdeTeclado(sc);
        System.out.println("Introdueixi la raça del gos:");
        this.raza = sc.nextLine();
    }
    
    @Override
    public void cargarAtributo(String atribut, String valor){
        super.cargarAtributo(atribut, valor);
        if(atribut.equalsIgnoreCase("Raça")){
            this.raza = valor;
        }
    }
    
    public Gos(){
        super();
        this.raza ="";
    }
    
    public Gos(String raza){
        super();
        this.raza =raza;
    }
    
    public Gos(
            String telefonAmo, String dniAmo, String nomAmo, String nomMascota,
            int edatMascota, int numVacunes,
            String color, int pesKg,
            String raza){
        super(telefonAmo, dniAmo, nomAmo, nomMascota, edatMascota, numVacunes,color,pesKg);
        this.raza =raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public String toString(){
        return super.toString()+
                "\nRaça: " + this.raza;
    }
}
