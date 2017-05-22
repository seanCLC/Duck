package test;

import model.Duck;
import model.FlyNoWay;
import model.RubberDuck;

public class DuckTest {
	public static void main(String[] args) {
		Duck mallard = new RubberDuck();
		mallard.setﬂyBehavior(new FlyNoWay());
		mallard.performFly();
	}
}
