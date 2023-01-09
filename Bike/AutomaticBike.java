package Bike;

public class AutomaticBike {
        private boolean on;
        private int speed;
        private int gear;

        public void turnOn() {
            on = true;
        }

        public void turnOff() {
            on = false;
        }

        public boolean isOn() {
            return on;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return speed;
        }

        public void setGear(int gear) {
            this.gear = gear;
        }

        public int getGear() {
            return gear;
        }

        public void accelerate() {
            if (!on) {
                return;
            }
            speed += gear;
            if (speed > 20 && gear == 1) {
                gear = 2;
            } else if (speed > 30 && gear == 2) {
                gear = 3;
            } else if (speed > 40 && gear == 3) {
                gear = 4;
            }
        }

        public void decelerate() {
            if (!on) {
                return;
            }
            speed -= gear;
            if (speed < 21 && gear == 2) {
                gear = 1;
            } else if (speed < 31 && gear == 3) {
                gear = 2;
            } else if (speed < 41 && gear == 4) {
                gear = 3;
            }
        }
    }

