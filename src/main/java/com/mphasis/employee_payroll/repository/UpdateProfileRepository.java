package com.mphasis.employee_payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.employee_payroll.model.UpdateProfile;

@Repository
public interface UpdateProfileRepository extends JpaRepository<UpdateProfile, Long> {

}
