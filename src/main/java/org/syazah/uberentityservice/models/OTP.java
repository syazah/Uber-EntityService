package org.syazah.uberentityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class OTP extends BaseModel{

    private String code;

    private String phoneNumber;

    public static OTP make(String phoneNumber){
        Random random = new Random();
        Integer code =random.nextInt(9000)+1000;
        return OTP.builder()
                .code(code.toString())
                .phoneNumber(phoneNumber)
                .build();
    }
}
