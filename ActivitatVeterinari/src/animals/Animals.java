package animals;

import java.util.Scanner;

public class Animals {
    protected String telefonAmo;
    protected String dniAmo;
    protected String nomAmo;
    protected String nomMascota;
    protected int edatMascota;
    protected int numVacunes;

    public void cargarAtributo(String atributo, String valor){
        if(atributo.equalsIgnoreCase("telefonAmo")){
            this.telefonAmo = valor;
        } else if(atributo.equalsIgnoreCase("dniAmo")){
            this.dniAmo = valor;
        } else if(atributo.equalsIgnoreCase("nomAmo")){
            this.nomAmo = valor;
        } else if(atributo.equalsIgnoreCase("nomMascota")){
            this.nomMascota = valor;
        } else if(atributo.equalsIgnoreCase("edatMascota")){
            this.edatMascota = Integer.valueOf(valor);
        } else if(atributo.equalsIgnoreCase("numVacunes")){
            this.numVacunes = Integer.valueOf(valor);
        } 
    }//final metode 
    
    public void leerDatosDesdeTeclado(Scanner sc){
        System.out.println("Ingressi el telefon del amo:");
        this.telefonAmo = sc.nextLine();
        System.out.println("Ingressi el nom del amo:");
        this.nomAmo = sc.nextLine();
        System.out.println("Ingressi el dni del amo:");
        this.dniAmo = sc.nextLine();
        System.out.println("Ingressi el nom de la mascota:");
        this.nomMascota = sc.nextLine();
        System.out.println("Ingresi la edat de la mascota:");
        this.edatMascota = Integer.parseInt(sc.nextLine());
        System.out.println("Ingressi el numero de vacunes:");
        this.numVacunes = Integer.parseInt(sc.nextLine());
    }
    
    public Animals(){
        this.dniAmo="";
        this.edatMascota = 0;
        this.telefonAmo="";
        this.nomAmo="";
        this.nomMascota="";
        this.numVacunes=0;
    }
    public Animals(String telefonAmo, String dniAmo, String nomAmo, String nomMascota,
            int edatMascota, int numVacunes){
        this.dniAmo= dniAmo;
        this.edatMascota = edatMascota;
        this.telefonAmo= telefonAmo;
        this.nomAmo= nomAmo;
        this.nomMascota= nomMascota;
        this.numVacunes=numVacunes;
    }
    
    public Animals(String dniAmo, String nomAmo, String nomMascota){
        this.dniAmo= dniAmo;
        this.nomAmo= nomAmo;
        this.nomMascota= nomMascota;
    }
    
    public String getTelefonAmo() {
        return telefonAmo;
    }

    public void setTelefonAmo(String telefonAmo) {
        this.telefonAmo = telefonAmo;
    }

    public String getDniAmo() {
        return dniAmo;
    }

    public void setDniAmo(String dniAmo) {
        this.dniAmo = dniAmo;
    }

    public String getNomAmo() {
        return nomAmo;
    }

    public void setNomAmo(String nomAmo) {
        this.nomAmo = nomAmo;
    }

    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
    }

    public int getEdatMascota() {
        return edatMascota;
    }

    public void setEdatMascota(int edatMascota) {
        this.edatMascota = edatMascota;
    }

    public int getNumVacunes() {
        return numVacunes;
    }

    public void setNumVacunes(int numVacunes) {
        this.numVacunes = numVacunes;
    }
    
    @Override
    public String toString(){
        return "\nNom Mascota: " + this.nomMascota +
                "\nEdat Mascota: "+ this.edatMascota+
                "\nNum. Vacunes: " +this.numVacunes+
                "\nNom Amo: "+ this.nomAmo +
                "\nDNI Amo: "+this.dniAmo+
                "\nTelefon Amo: "+this.telefonAmo;
    }
}
