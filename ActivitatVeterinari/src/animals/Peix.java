package animals;

import java.util.Scanner;

public class Peix extends Animals{
    private String origen;
    private float pesKg;
    
    @Override
    public void leerDatosDesdeTeclado(Scanner sc){
        super.leerDatosDesdeTeclado(sc);
        System.out.println("Introdueixi l'origen del peix:");
        this.origen = sc.nextLine();
        System.out.println("Introdueixi el pes del peix:");
        this.pesKg = sc.nextFloat();
    }
    
    @Override
    public void cargarAtributo(String atribut, String valor){
        super.cargarAtributo(atribut, valor);
        if(atribut.equalsIgnoreCase("Origen")){
            this.origen = valor;
        } else if(atribut.equalsIgnoreCase("PesKg")){
            this.pesKg = Float.valueOf(valor);
        }
    }
    
    public Peix(){
        super();
        this.origen ="";
        this.pesKg=0;
    }
    
    public Peix(String origen, int pesKg){
        super();
        this.origen =origen;
        this.pesKg=pesKg;
    }
    
    public Peix(
            String telefonAmo, String dniAmo, String nomAmo, String nomMascota,
            int edatMascota, int numVacunes,
            String origen, int pesoKg){
        super(telefonAmo, dniAmo, nomAmo, nomMascota, edatMascota, numVacunes);
        this.origen =origen;
        this.pesKg=pesoKg;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
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
                "\nOrigen: " + this.origen +
                "\nPesKg: "+ this.pesKg;
    }
}
