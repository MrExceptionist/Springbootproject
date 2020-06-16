package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TeamDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DataSource dataSource;
	
	
	public void insert(TeamVO teamVO) {
		
		String insQuery = "insert into team (teamName, teamId) values ?,?";
		
		jdbcTemplate.update(insQuery,teamVO.getTeamName(),teamVO.getTeamName());
		
		
	}

}
