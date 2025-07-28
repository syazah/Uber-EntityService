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
public class Color extends BaseModel {
    @Column(unique = true, nullable = false)
    private String name;

}
