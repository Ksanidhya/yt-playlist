package com.sanidya.ytapp.PlayTheList.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
@Document
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String UserFirstName;
    private String userLastName;
    private String userEmailId;
    private String userUniqueName;
}
