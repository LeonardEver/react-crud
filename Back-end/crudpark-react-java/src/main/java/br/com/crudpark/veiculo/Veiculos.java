package br.com.crudpark.veiculo;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "veiculos")
@Entity(name = "veiculos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "id")
public class Veiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private String tipo;

    public Veiculos(CadVeiculos dadosv) {
        this.marca = dadosv.marca();
        this.modelo = dadosv.modelo();
        this.placa = dadosv.placa();
        this.tipo = dadosv.tipo();
        this.cor = dadosv.cor();

    }

    public void attVeiculos(AttVeiuclos dados) {
        if(dados.marca() != null) {
            this.marca = dados.marca();
        }
        if(dados.modelo() != null) {
            this.modelo = dados.modelo();
        }
        if(dados.placa() != null) {
            this.placa = dados.placa();
        }
        if(dados.tipo() != null) {
            this.tipo = dados.tipo();
        }
        if(dados.cor() != null) {
            this.cor = dados.cor();
        }
    }
}
