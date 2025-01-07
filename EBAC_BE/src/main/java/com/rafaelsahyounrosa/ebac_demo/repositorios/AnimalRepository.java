package com.rafaelsahyounrosa.ebac_demo.repositorios;

import com.rafaelsahyounrosa.ebac_demo.entidades.Animal;
import com.rafaelsahyounrosa.ebac_demo.interfaces.RelatorioFuncionariosInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a where a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a where a.dataAdocao IS NOT NULL ORDER BY a.dataEntrada")
    List<Animal> findAdopted();

    @Query(value =
                "SELECT " +
                    "a.nome_recebedor as nomeFuncionario, " +
                    "COUNT(*) as quantidadeAnimaisResgatados " +
                "FROM animal a " +
                "WHERE a.data_entrada BETWEEN :dataMinima AND :dataMaxima " +
                "GROUP BY a.nome_recebedor " +
                "ORDER BY quantidadeAnimaisResgatados DESC"
            , nativeQuery = true
    )
    List<RelatorioFuncionariosInterface> relatorioFuncionariosAnimaisRegatados(
            @Param("dataMinima") LocalDate dataMinima,
            @Param("dataMaxima") LocalDate dataMaxima);
}
