package com.nhnacademy.card;

import lombok.Getter;

/**
 * @author : 이성준
 * @since : 1.0
 */

@Getter
public class NormalTrumpCard extends TrumpCard{

    private final String value;

    public NormalTrumpCard(Symbol symbol, Color color, String value) {
        super(symbol, color);
        this.value = value;
    }

    @Override
    public int compareTo(TrumpCard o) {
        int compareResult = super.compareTo(o);

        if (o instanceof NormalTrumpCard n){
            return compareResult == 0 ? this.value.compareTo(n.value) : compareResult;
        }

        return compareResult;
    }
}
