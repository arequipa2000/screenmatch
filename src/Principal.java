import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

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

        }
}
