package styjjeon.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import styjjeon.DeliveryApplication;
import styjjeon.domain.DeliverReturned;
import styjjeon.domain.DeliveryCancelled;
import styjjeon.domain.DeliveryCompleted;
import styjjeon.domain.DeliveryStarted;

@Entity
@Table(name = "DeliveryManagement_table")
@Data
//<<< DDD / Aggregate Root
public class DeliveryManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private Long orderId;

    private Long productId;

    private Integer qty;

    private String status;

    private Date deliveryDt;

    private String address;

    @PostPersist
    public void onPostPersist() {
        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();

        DeliverReturned deliverReturned = new DeliverReturned(this);
        deliverReturned.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();

        DeliveryCancelled deliveryCancelled = new DeliveryCancelled(this);
        deliveryCancelled.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {}

    public static DeliveryManagementRepository repository() {
        DeliveryManagementRepository deliveryManagementRepository = DeliveryApplication.applicationContext.getBean(
            DeliveryManagementRepository.class
        );
        return deliveryManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void deliveryStart(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        DeliveryManagement deliveryManagement = new DeliveryManagement();
        repository().save(deliveryManagement);

        DeliveryStarted deliveryStarted = new DeliveryStarted(deliveryManagement);
        deliveryStarted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(deliveryManagement->{
            
            deliveryManagement // do something
            repository().save(deliveryManagement);

            DeliveryStarted deliveryStarted = new DeliveryStarted(deliveryManagement);
            deliveryStarted.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void deliveryCancel(OrderCancelled orderCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        DeliveryManagement deliveryManagement = new DeliveryManagement();
        repository().save(deliveryManagement);

        DeliveryCancelled deliveryCancelled = new DeliveryCancelled(deliveryManagement);
        deliveryCancelled.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(deliveryManagement->{
            
            deliveryManagement // do something
            repository().save(deliveryManagement);

            DeliveryCancelled deliveryCancelled = new DeliveryCancelled(deliveryManagement);
            deliveryCancelled.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
