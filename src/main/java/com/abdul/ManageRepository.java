package com.abdul;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @Author by AbdulQader
 * on 8/7/2019.
 */
@RepositoryRestResource
public interface ManageRepository extends CrudRepository<Manager,Long>{
    List<Manager> findByEmployeesRoleContains(@Param("q")String role);
    List<Manager> findDistinctByEmployeesLastNameContains(@Param("q")String lastName);
}
