package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String symbol = "8";
        for(int i = 0; i <= cathetusLength+1;i++){
            System.out.println(symbol.repeat(i));
        }
    }
}
