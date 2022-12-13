package com.nttdatacentersSpringT3FMR.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdatacentersSpringT3FMR.persistence.Customer;

/**
 * Repositorio de los clientes 
 * 
 * @author nandi
 *
 */
@Repository
public interface CustomerRepositoyI extends JpaRepository<Customer, Long> {

	public Customer findByDni(String dni);
	
}
