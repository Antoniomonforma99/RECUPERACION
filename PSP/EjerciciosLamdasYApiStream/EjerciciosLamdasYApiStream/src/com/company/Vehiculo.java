package com.company;

public class Vehiculo implements Comparable {

    String matricula;
    Marca marca;
    Integer numKm;

    public Vehiculo(String matricula, Marca marca, Integer numKm) {
        this.matricula = matricula;
        this.marca = marca;
        this.numKm = numKm;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca=" + marca +
                ", numKm=" + numKm +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Integer getNumKm() {
        return numKm;
    }

    public void setNumKm(Integer numKm) {
        this.numKm = numKm;
    }

    @Override
    public int compareTo(Object o) {
        Vehiculo otro = (Vehiculo) o;

        return this.getNumKm().compareTo(otro.getNumKm());
    }
}
