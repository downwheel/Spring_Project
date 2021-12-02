package com.bbs.dao;

import org.springframework.stereotype.Repository;

import com.bbs.vo.Authmail;
import com.bbs.vo.Users;

@Repository
public interface UsersDAO {
	
	public String idCheck(String user_id) throws Exception;
	public void setAuthnum(Authmail authmail) throws Exception;
	public Integer getAuthnum(String user_mail) throws Exception;
	public void resetAuthnum(Authmail authmail) throws Exception;
	public void deleteAuthmail(String user_mail) throws Exception;
	public void join(Users users) throws Exception;
	public Users login(Users users) throws Exception;

}
