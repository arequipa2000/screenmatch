package com.aluracursos.screenmatch.Principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("La familia del futuro", 2007);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(5);
        var peliculadeBruno = new Pelicula("El Señor de los Anillos", 2021);
        peliculadeBruno.evalua(3);
        Serie casadragon = new Serie("La casa del Dragon", 2022);
        casadragon.evalua(8);

        List<Titulo> lista = new LinkedList<>();
        lista.add(peliculadeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casadragon);

        for (Titulo item: lista) {
            System.out.println("for each: "+item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>1){  //if (item instanceof Pelicula pelicula) en caso TRUE crea variable pelicula
            System.out.println(pelicula.getClasificacion());
            }else{
                System.out.println("No es posible.");
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Peneope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Taylor swift");
        Collections.sort(listaDeArtistas);
        System.out.println("ista de artistas ordenadas: "+ listaDeArtistas);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Lista de Peliculas ordenada: " + lista);
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Ordenado: "+ lista);
    }
}
