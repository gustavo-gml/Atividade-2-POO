package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Carro {
    private String marca;
    private LocalDateTime ano;

    public Carro(String marca, LocalDateTime ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public Carro() {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDateTime getAno() {
        return ano;
    }

    public void setAno(LocalDateTime ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", ano=" + ano.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                '}';
    }
}
