package spcace.codegus.springsecurity.controllers.dtos;

public record LoginResponseDTO(String accessToken, Long expiresIn) {
}
