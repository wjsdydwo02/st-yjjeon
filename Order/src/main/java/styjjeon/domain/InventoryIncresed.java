package styjjeon.domain;

import java.util.*;
import lombok.*;
import styjjeon.domain.*;
import styjjeon.infra.AbstractEvent;

@Data
@ToString
public class InventoryIncresed extends AbstractEvent {

    private Long id;
    private String productName;
    private String produtImg;
    private Integer stock;
}
