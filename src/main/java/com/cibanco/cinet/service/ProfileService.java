package com.cibanco.cinet.service;

import com.cibanco.cinet.models.entity.ProfileEntity;
import com.cibanco.cinet.models.entity.PrivilegeEntity;
import com.cibanco.cinet.repository.ProfileRepository;
import com.cibanco.cinet.repository.PrivilegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final PrivilegeRepository privilegeRepository;

    public ProfileService(ProfileRepository profileRepository, PrivilegeRepository privilegeRepository) {
        this.profileRepository = profileRepository;
        this.privilegeRepository = privilegeRepository;
    }

    public List<ProfileEntity> listProfiles() {
        return profileRepository.findAll();
    }

    public ProfileEntity createProfile(ProfileEntity profile) {
        return profileRepository.save(profile);
    }

    public List<PrivilegeEntity> listPrivileges() {
        return privilegeRepository.findAll();
    }
}