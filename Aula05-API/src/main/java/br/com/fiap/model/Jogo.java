package br.com.fiap.model;
import lombok.*;
import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Jogo {
    private int id;
    private String nome;
    private LocalDate dataLancamento;
    private Classificacao classificacao;
}
