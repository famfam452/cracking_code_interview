package 7.object_oriented_design.deck_of_cards.java;

public enum Suit {
    Club(0), Diamon(1), Heart(2), Spade(3);
    private int value;
    private Suit(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }
    
    public static Suit getSuitFromValue(int value) {
        return switch (value) {
            case 0 -> Club;
            case 1 -> Diamon;
            case 2 -> Heart;
            case 3 -> Spade;
            default -> throw new RuntimeException();
        };
    }
}