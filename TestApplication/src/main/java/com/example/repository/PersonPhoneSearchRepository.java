package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.PersonPhoneSearch;

@Repository
public interface PersonPhoneSearchRepository extends JpaRepository<PersonPhoneSearch, Integer> {
//	@Query("SELECT pm.first_name, pm.family_name, pl.phone_number FROM person_master pm INNER JOIN phone_list pl ON pm.person_id = pl.list_id")
	@Query("SELECT pps FROM PersonPhoneSearch pps WHERE pps.personMaster.validity = 1 and pps.validity = 1")
	Iterable <PersonPhoneSearch> findPersonPhoneListAll();
}
