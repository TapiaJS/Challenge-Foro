package com.alura.challengeforo.infra.global;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class GlobalVariables {
    private Long userTokenId;

}