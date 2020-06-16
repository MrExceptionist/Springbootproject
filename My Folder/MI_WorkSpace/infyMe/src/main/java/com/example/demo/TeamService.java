package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamService {
	
	@Autowired
	private TeamDao teamDao;
	
	// call insert function to insert team information
	public void insertCallDao() {
		TeamVO t = new TeamVO();
		t.setTeamId(01);
		t.setTeamName("India");
		teamDao.insert(t);
	}

}
