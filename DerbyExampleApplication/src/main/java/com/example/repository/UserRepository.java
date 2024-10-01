package com.example.repository;
import org.springframework.data.repository.CrudRepository; 
import com.example.model.UserRecord;
public interface UserRepository extends CrudRepository<UserRecord,Integer>   {
	
}
