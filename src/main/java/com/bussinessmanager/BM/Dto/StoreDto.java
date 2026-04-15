package com.bussinessmanager.BM.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreDto {
    private Long storeId;
    private String storeName;
    private String storeEmail;
    private String address;
    private  AdminDto adminDto;
}
