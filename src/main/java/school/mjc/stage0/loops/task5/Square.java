package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String symbol = "8";
        String wrd = "";
        for (int i = 1; i <=sideLength;i++){
            wrd = "";
            for (int j = 1; j<=sideLength;j++){
                if(i == 1 || i == sideLength ){
                    wrd+= symbol;
                } else {
                    if ((i>1 && i < sideLength )&& (j >1 && j < sideLength)){
                        wrd+=" ";
                    }else{
                        wrd+=symbol;
                    }
                }
            }
            System.out.println(wrd);
        }

    }
}
