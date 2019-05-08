 package com.Defect.Tracker.service;

import java.util.List;

import com.Defect.Tracker.entities.AddDefect;



public interface AddDefectService {
   void saveDefect (AddDefect addDefect);
   List<AddDefect> getAllDefects();
   AddDefect  findBydefectId(Long id);
   void updateAddDefect (AddDefect addDefect);
   void deleteDefectById(Long id);
   
}
