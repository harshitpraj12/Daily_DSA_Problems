package InternalWorking;

public class Hello implements Inter {
    @Override
    public void play(){
        System.out.println("We are playinig");
    }

    @Override
    public void dance(){
        System.out.println("We are dancing");
    }
    
    public void singing(){
        System.out.println("We are singing !");
    }

}
