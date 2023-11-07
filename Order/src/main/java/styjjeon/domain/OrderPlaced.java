package styjjeon.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import styjjeon.domain.*;
import styjjeon.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private Long productId;
    private Integer qty;
    private Date orderDt;
    private String address;

    public OrderPlaced(OrderManagement aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
