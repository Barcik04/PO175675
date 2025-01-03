package zad1;

import java.util.Arrays;

public class FootballPlayer implements Cloneable{
    private String name;
    private int[] goals;

    public FootballPlayer(String name, int[] goals) {
        this.name = name;
        this.goals = goals != null ? goals : new int[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGoals() {
        return goals;
    }

    public void setGoals(int[] goals) {
        this.goals = goals != null ? goals : new int[0];
    }

    public void changeValByIndex(int index, int value) {
        if (index < 0 || index >= goals.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        goals[index] = value;
    }

    @Override
    public FootballPlayer clone() throws CloneNotSupportedException {
        FootballPlayer clone = (FootballPlayer) super.clone();
        clone.goals = Arrays.copyOf(goals, goals.length);
        return clone;
    }

    @Override
    public String toString() {
        return "name: " + name + ", goals: " + Arrays.toString(goals);
    }
}
