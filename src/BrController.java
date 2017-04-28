interface  Bird {
             void move();
                        
            
            
}
 
class Penguin implements  Bird{
            public void move(){
                        System.out.println("The PENGUIN is swiming.");
            }
}
 
class Goose implements Bird{
            public void move(){
                        System.out.println("The GOOSE is flying.");
            }
}


class Ostrich implements Bird{
	public void move(){
		System.out.println("The OSTRICH is running.");
	}
	
	
}
 
public class BrController{
            Bird[] birds = new Bird[5];
            BrController(){
                        birds[0] = createBird();
                        birds[1] = createBird();
                        birds[2] = createBird();
                        birds[3] = createBird();
                        birds[4] = createBird();
            }
            public void relocateBirds(){
                        for(int i=0;i<birds.length;i++)
                                    birds[i].move();
            }
 
            private Bird createBird(){
                        int i = (int)(Math.random()*10);
                        if(i<5)
                                    return new Penguin();
                        else if (i<8)
                                    return new Goose();
                        else
                        	 		return new Ostrich();
            }
 
            public static void main(String [] args){
                        BrController bc = new BrController();
                        bc.relocateBirds();
            }          
}
