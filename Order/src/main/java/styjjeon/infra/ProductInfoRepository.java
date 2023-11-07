package styjjeon.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import styjjeon.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "productInfos",
    path = "productInfos"
)
public interface ProductInfoRepository
    extends PagingAndSortingRepository<ProductInfo, Long> {}
