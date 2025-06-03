package com.multiplataforma.ads.Service;

import com.multiplataforma.ads.DTO.DadosCadastroServicoDTO;
import com.multiplataforma.ads.Model.Login;
import com.multiplataforma.ads.Model.Servicos;
import com.multiplataforma.ads.Repository.LoginRepository;
import com.multiplataforma.ads.Repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicosService {

    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private ServicoRepository servicoRepository;

    public ResponseEntity savedService (DadosCadastroServicoDTO cadastroServico){
        Optional<Login> loginOptional = loginRepository.findByLogin(cadastroServico.loginResponsavel());

        if (loginOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Login não encontrado.");
        }

        Servicos servicos = new Servicos(cadastroServico, loginOptional.get());
        servicoRepository.save(servicos);
        System.out.println(servicos);
        return ResponseEntity.status(HttpStatus.CREATED).body("Serviço cadastrado com sucesso.");
    }
}
