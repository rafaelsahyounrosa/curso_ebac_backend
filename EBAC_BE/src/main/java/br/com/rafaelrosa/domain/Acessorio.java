package br.com.rafaelrosa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ac_seq")
    @SequenceGenerator(name = "ac_seq", sequenceName = "seq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(length = 50, nullable = false, unique = true)
    private String nome;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "tb_acessorio_carro",
                joinColumns = { @JoinColumn(name = "id_acessorio_fk")},
                inverseJoinColumns = {@JoinColumn(name = "id_carro_fk") } )
    private List<Carro> carros;

    public Acessorio() {
        this.carros = new ArrayList<Carro>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void add(Carro carro) {
        this.carros.add(carro);
    }
}
