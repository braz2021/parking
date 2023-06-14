package com.api.parkin.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "TB_PARKING_SPOT")

public class ParkingSpotModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false,unique = true,length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true,length = 7)
    private String licensePlateCar;
    @Column(nullable = false,length = 70)
    private  String brandCard;
    @Column(nullable = false,length = 70)
    private String modelCar;
    @Column(nullable = false,length = 70)
    private String colorCar;
    @Column
    LocalDateTime registrationDate; // local de novos ou novo morador registro
    @Column(nullable = false, length = 130) // nome responsavel ou veiculo
    private String responsibleName;
    @Column(nullable = false,length = 30)
    private String apartament;
    @Column(nullable = false,length = 30)
    private  String block;

}