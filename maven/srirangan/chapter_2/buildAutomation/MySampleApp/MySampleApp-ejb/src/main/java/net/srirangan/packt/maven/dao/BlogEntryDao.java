package net.srirangan.packt.maven.dao;

import java.util.List;

import javax.ejb.Local;

import net.srirangan.packt.maven.BlogEntry;
import net.srirangan.packt.maven.dao.common.Dao;

@Local
public interface BlogEntryDao extends Dao<BlogEntry> {

	List<BlogEntry> find(int maxresults, int firstresult);

	Long count();

}
