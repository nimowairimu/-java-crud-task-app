//Like a class, an interface can have methods and variables, but the methods declared in interface are by default abstract (only method signature, no body). 
//Interfaces specify what a class must do and not how. It is the blueprint of the class.

package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springboot.model.Employee;

//spring data internally provides @repository annotation so no need to add it.
//@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}