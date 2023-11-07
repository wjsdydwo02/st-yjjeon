package styjjeon.domain;

import java.util.*;
import lombok.*;
import styjjeon.domain.*;
import styjjeon.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private Long productId;
    private Integer qty;
    private String status;
    private Date deliveryDt;
}
