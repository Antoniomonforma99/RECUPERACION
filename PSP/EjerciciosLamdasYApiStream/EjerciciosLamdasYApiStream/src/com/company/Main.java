package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

enum Marca {
    BMW, AUDI, VOLKSWAGEN, PEUGEOT, CITROEN, FORD;
        }

public class Main {

    public static void main(String[] args) {


        Marca m1 = Marca.BMW;
        Marca m2 = Marca.AUDI;
        Marca m3 = Marca.VOLKSWAGEN;
        Marca m4 = Marca.PEUGEOT;
        Marca m5 = Marca.CITROEN;
        Marca m6 = Marca.FORD;
        Marca m7 = Marca.VOLKSWAGEN;

	    Vehiculo v1 = new Vehiculo("1111AAA", m1, 15000);
        Vehiculo v2 = new Vehiculo("2222BBB", m2, 130000);
        Vehiculo v3 = new Vehiculo("3333CCC", m3, 20500);
        Vehiculo v4 = new Vehiculo("4444DDD", m4, 50000);
        Vehiculo v5 = new Vehiculo("5555EEE", m5, 75000);
        Vehiculo v6 = new Vehiculo("6666FFF", m6, 150000);
        Vehiculo v7 = new Vehiculo("7777FFF", m7, 7000);

        List<Vehiculo> vehiculos = Arrays.asList(v1,v2,v3,v4,v5,v6,v6,v7);

        System.out.println("Vamos a usar la función Map() para mostrar una colección con solamente las matrículas de los coches");
        System.out.println();


        //Opcion 1
        List <String> matriculas =
                vehiculos.stream()
                .map(Vehiculo::getMatricula)
                .distinct()
                .collect(Collectors.toUnmodifiableList());

        System.out.println(matriculas);

        //Opcion 2
        String matriculasStr =
                vehiculos.stream()
                .map(Vehiculo::getMatricula)
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println(matriculasStr);




        System.out.println();
        System.out.println("Vamos a usar la función filter() para mostrar solo los vehículos 50000 kms o más ");
        System.out.println();

        List<Vehiculo> vehiculosFiltradosPorKms = vehiculos.stream()
                .filter( vehiculo -> vehiculo.getNumKm() >= 50000)
                .collect(Collectors.toList());

        System.out.println(vehiculosFiltradosPorKms);
        System.out.println();


        System.out.println("Vamos a usar la función sorted() para ordenar los vehículos según los kms");
        System.out.println();

        List<Vehiculo> vehiculosOrdenadosPorKms = vehiculos.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(vehiculosOrdenadosPorKms);
        System.out.println();

        System.out.println("Vamos a usar la función distinct() para mostrar una lista con las diferentes marcas de vehículos");
        System.out.println();

        String marcas[]= new String[vehiculos.size()];
        List<String> marcasVehiculos = Arrays.asList(marcas);

        for (int i = 0; i < vehiculos.size() ; i++) {
            marcas[i] = String.valueOf(vehiculos.get(i).getMarca());
        }
        marcasVehiculos.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(marcasVehiculos);
        System.out.println();

        System.out.println("Vamos a usar la función reduce() y map() para obtener la suma de todos los kms de los vehículos");
        System.out.println();
        
        Integer kms[] = new Integer[vehiculos.size()];
        List<Integer> kmsPorCoche = Arrays.asList(kms);

        for (int i = 0; i < vehiculos.size(); i++) {
            kms[i] = Integer.valueOf(vehiculos.get(i).getNumKm());
        }
        
        kmsPorCoche.stream()
                .reduce(Integer::sum).ifPresent(System.out::println);


        System.out.println();
        System.out.println("Vamos a mostrar las dos primeras marcas de coches con menos de 100000kms");
        System.out.println();

        List<Marca> vehiculosMenosCienMilKms = vehiculos.stream()
                .filter(vehiculo -> vehiculo.getNumKm() < 100000)
                .map(Vehiculo::getMarca)
                .sorted()
                .limit(2)
                .collect(Collectors.toList());

        /*
        for (int i = 0; i < vehiculosMenosCienMilKms.size(); i++) {
            System.out.println(vehiculos.get(i).getMarca());
        }
        */





    }
}
