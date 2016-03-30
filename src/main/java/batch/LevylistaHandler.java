package batch;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Levy;
import dao.LevyDAO;

public class LevylistaHandler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		LevyDAO dao = (LevyDAO)context.getBean("daoLuokka");		
		
		System.out.println("-------------------");
		System.out.println("Levy - Artisti");
		System.out.println("-------------------");
		List<Levy> levyt = dao.haeKaikki();
		for (Levy l : levyt) {
			System.out.println(l.getLevynimi()+" - "+l.getArtisti());	
		}
		
		context.close();

	}
}
