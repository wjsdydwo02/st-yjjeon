package styjjeon.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import styjjeon.domain.*;
import styjjeon.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncresed extends AbstractEvent {

    private Long id;
    private String productName;
    private String produtImg;
    private Integer stock;

    public InventoryIncresed(InventoryManagement aggregate) {
        super(aggregate);
    }

    public InventoryIncresed() {
        super();
    }
}
//>>> DDD / Domain Event
