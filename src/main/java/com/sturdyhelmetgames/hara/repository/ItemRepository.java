package com.sturdyhelmetgames.hara.repository;

import com.sturdyhelmetgames.hara.model.Item;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by antti on 06/10/14.
 */
@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {
}
