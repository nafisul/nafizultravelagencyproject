package com.bs23.travelagency.repository;

import com.bs23.travelagency.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nafizul.islam on 9/27/2020.
 */
public interface LocationRepository extends JpaRepository<Location, Long> {
}
