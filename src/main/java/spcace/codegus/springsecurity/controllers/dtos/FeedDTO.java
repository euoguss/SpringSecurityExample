package spcace.codegus.springsecurity.controllers.dtos;

import java.util.List;

public record FeedDTO(
    List<FeedItensDTO> feedItens,
    int page,
    int pageSize,
    int totalPages,
    Long totalElements
    ) {
}