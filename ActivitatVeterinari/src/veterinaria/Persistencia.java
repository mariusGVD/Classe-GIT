package veterinaria;

import animals.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Persistencia {

    public static ArrayList<Animals> leerDatosAnimal(File archivo) {
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<Animals> animals = new ArrayList();
        try {
                       
            // Obrim el fitxer i creem el metode BufferedReader
            if(!archivo.exists()){
                archivo.createNewFile();
                return animals;
            }
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Llegir fitxer
            String linea;
            Animals nouAnimal = new Animals();
            while ((linea = br.readLine()) != null) {
                if(linea.startsWith("TIPO_ANIMAL: ")){
                    nouAnimal = new Animals();
                    String subString = linea.substring(13);
                    if(subString.equalsIgnoreCase("Amfibi")){
                        nouAnimal = new Amfibi();
                    } else if(subString.equalsIgnoreCase("Au")){
                        nouAnimal = new Au();
                    } else if(subString.equalsIgnoreCase("Gat")){
                        nouAnimal = new Gat();
                    } else if(subString.equalsIgnoreCase("Gos")){
                        nouAnimal = new Gos();
                    } else if(subString.equalsIgnoreCase("Peix")){
                        nouAnimal = new Peix();
                    } else if(subString.equalsIgnoreCase("Reptil")){
                        nouAnimal = new Reptil();
                    }
                } else if(linea.equals("FIN")){//comprovem fi dades animal
                    animals.add(nouAnimal);
                } else{//Llegim dades del mateix animal
                    String aux[] = linea.split(": ");
                    String atribut = aux[0];
                    String valor = aux[1];
                    nouAnimal.cargarAtributo(atribut, valor);
                }
                System.out.println(linea);
            }//fi while
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	
         // Tancament del fitxer
            
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return animals;
    }//fi metode
    
    public static void excribirAnimales(List<Animals> animals, File arxiu){
        FileWriter fw = null;
        try{
            fw = new FileWriter(arxiu);
            BufferedWriter bw = new BufferedWriter(fw);
            String[] atributs;
            for(Animals animal: animals){
                bw.write("TIPO_ANIMAL: "+getTipusAnimal(animal));
                bw.newLine();
                atributs = animal.toString().split("\n");
                for(String atributo : atributs){
                    if(!atributo.trim().isEmpty()){
                        bw.write(atributo);
                        bw.newLine();
                    }
                }
                bw.write("FIN");
                bw.newLine();
                bw.flush();                        
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	
        	// Tancament del fitxer
        	
            try {
                if (null != fw) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    private static String getTipusAnimal(Animals animal){
        if(animal instanceof Amfibi)
            return "Amfibi";
        else if(animal instanceof Au)
            return "Au";
        else if(animal instanceof Gat)
            return "Gat";
        else if(animal instanceof Gos)
            return "Gos";
        else if(animal instanceof Peix)
            return "Peix";
        else if(animal instanceof Reptil)
            return "Reptil";
        else
            return "desconegut";
    }
}
