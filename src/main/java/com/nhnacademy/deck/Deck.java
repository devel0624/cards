package com.nhnacademy.deck;

import com.nhnacademy.card.Card;
import java.util.Collection;
import java.util.List;

/**
 * @author : 이성준
 * @since : 1.0
 */


public interface Deck<T extends Card> {

    void addCard(T card);
    T removeCard();

    Collection<T> drawCard(int amount);
    void shuffleCards();
}
