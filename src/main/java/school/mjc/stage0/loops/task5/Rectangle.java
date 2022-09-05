package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String symbol = "8";
        for (int i = 1; i<=height;i++){
            if(i==1 || i == height){
                System.out.println(symbol.repeat(length));
            }else{
                System.out.println(symbol+" ".repeat(length-2)+symbol);
            }
        }

    }
}
