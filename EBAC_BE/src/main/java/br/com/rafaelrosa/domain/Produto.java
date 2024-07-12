package br.com.rafaelrosa.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_produto_2")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
    @SequenceGenerator(name = "prod_seq", sequenceName = "seq_prod", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "codigo", nullable = false, length = 10, unique = true)
    private String codigo;

    @Column(name = "nome", length = 60, nullable = false)
    private String nome;

    @Column(name = "preco", nullable = false)
    private Double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
