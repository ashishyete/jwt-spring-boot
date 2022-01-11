package com.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Setter
@Getter
public class Role {

    @Id
    private String roleName;
    private String roleDescription;
}
