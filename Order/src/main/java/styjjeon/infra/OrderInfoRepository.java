package styjjeon.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import styjjeon.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "orderInfos",
    path = "orderInfos"
)
public interface OrderInfoRepository
    extends PagingAndSortingRepository<OrderInfo, Long> {}
