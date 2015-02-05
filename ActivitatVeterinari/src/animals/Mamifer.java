package animals;

import java.util.Scanner;

public class Mamifer extends Animals{
    protected String color;
    protected float pesKg;
    
    @Override
    public void leerDatosDesdeTeclado(Scanner sc){
        super.leerDatosDesdeTeclado(sc);
        System.out.println("Introdueixi el color del animal:");
        this.color = sc.nextLine();
        System.out.println("Introdueixi el pes del animal:");
        this.pesKg = sc.nextFloat();
    }
    
    @Override
    public void cargarAtributo(String atribut, String valor){
        super.cargarAtributo(atribut, valor);
        if(atribut.equalsIgnoreCase("Color")){
            this.color = valor;
        } else if(atribut.equalsIgnoreCase("pes Kg")){
            this.pesKg = Float.valueOf(valor);
        } 
    }
    
    public Mamifer(){
        super();
        this.color ="";
        this.pesKg=0;
    }
    
    public Mamifer(String color, int pesKg){
        super();
        this.color =color;
        this.pesKg=pesKg;
    }
    
    public Mamifer(
            String telefonAmo, String dniAmo, String nomAmo, String nomMascota,
            int edatMascota, int numVacunes,
            String color, int pesKg){
        super(telefonAmo, dniAmo, nomAmo, nomMascota, edatMascota, numVacunes);
        this.color =color;
        this.pesKg=pesKg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPesKg() {
        return pesKg;
    }

    public void setPesKg(float pesKg) {
        this.pesKg = pesKg;
    }
    
    @Override
    public String toString(){
        return super.toString()+
                "\nColor: " + this.color +
                "\nPesKg: "+ this.pesKg;
    }
    
}
