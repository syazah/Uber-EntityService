package org.syazah.uberentityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class ExactLocation extends BaseModel {

    private Double latitude;

    private Double longitude;
}
