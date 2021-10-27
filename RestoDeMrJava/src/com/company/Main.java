package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String rep;
        boolean boucle_fini = false;

        String newLine = System.getProperty("line.separator");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("resto.txt");
        FileWriter writer = new FileWriter(file);

        writer.write("Entrées:" + newLine);
        System.out.println("Tapez 'suivant' pour valider les entrées");
        System.out.println("Choisissez vos Entrées:");

        while (!boucle_fini) {
            rep = br.readLine();
            if (rep.equals("suivant")){
                boucle_fini = true;
            }else{
                writer.write("    " + rep + newLine);
            }
        }

        writer.write("\nPlats:" + newLine);
        System.out.println("Tapez 'suivant' pour valider les plats");
        System.out.println("Choisissez vos Plats:");

        boucle_fini = false;
        while (!boucle_fini) {
            rep = br.readLine();
            if (rep.equals("suivant")){
                boucle_fini = true;
            }else{
                writer.write("    " + rep + newLine);
            }
        }
        writer.write(newLine + "Desserts:"+ newLine);
        System.out.println("Tapez 'terminer' pour valider le repas");
        System.out.println("Choisissez vos Dessert:");

        boucle_fini = false;
        while (!boucle_fini) {
            rep = br.readLine();
            if (rep.equals("terminer")){
                boucle_fini = true;
            }else{
                writer.write("    " + rep + newLine);
            }
        }
        writer.close();

        FileReader reader = new FileReader(file);
        //System.out.println(file.getAbsolutePath());
        BufferedReader buffer = new BufferedReader(reader);

        boolean read = true;

        while(read){
            String line = buffer.readLine();
            if(line == null){
                read = false;
                continue;
            }
            System.out.println(line);
        }
        buffer.close();
    }
}