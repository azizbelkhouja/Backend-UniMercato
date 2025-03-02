package com.aziz.model;

import com.aziz.domain.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // generate Id automatically ( no id from frontend when new user created )
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // password will not come when we fetch, pw must be secret
    private String password;

    private String email;

    private String fullName;

    private String mobile;

    private USER_ROLE role = USER_ROLE.ROLE_CUSTOMER;

    // address will be saved in db
    private Set<Address> addresses = new HashSet<>();

    // each user can use a coupon only one time
    private Set<Coupon> usedCoupons = new HashSet<>();

}
