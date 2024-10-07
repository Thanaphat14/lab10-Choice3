package se331.lab.rest.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.repository.AuctionItemRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AuctionItemServiceImpl implements AuctionItemService {

    @Autowired
    AuctionItemRepository auctionItemRepository;

    @Override
    public List<AuctionItem> getAllItems() {
        return auctionItemRepository.findAll();
    }

    @Override
    public AuctionItem getItemById(Long id) {
        return auctionItemRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("AuctionItem not found"));
    }

    @Override
    public List<AuctionItem> searchByDescription(String description) {
        return auctionItemRepository.findByDescriptionContaining(description);
    }

    @Override
    public List<AuctionItem> findBySuccessfulBidAmountLessThan(BigDecimal amount) {
        return auctionItemRepository.findBySuccessfulBid_AmountLessThan(amount);
    }

    @Override
    public AuctionItem saveItem(AuctionItem auctionItem) {
        return auctionItemRepository.save(auctionItem);
    }
}


