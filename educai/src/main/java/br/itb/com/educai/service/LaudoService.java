package br.itb.com.educai.service;


import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import br.itb.com.educai.model.Laudo;
import br.itb.com.educai.model.LaudoRepository;



@Service
public class LaudoService {

    final LaudoRepository laudoRepository;


    public LaudoService(LaudoRepository _laudoRepository){
    this.laudoRepository = _laudoRepository; }

    @Transactional
    public Laudo save(Laudo _laudo) { return laudoRepository.save(_laudo); }


    public List<Laudo> findAll(){
        List<Laudo> lista = laudoRepository.findAll();
        return lista;
    }


    public Laudo findAllById(long cod_laudo) {
        Laudo laudoEncontrado = laudoRepository.findAllById(cod_laudo);
        return laudoEncontrado;
    }

    @Transactional
        public Laudo update(Laudo _laudo) {
            Laudo laudoEncontrado = laudoRepository.findAllById(_laudo.getCod_laudo());
            if(laudoEncontrado.getCod_laudo() > 0)
                return laudoRepository.save(laudoEncontrado);
            else
                return new Laudo(0, "Laudo não encontrado");
        }

        @Transactional
        public boolean delete(Laudo _laudo){
            boolean sucesso = false;
            Laudo laudoEncontrado = laudoRepository.findAllById(_laudo.getCod_laudo());
            if (laudoEncontrado.getCod_laudo() > 0) {
                laudoRepository.deleteById(laudoEncontrado.getCod_laudo());
                sucesso = true;
            }

            return sucesso;


        }

    }



