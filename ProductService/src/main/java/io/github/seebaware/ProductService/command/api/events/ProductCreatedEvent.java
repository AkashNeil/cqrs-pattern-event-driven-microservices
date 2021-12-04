package io.github.seebaware.ProductService.command.api.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

public record ProductCreatedEvent (
        String productId,
        String name,
        BigDecimal price,
        Integer quantity) {

    public ProductCreatedEvent() {
        this("","",new BigDecimal(0),0);
    }

}