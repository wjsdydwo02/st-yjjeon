package styjjeon.domain;

import java.util.*;
import lombok.*;
import styjjeon.domain.*;
import styjjeon.infra.AbstractEvent;

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
}
