package com.packtpublishing.tddjava.ch05connect4;

import java.util.Arrays;

/**
 * Code-first implementation
 */
public class Connect4 {
    public enum Color {
        RED('R'), GREEN('G'), EMPTY('E');

        private final char value;

        Color(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    private Color winner;

    public static final int COLUMNS = 7;

    public static final int ROWS = 6;

    private Color[][] board = new Color[COLUMNS][ROWS];

    public Connect4() {
        for (Color[] column : board) {
            Arrays.fill(column, Color.EMPTY);
        }
    }

    public void putDisc(Color colorPlayed, int column) {
        if (column > 0 && column <= COLUMNS) {
            int numOfDiscs = board[column - 1].length;
            if (numOfDiscs < ROWS) {
                board[column -1][numOfDiscs] = colorPlayed;
                checkWincondition();
            } else {
                // TODO fail
            }
        } else {
            // TODO fail
        }
    }

    private void checkWincondition() {
        // Diagonal checks
        // Horizontal check
        // Vertical check
    }

    public boolean isFinished() {
        int numOfDiscs = 0;
        for (int col = 0; col < COLUMNS; ++col) {
            numOfDiscs += board[col].length;
        }
        return winner == null && numOfDiscs < COLUMNS * ROWS;
    }
}
