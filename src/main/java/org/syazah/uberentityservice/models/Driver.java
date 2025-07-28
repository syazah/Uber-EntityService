package org.syazah.uberentityservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "bookings"})
public class Driver extends BaseModel {

    private String name;

    private String aadharCard;

    @Column(nullable = false, unique = true)
    private String licenseNumber;

    private String phoneNumber;

    @Enumerated(value = EnumType.STRING)
    private DriveApprovalStatus approvalStatus;

    @OneToOne
    private ExactLocation lastKnownLocation;

    @OneToOne
    private ExactLocation home;

    @DecimalMin(value = "0.00", message = "Rating must be between 0.00 and 5.00")
    @DecimalMax(value = "5.00", message= "Rating must be between 0.00 and 5.00")
    private Double rating;

    private String activeCity;

    private Boolean isAvailable;

    // 1 : n , Driver : Booking
    @OneToMany(mappedBy = "driver")
    @Fetch(FetchMode.SUBSELECT)
    private List<Booking> bookings;
}
