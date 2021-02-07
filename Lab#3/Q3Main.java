
interface Duck{
    public abstract void swim();
    public abstract void speak(String sound);
     public void fly(boolean isFly);
}


class Jduck implements Duck{
    
    public void swim(){
        System.out.println("The Duck Swims");
    }
    public void speak(String sound){
        System.out.println("The Duck "+sound);
    }
    public void fly(boolean isFly){
        if(isFly) System.out.println("The Duck Flys");
        else System.out.println("The Duck Dosent fly");
    }
}

class AllDuck{
    void display(String sound,boolean isFly,Jduck jduck){
        jduck.fly(isFly);
        jduck.swim();
        jduck.speak(sound);
    }
    
}
public class Q3Main {
    public static void main(String args[]) {
    	Jduck rd = new Jduck();
		Jduck wd = new Jduck();
		Jduck rhd = new Jduck();
		Jduck ld = new Jduck();
		AllDuck allDuck = new AllDuck();
		  //void display(String sound,boolean isFly,Jduck jduck)
		allDuck.display("Squeaks",false,rd);
		allDuck.display("is Mute",false,wd);
		allDuck.display("Quack",true,rhd);
		allDuck.display("Quack",true,ld);
    }
}
