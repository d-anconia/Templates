package danil.gorchakov.com;

/**
 * Created by danilgorchakov on 03.05.16.
 */
public class Delegate {
}


class A{
    void f(){
        System.out.println("f()");
    }
}

// class B delegetes to class A
class B{
    A a = new A();
    void f(){
        a.f();
    }
}

interface Graphics{
    void draw();
}

class Triangle implements Graphics{
    public void draw(){
        System.out.println("draw triangle");
    }
}

class Square implements Graphics{
    public void draw(){
        System.out.println("draw square");
    }
}

class Circle implements Graphics{
    public void draw(){
        System.out.println("draw circle");
    }
}

class Artist{

    Graphics graphics;
    void setGraphics(Graphics g){
        graphics = g;
    }
    void draw(){
        graphics.draw();
    }
}