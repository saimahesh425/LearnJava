public class InterfaceExaample {
    
    public static void main(String args[]){
        Computer lap = new laptop();
        Computer desk = new Desktop();
        developer dev = new developer();
        dev.webapp(desk);

    }
}

interface Computer{
    public void code();
}

class laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run on laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run on Desktop");
    }
}

class developer{
    public void webapp(Computer desk){
        desk.code();
    }
}