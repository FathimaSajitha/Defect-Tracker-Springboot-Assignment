package com.Defect.Tracker.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Defect.Tracker.entities.AddModule;

public interface AddModuleRepository  extends JpaRepository<AddModule ,Long>{
 	   AddModule findBymoduleId(Long id);
}









































