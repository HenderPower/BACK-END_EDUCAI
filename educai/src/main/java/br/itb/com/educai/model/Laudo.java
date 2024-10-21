package br.itb.com.educai.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Laudo")

public class Laudo {

    public Laudo() {

    }


     public Laudo(long cod_laudo, String nome){
         this.cod_laudo = cod_laudo;
         this.nome = nome;
     }
     @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long cod_laudo;


    private String cod_cid;

     private String nome;


    private String obs_laudo;


     private LocalDate data_laudo;


     private int rm_aluno;


     private int cod_prof;

    public long getCod_laudo() {
        return cod_laudo;
    }

    public void setCod_laudo(long cod_laudo) {
        this.cod_laudo = cod_laudo;
    }

    public String getCod_cid() {
        return cod_cid;
    }

    public void setCod_cid(String cod_cid) {
        this.cod_cid = cod_cid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObs_laudo() {
        return obs_laudo;
    }

    public void setObs_laudo(String obs_laudo) {
        this.obs_laudo = obs_laudo;
    }

    public LocalDate getData_laudo() {
        return data_laudo;
    }

    public void setData_laudo(LocalDate data_laudo) {
        this.data_laudo = data_laudo;
    }

    public int getRm_aluno() {
        return rm_aluno;
    }

    public void setRm_aluno(int rm_aluno) {
        this.rm_aluno = rm_aluno;
    }

    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }
}
