package com.processo.seletivo.processo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CamundaResponse {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Transient
        private List<Link> links;
        private String definitionId;
        private String businessKey;
        private String tenantId;
        private Boolean ended;
        private Boolean suspended;
        @Transient
        private UserCandidate variables;

}
