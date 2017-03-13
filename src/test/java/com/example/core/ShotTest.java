package com.example.core;

import com.opq.bb.elements.member.Player;
import com.opq.bb.factorys.GameFactory;
import com.opq.bb.factorys.ShotContextFactory;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.module.ShotContext;
import com.opq.bb.game.states.StateFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by opq.chen on 2017/3/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShotTest {
	private List<Player> createHomeTeam(){
		List<Player> list = new ArrayList<>();
		Player player = new Player();
		player.setName("opq");
		player.setId("000001");
		player.getBaseSkill().setFreeShot(800);
		list.add(player);
		return list;
	}

	private List<Player> createGuestTeam(){
		List<Player> list = new ArrayList<>();
		Player player = new Player();
		player.setName("qpo");
		player.setId("000002");
		list.add(player);
		return list;
	}

	@Test
	public void testFreeShot() {
		System.out.println("******** Test FreeShot ********");
		//general a player
		List<Player> homeTeam = createHomeTeam();

		GameContext context = GameFactory.createNewGame(homeTeam, new ArrayList<>());
		context.setSelectA(homeTeam);
		context.setBallControll(0);
		context.setOutputs(new ArrayList<>());

		context.setShotContext(ShotContextFactory.createFreeShotContext(2));
		context.setGameState(StateFactory.getFreeShotState());

		context.execute();

		System.out.println("***********************Test Result ******************************");
		System.out.println(context.getOutputs().size());
		for (String str : context.getOutputs()){
			System.out.println(str);
		}
	}
}
