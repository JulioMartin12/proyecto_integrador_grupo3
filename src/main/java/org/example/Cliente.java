package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {
    private String CUIT;
    private String razonSocial;
    Cliente(String CUIT, String razonSocial){
        this.CUIT = CUIT;
        this.razonSocial = razonSocial;
    }
    Cliente(){}
}
