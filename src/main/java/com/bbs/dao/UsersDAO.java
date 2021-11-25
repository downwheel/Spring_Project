package com.bbs.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UsersDAO {
	
	public int idCheck(String user_id) throws Exception;

}
