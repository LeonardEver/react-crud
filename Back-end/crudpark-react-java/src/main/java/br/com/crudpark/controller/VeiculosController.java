package br.com.crudpark.controller;
import br.com.crudpark.veiculo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculosRepository repository;


    @PostMapping
    @Transactional
    private void cadastrarVeiculos(CadVeiculos dados) {
        repository.save(new Veiculos(dados));
    }

    @GetMapping
    public List<ListVeiculos> listarVeic() { return repository.findAll().stream().map(ListVeiculos::new).toList();
    }

    @PostMapping
    @Transactional
    public  void atualizarVeic(@RequestBody AttVeiuclos dados) {
        var Veiculos = repository.getReferenceById(dados.id());
        Veiculos.attVeiculos(dados);
    }

    @DeleteMapping("{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

