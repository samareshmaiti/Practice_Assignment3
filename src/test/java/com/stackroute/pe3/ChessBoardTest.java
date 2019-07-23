package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setUp() throws Exception {
        this.chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() {
        this.chessBoard = null;
    }

    @Test
    public void GivenInputShouldReturnExpectedResult() throws AssertionError {
        String expected[][] = {{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}};

        String[][] actual = chessBoard.display(7, 8);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenInputShouldReturnProperResult() throws AssertionError {
        String expected[][] = {{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}};

        String[][] actual = chessBoard.display(6, 8);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenInputShouldReturnErrorMessage() throws AssertionError {
        String expected[][] = {{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}};

        String[][] actual = chessBoard.display(7, 7);

        assertArrayEquals(expected, actual);
    }
}