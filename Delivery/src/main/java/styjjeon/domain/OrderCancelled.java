package styjjeon.domain;

import java.util.*;
import lombok.*;
import styjjeon.domain.*;
import styjjeon.infra.AbstractEvent;

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
}
