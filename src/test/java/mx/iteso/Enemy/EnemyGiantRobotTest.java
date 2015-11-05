package mx.iteso.Enemy;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Lily on 04/11/2015.
 */
public class EnemyGiantRobotTest {
    EnemyGiantRobotTest enemyGR;

    @Before
    public void setUp(){
        enemyGR= new EnemyGiantRobotTest();
    }
    @Test
    public void smashWithHandsTest(){
       assertEquals(enemyGR.smashWithHands(), "Enemy Robot Causes Damage With Its Hands");
    }

    @Test
    public void WalkForwardTest(){
        assertEquals(enemyGR.walkForward(), "Enemy Robot Walks Forward");
    }
    @Test
    public void ReactToHumanTest(){
        assertEquals(enemyGR.reactToHuman("Juan"), "Enemy Robot Tramps on Juan");
    }
}
