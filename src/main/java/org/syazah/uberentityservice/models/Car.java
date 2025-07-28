package org.syazah.uberentityservice.models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Car extends BaseModel {

    @Column(nullable = false, unique = true)
    private String plateNumber;

    @ManyToOne
    private Color color;

    private String brand;

    private String model;

    @Enumerated(EnumType.STRING)
    private CarType type;

    @OneToOne
    private Driver driver;
}
