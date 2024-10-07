package se331.lab.rest.service;

import se331.lab.rest.entity.AuctionItem;

import java.math.BigDecimal;
import java.util.List;

public interface AuctionItemService {
    List<AuctionItem> getAllItems();
    AuctionItem getItemById(Long id);
    List<AuctionItem> searchByDescription(String description);
    List<AuctionItem> findBySuccessfulBidAmountLessThan(BigDecimal amount);
    AuctionItem saveItem(AuctionItem auctionItem);
}


