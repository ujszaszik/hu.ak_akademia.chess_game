*********************
* SIMPLE CHESS GAME *
* (/hu.ak_akademia) *
*********************

Created by András Markos
with the assistance of Adrián Tóth, Gábor Tóth, Károly Ujszászi
in the calendar year of 2018.



MENU package

MENU allows users to select from Menu Options:
	1. Create New Game
	2. Save a Game
	3. Load a Game
	4. Exit Game


GAME package

GAME allows users to play the Game of Chess:

Its engine initializes the board with the squares, the moves, and the pieces.
It is also responsible for storing the positions and other games for saving and loading.


GAME.PIECES package

PECES declares and initializes the Pieces of a Chess Game.

The King, and the Queen. The bishop, the Knight, and the Rook. And the eight Pawns.


DATABASE package

The DATABASE is responsible for storing game data, including:
Current game with positions, and move history
Previous saved games to load.
Historical game database.