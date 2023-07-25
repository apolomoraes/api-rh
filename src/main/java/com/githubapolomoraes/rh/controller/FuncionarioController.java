package com.githubapolomoraes.rh.controller;

import com.githubapolomoraes.rh.model.Funcionario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @GetMapping
    public String testar() {
        return "testanto123...";
    }

    @PostMapping
    public Funcionario cadastrar(@RequestBody Funcionario funcionario) {
        System.out.println(funcionario);
        return funcionario;
    }
}
