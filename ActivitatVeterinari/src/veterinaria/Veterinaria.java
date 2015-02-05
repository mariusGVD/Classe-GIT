package veterinaria;

import animals.Amfibi;
import animals.Animals;
import animals.Au;
import animals.Gat;
import animals.Gos;
import animals.Peix;
import animals.Reptil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;

public class Veterinaria {
    private Scanner sc;
    private List<Animals> animals;

    public Veterinaria(Scanner sc, List<Animals> animals) {
        this.sc = sc;
        this.animals = animals;
    }    

    public void menuPrincipal(){
        boolean salir = false;
        int index;
        int opcion;
        while(!salir){
            System.out.println();
            System.out.println("Menú:");
            System.out.println("1: Veure resum aaaa dels animals");
            System.out.println("2: Veure totes les dades dels animals");
            System.out.println("3: Introduir nova mascota");
            System.out.println("4: Borrar mascota");
            System.out.println("5: Sortir");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    index = 1;
                    if(!animals.isEmpty()){
                        for(Animals animal : animals){
                            System.out.println((index++)+".\tAmo: "+animal.getNomAmo()+", Nom: "+animal.getNomMascota());
                        }
                    }
                    else
                        System.out.println("No hi han mascotes guardades");
                    break;
                case 2:
                    if(!animals.isEmpty()){
                        System.out.println("Introdueix la posicio del animal en la llista");
                        index = Integer.parseInt(sc.nextLine()) - 1;
                        if(index < 0 || index >= animals.size())
                            System.out.println("La posició ha d'estar compresa entre 1 i la quantitat d'animals");
                        else
                            System.out.println(animals.get(index).toString());
                    }
                    else
                        System.out.println("No hi han animals en la llista.");
                    break;
                case 3:
                    crearAnimal();
                    break;
                case 4:
                    if(!animals.isEmpty()){
                        System.out.println("Introdueix la posicio del animal en la llista");
                        index = Integer.parseInt(sc.nextLine()) - 1;
                        if(index < 0 || index >= animals.size())
                            System.out.println("La posició ha d'estar compresa entre 1 i la quantitat d'animals");
                        else{
                            Animals animal = animals.remove(index);
                            System.out.println("El seguent animal ha sigut eliminat de la base de dades: "+animal.toString());
                        }
                    }
                    else
                        System.out.println("No hi han animals en la llista.");
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Selecciona una opció valida");
                    break;
            }
        }
    }
    
    public void crearAnimal(){        
        boolean invalid = false;
        Animals nouAnimal = new Animals();
        do {
            System.out.println("Selecciona el tipus d'animal:");
            System.out.println("1: Amfbi");
            System.out.println("2: Au");
            System.out.println("3: Gat");
            System.out.println("4: Gos");
            System.out.println("5: Peix");
            System.out.println("6: Reptil");
            int tipo = Integer.parseInt(sc.nextLine());

            switch (tipo) {
                case 1:
                    nouAnimal = new Amfibi();
                    break;
                case 2:
                    nouAnimal = new Au();
                    break;
                case 3:
                    nouAnimal = new Gat();
                    break;
                case 4:
                    nouAnimal = new Gos();
                    break;
                case 5:
                    nouAnimal = new Peix();
                    break;
                case 6:
                    nouAnimal = new Reptil();
                    break;
                default:
                    System.out.println("Selecciona un tipus d'animal valid.");
                    invalid = true;
                    break;
            }
        } while (invalid);
        nouAnimal.leerDatosDesdeTeclado(sc);
        animals.add(nouAnimal);
        System.out.println(nouAnimal.toString());
    }
    
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //llegir del arxiu de text
        File archivo = new File("animals.txt");
        List<Animals> animales = Persistencia.leerDatosAnimal(archivo); 
        Veterinaria veterinaria = new Veterinaria(sc, animales);
        veterinaria.menuPrincipal();
        Persistencia.excribirAnimales(veterinaria.animals, archivo);
    }//fi main   

}
