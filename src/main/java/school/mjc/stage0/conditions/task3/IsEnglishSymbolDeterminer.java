package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int charDec = symbol;
        if((charDec>=65 && charDec<=90)||(charDec>=97 && charDec<=122)){
            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}
