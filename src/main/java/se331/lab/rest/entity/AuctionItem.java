package se331.lab.rest.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class AuctionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String description;
    String type;

    @OneToMany(mappedBy = "auctionItem", cascade = CascadeType.ALL)
    List<Bid> bids;

    @OneToOne
    Bid successfulBid;
}
