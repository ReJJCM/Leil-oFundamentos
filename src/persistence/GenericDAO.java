package persistence;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {

	public List<T> getAll() throws SQLException;

	public T getOne(int id) throws SQLException;

	public void update(T object) throws SQLException;

	public void delete(T object) throws SQLException;
	
	public void insert(T object) throws SQLException;
}