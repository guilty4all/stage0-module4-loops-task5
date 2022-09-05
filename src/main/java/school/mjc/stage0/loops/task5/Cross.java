package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String symbol = "8";
        String line = "";
        int crossPoint = (sideLength / 2) + 1;
        for (int i = 1; i <= sideLength; i++){
            line = "";
            if(sideLength%2 != 0 && i == crossPoint){
                for(int j = 1; j <= sideLength; j++){
                    line+=symbol;
                }
            }else{
                line = " ".repeat(sideLength/2) + symbol + " ".repeat(sideLength/2);
            }
            System.out.println(line);
        }

    }
}
