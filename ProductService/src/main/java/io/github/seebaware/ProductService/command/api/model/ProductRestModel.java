package io.github.seebaware.ProductService.command.api.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
public record ProductRestModel (
        String name,
        BigDecimal price,
        Integer quantity
) { }
