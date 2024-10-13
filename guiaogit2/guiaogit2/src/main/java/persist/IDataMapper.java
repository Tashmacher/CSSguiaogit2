package persist;

import java.util.Optional;

public interface IDataMapper<E> {
    Optional<E> find(int id); 
    void insert(E e);        
    E update(E e);           
    void delete(E e);       
}
