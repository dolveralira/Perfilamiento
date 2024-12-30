package com.cibanco.cinet.models.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "um_profile")
@Data
public class ProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    @Column(name = "profile_type_oid")
    private Long profileTypeOid;

    @Column(name = "profile_status_oid")
    private Long profileStatusOid;

    private Integer versionnumber;
    private String name;
    private String description;

    @Column(name = "master_profile")
    private Boolean masterProfile;

    private LocalDateTime modificationtime;
    private String modificationuser;
    private LocalDateTime creationtime;

    @OneToMany(mappedBy = "profile")
    private Set<ProfilePrivilegeRelationEntity> profilePrivileges;
}