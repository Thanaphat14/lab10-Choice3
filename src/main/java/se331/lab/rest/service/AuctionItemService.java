package se331.lab.rest.service;

import se331.lab.rest.entity.AuctionItemDTO; // Make sure to import the DTO class

import java.math.BigDecimal;
import java.util.List;

public interface AuctionItemService {
    List<AuctionItemDTO> getAllItems(); // Change the return type here
    AuctionItemDTO getItemById(Long id);
    List<AuctionItemDTO> searchByDescription(String description);
    List<AuctionItemDTO> findBySuccessfulBidAmountLessThan(BigDecimal amount);
    AuctionItemDTO saveItem(AuctionItemDTO auctionItemDTO); // Ensure this also uses DTO
}
