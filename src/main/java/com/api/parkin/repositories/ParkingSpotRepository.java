package com.api.parkingcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public abstract class ParkingSpotRepository<ParkingSpotModel> implements JpaRepository<ParkingSpotModel, UUID>{
}
