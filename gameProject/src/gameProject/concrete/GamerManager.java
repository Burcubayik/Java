package gameProject.concrete;

import gameProject.abstracts.GamerService;
import gameProject.entities.Gamer;

public class GamerManager implements GamerService {
	

	Gamer gamer;

	@Override
	public void add(Gamer gamer) {
		System.out.println("kullan�c� eklendi :"+ gamer.getFirstName());
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("kullan�c� g�ncellendi :"+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("kullan�c� silindi :"+ gamer.getFirstName());
	}
	
	

	

}
