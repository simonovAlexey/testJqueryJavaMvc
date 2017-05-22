package com.simonov.testJqueryJavaMvc.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name = "users")
@Data
public class User {

    @Id
    @Access(value = AccessType.PROPERTY)
    @Column(name = "login", nullable = false)
    @NotBlank
    @SafeHtml
    private String login;

    @Column(name = "PASSWORD", nullable = false)
    @NotBlank
    @SafeHtml
    private String Password;

    @Column(name = "FirstName", nullable = false)
    private String FirstName;

    @Column(name = "LastName", nullable = false)
    private String LastName ;

    @Column(name = "LANGUAGE", nullable = false)
    private String Language ;


}
