package com.br.etec.nickolas.provacliente.controller;

import com.br.etec.nickolas.provacliente.model.ContasReceber;
import com.br.etec.nickolas.provacliente.repository.ContasReceberRepository;
import com.br.etec.nickolas.provacliente.repository.filter.ContasReceberFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contasreceber")
public class ContasReceberController {

    @Autowired
    private ContasReceberRepository contasreceberrepository;

    @GetMapping()
    public Page<ContasReceber> pesquisar(ContasReceberFilter contasreceberfilter, Pageable pageable){
        return contasreceberrepository.filtrar(contasreceberfilter, pageable);
    }

    @GetMapping("/todos")
    public List<ContasReceber> listartodascontasreceber() { return contasreceberrepository.findAll(); }
}
