package styjjeon.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import styjjeon.domain.*;
import styjjeon.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliverReturned extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private Long productId;
    private Integer qty;

    public DeliverReturned(DeliveryManagement aggregate) {
        super(aggregate);
    }

    public DeliverReturned() {
        super();
    }
}
//>>> DDD / Domain Event
