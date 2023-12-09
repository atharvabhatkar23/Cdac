package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import static utils.DBUtils.*;

import pojos.Candidate;
/*CandidateDaoImpl
1. import : java.sql , import static : utils
2. state : cn , pst1
3. def ctor : openCn , pst1=cn.prepareStatement(sql);
4. clean up : close pst1, cn
5. getAllCandidates() : exec query --RST --while loop --ORM */
public class CandidateDaoImpl implements CandidateDao{
	
	private Connection connection;
	private PreparedStatement pst1;
	public CandidateDaoImpl() throws SQLException {
		connection = openConnection();
		pst1 = connection.prepareStatement("Select * from candidates");
	}

	@Override
	public List<Candidate> getAllCandidates() throws SQLException {

		List<Candidate> candidates=new ArrayList<>();
		try(ResultSet rst=pst1.executeQuery())
		{
			while(rst.next())
				candidates.add(new Candidate(rst.getInt(1),rst.getString(2)
						,rst.getString(3),rst.getInt(4)));
		}
		return candidates;
//		return null;
	}
	
	public void cleanUp() throws SQLException {
		
		if(pst1!=null) {
			pst1.close();
		}
		
		connection.close();
		
		System.out.println("Cleanup up");
	}

}
/*
| id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(20) | YES  | UNI | NULL    |                |
| party | varchar(20) | YES  |     | NULL    |                |
| votes | int         | YES  |     | NULL    |                |

+-------+-------------+------+-----+---------+-------------
*/