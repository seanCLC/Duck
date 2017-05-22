package model;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior ﬂyBehavior;

	public void swim(){
		System.out.println("会游泳");
	};
	public void display(){
		System.out.println("Duck display");
	};
	public void performQuack() {
      quackBehavior.quack();
   }
   public void performFly() {
	   ﬂyBehavior.fly();
   }
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public FlyBehavior getﬂyBehavior() {
		return ﬂyBehavior;
	}
	public void setﬂyBehavior(FlyBehavior ﬂyBehavior) {
		this.ﬂyBehavior = ﬂyBehavior;
	}
   
   
}
