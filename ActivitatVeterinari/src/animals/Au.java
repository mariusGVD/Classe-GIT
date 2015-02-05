package animals;

import java.util.Scanner;

public class Au extends Animals{
    private String color;
    private String especie;
    
    @Override
    public void cargarAtributo(String atribut, String valor){
        super.cargarAtributo(atribut, valor);
        if(atribut.equalsIgnoreCase("Color")){
            this.color = valor;
        } else if(atribut.equalsIgnoreCase("Especie")){
            this.especie = valor;
        } 
    }
    
    public Au(){
        super();
        this.color ="";
        this.especie="";
    }
    
    public Au(String color, String especie){
        super();
        this.color =color;
        this.especie=especie;
    }
    
    public Au(
            String telefonAmo, String dniAmo, String nomAmo, String nomMascota,
            int edatMascota, int numVacunes,
            String color, String plumaje){
        super(telefonAmo, dniAmo, nomAmo, nomMascota, edatMascota, numVacunes);
        this.color =color;
        this.especie=plumaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setPlumaje(String especie) {
        this.especie = especie;
    }
    
    @Override
    public String toString(){
        return super.toString()+
                "\nColor: " + this.color +
                "\nEspecie: "+ this.especie;
    }
    
    @Override
    public void leerDatosDesdeTeclado(Scanner sc){
        super.leerDatosDesdeTeclado(sc);
        System.out.println("Introdueixi el color del animal:");
        this.color = sc.nextLine();
        System.out.println("Introdueixi l'especie del animal:");
        this.especie = sc.nextLine();
    }
}
