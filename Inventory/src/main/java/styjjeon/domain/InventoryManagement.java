package styjjeon.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import styjjeon.InventoryApplication;
import styjjeon.domain.InventoryIncresed;

@Entity
@Table(name = "InventoryManagement_table")
@Data
//<<< DDD / Aggregate Root
public class InventoryManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private String produtImg;

    private Integer stock;

    @PostUpdate
    public void onPostUpdate() {
        InventoryIncresed inventoryIncresed = new InventoryIncresed(this);
        inventoryIncresed.publishAfterCommit();
    }

    public static InventoryManagementRepository repository() {
        InventoryManagementRepository inventoryManagementRepository = InventoryApplication.applicationContext.getBean(
            InventoryManagementRepository.class
        );
        return inventoryManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void inventoryDecrease(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        InventoryManagement inventoryManagement = new InventoryManagement();
        repository().save(inventoryManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(inventoryManagement->{
            
            inventoryManagement // do something
            repository().save(inventoryManagement);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
