package com.bs23.travelagency.service;


import com.bs23.travelagency.entity.Location;

import java.util.List;
import java.util.Optional;

/**
 * Created by nafizul.islam on 9/26/2020.
 */
public interface LocationService {

    public List<Location> getAllLocation();
    public Optional<Location> getLocationById(Long locationId);
}
