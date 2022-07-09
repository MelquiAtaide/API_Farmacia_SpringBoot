package br.com.melqui.poo.farmaciaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.melqui.poo.farmaciaapi.main.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
    
}
