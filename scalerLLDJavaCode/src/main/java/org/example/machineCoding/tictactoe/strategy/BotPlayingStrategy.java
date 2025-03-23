package org.example.machineCoding.tictactoe.strategy;

import org.example.machineCoding.tictactoe.entities.Board;
import org.example.machineCoding.tictactoe.entities.Cell;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
