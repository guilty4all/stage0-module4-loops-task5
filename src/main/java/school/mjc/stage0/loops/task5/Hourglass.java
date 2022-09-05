package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        String symbol = "8";
        int count = height;
        int space = 0;
        if (height%2 == 0){
            for(int i = 1;i<=height;i++){

                if(i == 1 || i == height){
                    System.out.println(symbol.repeat(height));
                } else if (i > 1 && i < height/2) {
                    count -= 2;
                    ++space;
                    System.out.println(" ".repeat(space)+ symbol.repeat(count));

                } else if (i==height/2) {
                    count -= 2;
                    ++space;
                    System.out.println(" ".repeat(space)+ symbol.repeat(count));
                    System.out.println(" ".repeat(space)+ symbol.repeat(count));
                    i++;
                } else{
                    count+=2;
                    --space;
                    System.out.println(" ".repeat(space)+ symbol.repeat(count));
                }

            }
        }else if(height%2 != 0){
            for(int i = 1;i<=height;i++){

                if(i == 1 || i == height){
                    System.out.println(symbol.repeat(height));
                } else if (i > 1 && i <= height/2) {
                    count -= 2;
                    ++space;
                    System.out.println(" ".repeat(space)+ symbol.repeat(count));

                } else if (i == (height/2)+1) {
                    count -= 2;
                    ++space;
                    System.out.println(" ".repeat(space)+ symbol.repeat(count));
                } else{
                    count+=2;
                    --space;
                    System.out.println(" ".repeat(space)+ symbol.repeat(count));
                }

            }
        }else{
            System.out.println("");
        }

    }
}
