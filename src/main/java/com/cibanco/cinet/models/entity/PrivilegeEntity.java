package com.cibanco.cinet.models.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "um_privilege")
@Data
public class PrivilegeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    @Column(name = "service_oid")
    private Long serviceOid;

    private Integer versionnumber;
    private String code;
    private String description;
    private Boolean signable;
    private LocalDateTime modificationtime;
    private String modificationuser;
    private LocalDateTime creationtime;

    @OneToMany(mappedBy = "privilege")
    private Set<ProfilePrivilegeRelationEntity> privilegeProfiles;
}