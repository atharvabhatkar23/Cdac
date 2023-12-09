package pojos;



/* 
| id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(20) | YES  | UNI | NULL    |                |
| party | varchar(20) | YES  |     | NULL    |                |
| votes | int         | YES  |     | NULL    |                |

+-------+-------------+------+-----+---------+-------------

List all candidates
day1_lab
Table : candidates
POJO : Candidate
DBUtils : copy/ or write
DAO : CandidateDao i/f
List<Candidate> getAllCandidates() throws SE
CandidateDaoImpl
1. import : java.sql , import static : utils
2. state : cn , pst1
3. def ctor : openCn , pst1=cn.prepareStatement(sql);
4. clean up : close pst1, cn
5. getAllCandidates() : exec query --RST --while loop --ORM 


 */
public class Candidate {
	
	private int candidateId;
	private String name;
	private String party;
	private int votes;
	
	
	public Candidate() {
		
	}
	public Candidate(int candidateId, String name, String party, int votes) {
		this.candidateId=candidateId;
		this.name=name;
		this.party=party;
		this.votes=votes;
	}
	public int getCandidateId() {
		return candidateId;
	}


	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getParty() {
		return party;
	}


	
	public void setParty(String party) {
		this.party = party;
	}


	public int getVotes() {
		return votes;
	}


	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", name=" + name + ", party=" + party + ", votes=" + votes
				+ "]";
	}
	
	
	
}
