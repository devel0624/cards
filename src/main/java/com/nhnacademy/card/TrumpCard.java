package com.nhnacademy.card;


import java.util.Objects;
import lombok.Getter;

/**
 * @author : 이성준
 * @since : 1.0
 */

@Getter
public class TrumpCard implements Card, Comparable<TrumpCard> {

    private final Symbol symbol;
    private final Color color;

    public TrumpCard(Symbol symbol, Color color) {
        this.symbol = symbol;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrumpCard trumpCard = (TrumpCard) o;
        return symbol == trumpCard.symbol && color == trumpCard.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, color);
    }

    @Override
    public int compareTo(TrumpCard o) {
        return this.symbol.compareTo(o.symbol);
    }

    public enum Symbol {
        JOKER,
        SPADE,
        DIAMOND,
        HEART,
        CLUB;
    }

    public enum Color {
        COLOR,
        MONO;
    }

    @Override
    public String toString() {
        return "TrumpCard{" +
                "symbol=" + symbol +
                ", color=" + color +
                '}';
    }
}
