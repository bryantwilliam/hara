package com.sturdyhelmetgames.hara.repository;

import com.sturdyhelmetgames.hara.model.Room;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by antti on 06/10/14.
 */
@RepositoryRestResource(collectionResourceRel = "rooms", path = "rooms")
public interface RoomRepository extends PagingAndSortingRepository<Room, Long> {

}
