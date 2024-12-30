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

    private Long serviceOid;
    private Integer versionNumber;
    private String code;
    private String description;
    private Boolean signable;
    private LocalDateTime modificationTime;
    private String modificationUser;
    private LocalDateTime creationTime;

    @OneToMany(mappedBy = "privilege")
    private Set<ProfilePrivilegeRelationEntity> privilegeProfiles;
}
