package cn.cjq.bomb.util;

import cn.cjq.bomb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "User", path = "User")
public interface UserRepository extends MongoRepository<User, String>{
     User findByName(String Name);
}

