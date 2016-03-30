package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import bean.Levy;

public class LevyRowMapper implements RowMapper<Levy> {
	
	public Levy mapRow(ResultSet rs, int rowNum) throws SQLException {
		Levy l = new Levy();
		l.setLevynimi(rs.getString("levynimi"));
		l.setArtisti(rs.getString("artisti"));
		l.setId(rs.getInt("id"));
		
		return l;
	}

}
