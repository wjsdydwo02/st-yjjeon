package styjjeon.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import styjjeon.domain.*;
import styjjeon.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private Long productId;
    private Date orderDt;
    private Integer qty;
    private String status;

    public OrderCancelled(OrderManagement aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
