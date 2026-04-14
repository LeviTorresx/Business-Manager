package com.bussinessmanager.BM.Repositories;

import com.bussinessmanager.BM.Entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
