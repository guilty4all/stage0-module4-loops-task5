package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String symbol = "8";
        int space = cathetusLength;
        for(int i = 1; i <= cathetusLength;i++){
            String word = symbol.repeat(i)+" ".repeat(--space);
            System.out.println(word);
        }

    }
}
