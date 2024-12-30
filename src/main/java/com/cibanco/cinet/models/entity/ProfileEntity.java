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

    private Long profileTypeOid;
    private Long profileStatusOid;
    private Integer versionNumber;
    private String name;
    private String description;
    private Boolean masterProfile;
    private LocalDateTime modificationTime;
    private String modificationUser;
    private LocalDateTime creationTime;

    @OneToMany(mappedBy = "profile")
    private Set<ProfilePrivilegeRelationEntity> profilePrivileges;
}