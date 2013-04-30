package net.srirangan.packt.maven.dao;

import java.util.List;

import javax.ejb.Local;

import net.srirangan.packt.maven.BlogEntry;
import net.srirangan.packt.maven.Comment;
import net.srirangan.packt.maven.dao.common.Dao;

@Local
public interface CommentDao extends Dao<Comment> {

	List<Comment> findComments(BlogEntry blogEntry);

}
