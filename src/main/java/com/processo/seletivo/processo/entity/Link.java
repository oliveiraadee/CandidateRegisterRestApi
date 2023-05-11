package com.processo.seletivo.processo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Link {

    private String method;
    private String href;
    private String rel;
}
