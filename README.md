# Battleship Game

This is a console-based implementation of the Battleship game in Java. The game allows two players to place their ships on a 5x5 grid and take turns attacking each other's ships. The objective is to sink all of the opponent's ships before they sink yours.

## How to Play

1. Run the `Battleship` class to start the game.
2. Player 1 will be prompted to enter the coordinates for their ships. The coordinates should be in the range of 0 to 4 (inclusive).
3. Player 2 will then enter the coordinates for their ships.
4. The game will display the initial state of the game boards, with each player's ships represented by '@' and empty spaces represented by '-'.
5. Players will take turns entering coordinates to attack the opponent's ships.
6. If a player's attack hits an opponent's ship, the hit location will be marked with 'X' on the opponent's game board.
7. If a player's attack misses, the missed location will be marked with 'O' on the opponent's game board.
8. The game continues until one player sinks all of the opponent's ships.
9. The final game boards will be displayed, showing the positions of the ships and the outcomes of the attacks.

## Game Rules

- Each player has to place 5 ships on the grid.
- Ships cannot be placed outside the grid (0 to 4 range for both rows and columns).
- Players cannot place ships on the same coordinates as their own or opponent's ships.
- Players take turns attacking each other's ships by entering coordinates.
- A hit is marked with 'X' and a miss is marked with 'O' on the opponent's game board.
- The game ends when one player sinks all of the opponent's ships.

## Implementation Details

The game uses a 5x5 grid represented by a two-dimensional character array. The `printBattleShip` method is responsible for displaying the game boards. The `mainAlgorithm` method contains the main game loop, where players take turns attacking and checking for win conditions. The game logic includes input validation to ensure the coordinates entered by the players are valid and do not overlap with existing ships.

## Usage

To play the Battleship game, follow these steps:

1. Copy the code into a Java IDE or text editor.
2. Compile the code and run the `Battleship` class.
3. Follow the prompts to enter ship coordinates for both players.
4. Take turns attacking the opponent's ships by entering coordinates.
5. The game will continue until one player wins.
6. The final game boards will be displayed.
