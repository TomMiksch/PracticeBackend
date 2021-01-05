package com.sarahshusband.practicebackend.objects;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
@JsonDeserialize
@Getter
@Setter
public class Ingredients {
    String name;
    @Builder.Default
    BigDecimal amount = new BigDecimal("0");
    MassType massType;
    String massUnit;
}
