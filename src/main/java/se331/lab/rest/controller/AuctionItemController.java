package se331.lab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.service.AuctionItemService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/auction-items")
public class AuctionItemController {

    @Autowired
    AuctionItemService auctionItemService;

    @GetMapping
    public List<AuctionItem> getAllItems() {
        return auctionItemService.getAllItems();
    }

    @GetMapping("/{id}")
    public AuctionItem getItemById(@PathVariable Long id) {
        return auctionItemService.getItemById(id);
    }

    @GetMapping("/search")
    public List<AuctionItem> searchByDescription(@RequestParam String description) {
        return auctionItemService.searchByDescription(description);
    }

    @GetMapping("/successful-bid/less-than")
    public List<AuctionItem> searchBySuccessfulBidAmountLessThan(@RequestParam BigDecimal amount) {
        return auctionItemService.findBySuccessfulBidAmountLessThan(amount);
    }

    @PostMapping
    public AuctionItem createAuctionItem(@RequestBody AuctionItem auctionItem) {
        return auctionItemService.saveItem(auctionItem);
    }
}


