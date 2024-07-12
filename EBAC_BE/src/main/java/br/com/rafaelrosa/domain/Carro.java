package br.com.rafaelrosa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "seq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "modelo", nullable = false, length = 20, unique = true)
    private String modelo;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_marca_fk",
                foreignKey = @ForeignKey(name = "fk_marca_carro"),
                referencedColumnName = "id", nullable = false)
    private Marca marca;

    @ManyToMany(mappedBy = "carros")
    private List<Acessorio> acessorios;

    public Carro() {
        this.acessorios = new ArrayList<Acessorio>();
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void add(Acessorio acessorio) {
        this.acessorios.add(acessorio);
    }
}
