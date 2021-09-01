package be.intecbrussel.ExceptionDemo;

public class ExceptionDemo {

    public void luc() throws Exception{
        otila();
    }

    public void otila() throws Exception {
        mick();
    }
    public void mick() throws Exception{
        yilmaz();
    }
    public void yilmaz() throws Exception {
        throw new Exception("Seungho couldn't print");
    }

}


