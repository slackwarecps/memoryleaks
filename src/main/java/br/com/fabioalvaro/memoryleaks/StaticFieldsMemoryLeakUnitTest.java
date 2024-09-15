package br.com.fabioalvaro.memoryleaks;


import java.util.List;
import java.util.ArrayList;

public class StaticFieldsMemoryLeakUnitTest {

    public  static  List<Double> list = new ArrayList<>();

    //Vou inserir 10 milhões de elementos na lista

    public void populateList() {
        for (int i = 0; i < 10000000 ; i++) {
            list.add(Math.random());
        }
        System.out.println("fase 2....");
    }


    public static void main(String[] args) {
        System.out.println("fase 1....");
        new StaticFieldsMemoryLeakUnitTest().populateList();
        System.out.println("fase 3....");
        System.out.println("acabou....");
    }
}
