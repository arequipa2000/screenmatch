import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

            Pelicula miPelicula = new Pelicula();
            miPelicula.setNombre("La familia del futuro");
            miPelicula.setFechaDeLanzamiento(2007);
            miPelicula.setDuracionEnMinutos(95);
            miPelicula.setIncluidoEnElPlan(true);

            miPelicula.muestraFichaTecnica();
            miPelicula.evalua(10);
            miPelicula.evalua(10);
            miPelicula.evalua(7.8);
            System.out.println(miPelicula.getTotalDelasEvaluaciones());
            System.out.println("Média de evaluaciones de la película: " +miPelicula.calculaMedia());

            Serie casadragon = new Serie();
            casadragon.setNombre("La casa del Dragon");
            casadragon.setFechaDeLanzamiento(2022);
            casadragon.setTemporadas(1);
            casadragon.setMinutosporEpisodio(50);
            casadragon.setEpisodioporTemporada(10);
            casadragon.muestraFichaTecnica();
            System.out.println(casadragon.getDuracionEnMinutos());

            Pelicula otraPelicula = new Pelicula();
            otraPelicula.setNombre("Matrix");
            otraPelicula.setFechaDeLanzamiento(1998);
            otraPelicula.setDuracionEnMinutos(180);

            CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
            calculadora.incluye(miPelicula);
            calculadora.incluye(casadragon);
            calculadora.incluye(otraPelicula);
            System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones: "+ calculadora.getTiempoTotal()+ " minutos");

            FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
            filtroRecomendacion.filtra(miPelicula);

            Episodio episodio = new Episodio();
            episodio.setNumero(1);
            episodio.setNombre("a Casa targaryan");
            episodio.setSerie(casadragon);
            episodio.setTotalVisualizaciones(30);

            filtroRecomendacion.filtra(episodio);
            System.out.println("-----------------------------------------");
            var peliculadeBruno = new Pelicula();
            peliculadeBruno.setNombre("El Señor de los Anillos");
            peliculadeBruno.setDuracionEnMinutos(180);
            peliculadeBruno.setFechaDeLanzamiento(2021);

            ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
            listaDePeliculas.add(peliculadeBruno);
            listaDePeliculas.add(miPelicula);
            listaDePeliculas.add(otraPelicula);
            System.out.println("Tamaño de la lista: "+ listaDePeliculas.size());
            System.out.println("la primera pelicula es: "+ listaDePeliculas.get(0).getNombre());
            System.out.println(listaDePeliculas);
        }
}
