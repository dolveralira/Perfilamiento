package com.cibanco.cinet.consumer.controller;

import com.cibanco.cinet.models.entity.ProfileEntity;
import com.cibanco.cinet.service.ProfileService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    @Operation(summary = "Listar todos los perfiles", description = "Obtiene una lista de todos los perfiles")
    public List<ProfileEntity> listar() {
        return profileService.listProfiles();
    }

    @PostMapping
    @Operation(summary = "Crear un perfil nuevo", description = "Permite crear un nuevo perfil")
    public ProfileEntity crear(@RequestBody ProfileEntity profile) {
        return profileService.createProfile(profile);
    }
}