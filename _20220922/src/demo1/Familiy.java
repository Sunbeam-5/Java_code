package demo1;

public class Familiy {
    TV homeTV;
    void buyTV(TV tv){
        homeTV = tv;
    }
    void  remoteControl(int m){
        homeTV.setChannel(m);
    }
    void seeTV(){
        homeTV.showProgram();
    }
}
