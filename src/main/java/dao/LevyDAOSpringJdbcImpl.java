package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import bean.Levy;


public class LevyDAOSpringJdbcImpl implements LevyDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Levy> haeKaikki() {

		String sql = "select id, levynimi, artisti from levy";
		RowMapper<Levy> mapper = new LevyRowMapper();
		List<Levy> levyt = jdbcTemplate.query(sql, mapper);

		return levyt;
	}

}
