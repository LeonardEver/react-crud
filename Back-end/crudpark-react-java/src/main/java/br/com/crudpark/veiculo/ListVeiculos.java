package br.com.crudpark.veiculo;

import br.com.crudpark.veiculo.Veiculos;

public record ListVeiculos(Long id, String marca, String modelo, String cor, String placa, String tipo) {

    public ListVeiculos(Veiculos veiculos) {
        this(veiculos.getId(), veiculos.getMarca(), veiculos.getModelo(), veiculos.getCor(), veiculos.getTipo(), veiculos.getPlaca());
    }
}
