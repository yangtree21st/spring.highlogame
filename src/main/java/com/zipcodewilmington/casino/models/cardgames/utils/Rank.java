package com.zipcodewilmington.casino.models.cardgames.utils;

public enum Rank {
    ACE(1, 11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final Integer primaryValue;
    private final Integer secondaryValue;

    /**
     * This constructor is called by enumerations which only have a single value
     * @param primaryValue - the only value this Rank can resolve to
     */
    Rank(Integer primaryValue) {
        this(primaryValue, primaryValue);
    }

    /**
     * This constructor is called by enumerations which can have two values; i.e. - Ace
     * @param primaryValue - the primary value this Rank resolves to
     * @param secondaryValue - the secondary value this Rank resolves to
     */
    Rank(Integer primaryValue, Integer secondaryValue) {
        this.primaryValue = primaryValue;
        this.secondaryValue = secondaryValue;
    }

    public Integer getPrimaryValue() {
        return this.primaryValue;
    }

    public Integer getSecondaryValue() {
        return secondaryValue;
    }
}
