package br.itb.com.educai.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaudoRepository extends
        JpaRepository<Laudo, Long> {

    Laudo findAllById(Long cod_laudo);
}
