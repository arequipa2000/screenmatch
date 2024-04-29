package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private int episodioporTemporada;
    private  int minutosporEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }



    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodioporTemporada * minutosporEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioporTemporada() {
        return episodioporTemporada;
    }

    public void setEpisodioporTemporada(int episodioporTemporada) {
        this.episodioporTemporada = episodioporTemporada;
    }

    public int getMinutosporEpisodio() {
        return minutosporEpisodio;
    }

    public void setMinutosporEpisodio(int minutosporEpisodio) {
        this.minutosporEpisodio = minutosporEpisodio;
    }
}
