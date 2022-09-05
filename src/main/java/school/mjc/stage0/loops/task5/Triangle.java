package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String symbol = "8";
        String word = "";
        for(int i = 0; i <= cathetusLength+1;i++){
            word = "";
            if(i == 0 || i == cathetusLength + 1){
                word = "\"\"\"";
            }else{
                word = symbol.repeat(i);
            }
            System.out.println(word);
        }
    }
}
