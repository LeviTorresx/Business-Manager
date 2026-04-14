package com.bussinessmanager.BM.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long storeId;
    private String storeName;
    private String storeEmail;
    private String address;

    @ManyToOne
    @JoinColumn(name = "admin_id", referencedColumnName = "adminId")
    private Admin admin;

}
