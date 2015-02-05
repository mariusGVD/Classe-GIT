package animals;

import java.util.Scanner;

public class Amfibi extends Animals{
    private String color;
    private String textura;
    private String tipusAmfibi;
    public Amfibi(){
        super();
        this.color ="";
        this.textura="";
        this.tipusAmfibi="";
    }
    public Amfibi(String color, String textura, String tipusAmfibi){
        super();
        this.color =color;
        this.textura=textura;
        this.tipusAmfibi=tipusAmfibi;
    }
    public Amfibi(
            String telefonAmo, String dniAmo, String nomAmo, String nomMascota,
            int edatMascota, int numVacunes,
            String color, String textura, String tipusAmfibi){
        super(telefonAmo, dniAmo, nomAmo, nomMascota, edatMascota, numVacunes);
        this.color =color;
        this.textura=textura;
        this.tipusAmfibi=tipusAmfibi;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getTipusAmfibi() {
        return tipusAmfibi;
    }

    public void seTipusAmfibi(String tipoAnfibio) {
        this.tipusAmfibi = tipoAnfibio;
    }
    
    @Override
    public String toString(){
        return super.toString()+
                "\nColor: " + this.color +
                "\nTextura: "+ this.textura+
                "\nTipus Amfibi: " +this.tipusAmfibi;
    }
    
    @Override
    public void cargarAtributo(String atributo, String valor){
        super.cargarAtributo(atributo, valor);
        if(atributo.equalsIgnoreCase("Color")){
            this.color = valor;
        } else if(atributo.equalsIgnoreCase("Textura")){
            this.textura = valor;
        } else if(atributo.equalsIgnoreCase("Tipus Amfibi")){
            this.tipusAmfibi = valor;
        } 
    }
    
    @Override
    public void leerDatosDesdeTeclado(Scanner sc){
        super.leerDatosDesdeTeclado(sc);
        System.out.println("Ingressi el color del animal:");
        this.color = sc.nextLine();
        System.out.println("Ingressi la textura del animal:");
        this.textura = sc.nextLine();
        System.out.println("Ingressi tipus de Amfibi:");
        this.tipusAmfibi = sc.nextLine();
    }
    
}
