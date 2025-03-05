package com.aziz.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // generate Id automatically ( no id from frontend when new user created )
    private Long id;

    private String name;

    private String locality;

    private String address;

    private String city;

    private String province;

    private String postalCode;

    private String mobile;
}
