package tester;

import java.util.List;
import java.util.Scanner;

import dao.CandidateDaoImpl;
import pojos.Candidate;

public class TestLayeredApp2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create dao instance
			CandidateDaoImpl dao = new CandidateDaoImpl();
			System.out.println("------------");
			//tester  --> Dao's method
			List<Candidate> candidates = dao.getAllCandidates();
			System.out.println("All candidates : ");
			candidates.forEach(System.out::println);
			//clean up
			dao.cleanUp();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
