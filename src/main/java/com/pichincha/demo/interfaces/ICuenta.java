package com.pichincha.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.pichincha.demo.modelo.Cuenta;

@Repository
public interface ICuenta extends CrudRepository<Cuenta, Integer> {

}
