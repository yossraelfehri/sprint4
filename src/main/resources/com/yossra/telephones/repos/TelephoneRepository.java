package com.yossra.telephones.repos;

import org.springframework.data.repository.JpaRepository;
import com.yossra.telephones.entities.Telephone;

public interface TelephoneRepository  extends JpaRepository<Telephone, Long>{

}
