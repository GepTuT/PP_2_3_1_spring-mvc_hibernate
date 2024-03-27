package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public void changeUser(User user, Long id) {
        User userToChange = entityManager.find(User.class,id);
        if (userToChange != null){
            userToChange.setFirstName(user.getFirstName());
            userToChange.setLastName(user.getLastName());
            userToChange.setEmail(user.getEmail());
            entityManager.merge(userToChange);
        }
    }

    @Override
    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> getUsersList() {
        return entityManager.createQuery("from User").getResultList();
    }
}
