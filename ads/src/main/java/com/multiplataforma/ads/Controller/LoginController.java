package com.multiplataforma.ads.Controller;

import com.multiplataforma.ads.DTO.DadosAtualizacaoLoginDTO;
import com.multiplataforma.ads.DTO.DadosCadastroLoginDTO;
import com.multiplataforma.ads.Service.LoginService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public ResponseEntity startSession(@RequestBody @Valid DadosCadastroLoginDTO dadosLogin){
        return loginService.startSession(dadosLogin);
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateLogin(@RequestBody @Valid DadosAtualizacaoLoginDTO dadosLogin) {
        return loginService.updateLogin(dadosLogin);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteLogin (@PathVariable String id){
        return loginService.deleteLogin(id);
    }

}
