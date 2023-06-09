package org.example;

/**
 * Class describing murderer
 */
public class Murderer extends Citizen{
    /**
     * Constructor used when we have to set specific coordinates
     * @param x position x
     * @param y position y
     * @param money amount of money to set
     */
    public Murderer(int x, int y, int money){
        super(x, y, money);
    }
    /**
     * Constructor used when we don't have to set specific coordinates
     * @param money amount of money to set
     */
    public Murderer(int money){
        super(money);
    }

    /**
     * return character representing murderer on board
     */
    @Override
    public char getSymbol() {
        return 'M';
    }

}
