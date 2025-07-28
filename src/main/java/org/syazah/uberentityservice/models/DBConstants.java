package org.syazah.uberentityservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class DBConstants extends BaseModel {
    @Column(nullable = false, unique = true)
    private String name;

    private String value;
}
