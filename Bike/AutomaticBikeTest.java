package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {
        AutomaticBike bike = new AutomaticBike();

        @Test
        public void testTurnOn() {
            bike.turnOn();
            assertTrue(bike.isOn());
        }

        @Test
        public void testTurnOff() {
            bike.turnOff();
            assertFalse(bike.isOn());
        }

        @Test
        public void testAccelerate() {
            bike.turnOn();
            bike.setSpeed(15);
            bike.setGear(1);
            bike.accelerate();
            assertEquals(16, bike.getSpeed());

            bike.setSpeed(24);
            bike.setGear(2);
            bike.accelerate();
            assertEquals(26, bike.getSpeed());

            bike.setSpeed(35);
            bike.setGear(3);
            bike.accelerate();
            assertEquals(38, bike.getSpeed());

            bike.setSpeed(44);
            bike.setGear(4);
            bike.accelerate();
            assertEquals(48, bike.getSpeed());
        }

        @Test
        public void testDecelerate() {
            bike.turnOn();
            bike.setSpeed(15);
            bike.setGear(1);
            bike.decelerate();
            assertEquals(14, bike.getSpeed());

            bike.setSpeed(24);
            bike.setGear(2);
            bike.decelerate();
            assertEquals(22, bike.getSpeed());

            bike.setSpeed(35);
            bike.setGear(3);
            bike.decelerate();
            assertEquals(32, bike.getSpeed());

            bike.setSpeed(44);
            bike.setGear(4);
            bike.decelerate();
            assertEquals(40, bike.getSpeed());
        }

        @Test
        public void testGearChange() {
            bike.turnOn();
            bike.setSpeed(19);
            bike.setGear(1);
            assertEquals(1, bike.getGear());
            bike.accelerate();
            assertEquals(1, bike.getGear());

            bike.setSpeed(30);
            bike.setGear(2);
            assertEquals(2, bike.getGear());
            bike.accelerate();
            assertEquals(3, bike.getGear());

            bike.setSpeed(40);
            bike.setGear(3);
            assertEquals(3, bike.getGear());
            bike.accelerate();
            assertEquals(4, bike.getGear());

        }
    }

