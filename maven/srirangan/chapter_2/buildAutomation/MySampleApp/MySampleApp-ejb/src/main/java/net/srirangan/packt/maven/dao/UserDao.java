package net.srirangan.packt.maven.dao;

import javax.ejb.Local;

import net.srirangan.packt.maven.User;
import net.srirangan.packt.maven.dao.common.Dao;

@Local
public interface UserDao extends Dao<User> {

	User findByUsername(String username);

}
