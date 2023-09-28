package br.com.crudpark.veiculo;

public record AttVeiuclos(
        Long id,
        String marca,
        String modelo,
        String cor,
        String placa,
        String tipo
) {
}
