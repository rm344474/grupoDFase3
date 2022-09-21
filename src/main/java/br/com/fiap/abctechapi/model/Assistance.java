package br.com.fiap.abctechapi.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "assistances")
@AllArgsConstructor
@NoArgsConstructor
public class Assistance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Os ids serão gerados como sequenciais
    private Long id;
    //Nome da assistencia a ser exibida para o usuario
    @Column(name = "name", nullable = false, length = 100)//Coluna nome NAME que não pode ser null com tamanho maximo 100
    private String name;

    @Column(name = "description", nullable = false, length = 300)
    private String description;

}
