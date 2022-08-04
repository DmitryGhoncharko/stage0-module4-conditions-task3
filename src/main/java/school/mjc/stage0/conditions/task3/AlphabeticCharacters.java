package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        //A, E, I, O, U, Y
        int charDec = character;
        if(!((charDec>=65 && charDec<=90)||(charDec>=97 && charDec<=122))){
            System.out.println("wrong alphabet!");
            return;
        }
        if(String.valueOf(character).equalsIgnoreCase("A") || String.valueOf(character).equalsIgnoreCase("E") ||
        String.valueOf(character).equalsIgnoreCase("I") || String.valueOf(character).equalsIgnoreCase("O") ||
        String.valueOf(character).equalsIgnoreCase("U") || String.valueOf(character).equalsIgnoreCase("Y")){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}
