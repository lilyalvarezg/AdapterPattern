package mx.iteso.Enemy;

import mx.iteso.adapter.enemy.impl.EnemyTank;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Lily on 04/11/2015.
 */
public class EnemyTankTest{
    EnemyTank enemyT;
    @Before
    public void setUp(){
        enemyT= new EnemyTank();
    }

    @Test
    public void fireWeaponTest(){
        assertEquals(enemyT.fireWeapon(),"Enemy tank fires weapon");
    }
    @Test
    public void driveForwardTest(){
        assertEquals(enemyT.driveForward(), "Enemy Tank moves forward");
    }
    @Test
    public void assignDriverTest(){
        assertEquals(enemyT.assignDriver("Felipe"), "Felipe is driving the tank");
    }
}
