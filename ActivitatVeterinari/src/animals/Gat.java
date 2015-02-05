package animals;

import java.util.Scanner;

public class Gat extends Mamifer{
    private String rasa;
    
    @Override
    public void cargarAtributo(String atribut, String valor){
        super.cargarAtributo(atribut, valor);
        if(atribut.equalsIgnoreCase("pelaje")){
            this.rasa = valor;
        }
    }
    
    public Gat(){
        super();
        this.rasa ="";
    }
    
    public Gat(String rasa){
        super();
        this.rasa =rasa;
    }
    
    public Gat(
            String telefonAmo, String dniAmo, String nomAmo, String nomMascota,
            int edatMascota, int numVacunes,
            String color, int pesKg,
            String rasa){
        super(telefonAmo, dniAmo, nomAmo, nomMascota, edatMascota, numVacunes,color,pesKg);
        this.rasa =rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    
    @Override
    public String toString(){
        return super.toString()+
                "\nRaça: " + this.rasa;
    }
    
    @Override
    public void leerDatosDesdeTeclado(Scanner sc){
        super.leerDatosDesdeTeclado(sc);
        System.out.println("Introdueixi la raça del gat:");
        this.rasa = sc.nextLine();
    }
}
