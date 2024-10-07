package se331.lab.rest.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    BigDecimal amount;
    LocalDateTime datetime;

    @ManyToOne
    @JoinColumn(name = "auction_item_id")
    AuctionItem auctionItem;

}


