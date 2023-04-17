/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integerwrappertest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author rodri
 */
public class ClaseEnvoltorio {
    
    private ArrayList<Integer> numeros;
    
    public ClaseEnvoltorio(){
        numeros = new ArrayList<Integer>();
    }
    
    public void generarNumeros(){
        
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(12); // Genera un número aleatorio entre 0 y 11
            numeros.add(num);
        }
        System.out.println("ArrayList: " + numeros);
    }
    public void contarNumeros(){
        
        System.out.println("Recuento de ocurrencias:");

        
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int num : numeros) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {  
                countMap.put(num, 1);
            }
        }

        
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            System.out.println(num + " se repitio " + count + " veces.");
        }
    }
}