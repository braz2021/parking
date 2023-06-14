package com.api.parkin.services;

import com.api.parkin.dtos.ParkingSpotDto;
import com.api.parkin.models.ParkingSpotModel;
import com.api.parkin.repositories.ParkingSpotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParkingSpotService {

    private final ParkingSpotRepository parkingSpotRepository;

   public ParkingSpotDto save(ParkingSpotModel parkingSpotModel){
       return null;
   }
}
