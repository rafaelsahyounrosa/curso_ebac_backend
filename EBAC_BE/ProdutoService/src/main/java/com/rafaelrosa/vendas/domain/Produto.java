package com.rafaelrosa.vendas.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {

    public enum Status {
        ATIVO, INATIVO;
    }

    @Id
    @Schema(description = "Identificador único")
    private String id;

    @NotNull
    @Schema(description = "Nome", nullable = false)
    private String nome;

    @NotNull
    @Schema(description = "Valor", nullable = false)
    private BigDecimal valor;

    private Status status;
}
