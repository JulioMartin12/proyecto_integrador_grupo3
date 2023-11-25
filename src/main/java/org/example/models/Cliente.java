package org.example.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente {
    private String CUIT;
    private String razon,Social;
    private String email;

}
