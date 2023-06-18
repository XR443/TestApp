package com.raspopov.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.OffsetDateTime;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
@With
public class ToDo {
    @Id
    private Long id;

    private String name;
    private String description;
    private OffsetDateTime date;
}
