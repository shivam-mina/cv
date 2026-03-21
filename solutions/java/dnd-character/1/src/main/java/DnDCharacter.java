import java.util.*;

class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
        hitpoints = 10 + modifier(constitution);
    }

    int getStrength() { return strength; }
    int getDexterity() { return dexterity; }
    int getConstitution() { return constitution; }
    int getIntelligence() { return intelligence; }
    int getWisdom() { return wisdom; }
    int getCharisma() { return charisma; }
    int getHitpoints() { return hitpoints; }

    int ability(List<Integer> scores){
        return findSum(scores);
    }

    List<Integer> rollDice() {
        Random rand = new Random();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            arr.add(rand.nextInt(6) + 1);
        }
        return arr;
    }

    int findSum(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (Integer x : arr) {
            sum += x;
            min = Math.min(min, x);
        }
        return sum - min;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

}