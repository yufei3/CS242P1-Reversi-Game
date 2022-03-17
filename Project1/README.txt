Group member: Jiayi He, Yufei Zhao

NetID: jhe36, yzhao87

Class: 2021_Spring_CSC_242

ReadMe File for Project1

Files:

     ReversiGame.java
     Algorithms.java
     Player.java
     Board.java

     ReverisiGame.java: contains the main method.Both 4x4, 6x6 and 8x8 board can be executed in the same class (ReversiGame.java).
     Board.java: contains the objects of the Reversi Board and moves(it contains the method which determine the valid moves)
     Algorithms.java: contains the methods we use to construct search algorithms and decision-making method (the method which find the optimal moves).
     Player.java: contains the AI and Human player methods including asking users to choose the side and the AI choosing process (this step use the search algorithms we write). ps: the alpha_beta algorithm method is also in this class.
     

How to run:

1.To execute the program in Eclipse, you can click run in ReversiGame.java
  To execute the program in terminal, you can enter:
  javac ReversiGame.java
  java ReversiGame
2.Enter 1~3 to choose to your game.
3.Enter 1~4 to choose opponent.
4.Enter x or o to choose the side you want to play.
5.Enter the move you want(For example: c4). While playing the game, you can see the board display and index for positions. 

Ps(very important, please read carefully):
1. The incorrect input format will cause error and users need to re-enter the input.
2. The submission form includes our group's information. The detailed descriptions and instruction of the project are included in the README.txt. Also, there are some important comments in the source code.
3. There are black points (.) displayed on the board in each step. These black points represent the valid moves, and users can only select next move among the positions indicated by the black points. Otherwise the warning "invalid move" will appear and users need to reselect the move.
4. To end the game, there are two possible situations. First, the board is completely full. Second, the board is not completely full but neither player make a legal move. We consider and discuss both situations in our source code. The game ends with neither player can make a legal move(including the board is completely full).
5. During the game, even though you may see that the board is already full or there is no legal moves at the end of some steps, either AI or human (depends on who is in the turn) still need to start another round to know that this is the end of the game.

PLEASE FOLLOW THE INSTRUCTION CAREFULLY

Sample Output1:
RainydeMacBook-Pro:src rainyzhao$ javac ReversiGame.java
RainydeMacBook-Pro:src rainyzhao$ java ReversiGame
Reversi by Yufei's Group
Choose your game:
1. Small 4x4 Reversi
2. Medium 6x6 Reversi
3. Standard 8x8 Reversi
Your choice?1
Choose your opponent:
1. An agent that plays randomly
2. An agent that uses MINIMAX
3. An agent that uses MINIMAX with alpha-beta pruning
4. An agent that uses H-MINIMAX with a fixed depth cutoff and a-b pruning
Your choice?1
Do you want to play DARK (x) or LIGHT (o)?
x

 a b c d 
1  .      1
2. O X    2
3  X O .  3
4    .    4
 a b c d 

Next to play:DARK
Your move : b1
x: b1
Elapsed time:2.541 secs
 a b c d 
1. X .    1
2  X X    2
3. X O    3
4         4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Invalid input.
Elapsed time:0.001 secs
x: f5
 a b c d 
1. X .    1
2  X X    2
3. X O    3
4         4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Invalid input.
Elapsed time:0.000 secs
x: f5
 a b c d 
1. X .    1
2  X X    2
3. X O    3
4         4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Elapsed time:0.000 secs
o: a1
 a b c d 
1O X      1
2. O X    2
3  X O .  3
4    .    4
 a b c d 

Next to play:DARK
Your move : a2
x: a2
Elapsed time:2.397 secs
 a b c d 
1O X .    1
2X X X    2
3. X O    3
4         4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Elapsed time:0.000 secs
o: c1
 a b c d 
1O O O .  1
2X X O .  2
3  X O .  3
4      .  4
 a b c d 

Next to play:DARK
Your move : d1
x: d1
Elapsed time:2.880 secs
 a b c d 
1O O O X  1
2X X X    2
3. X O .  3
4  .      4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Invalid input.
Elapsed time:0.000 secs
x: e6
 a b c d 
1O O O X  1
2X X X    2
3. X O .  3
4  .      4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Elapsed time:0.000 secs
o: a3
 a b c d 
1O O O X  1
2O O X    2
3O O O    3
4.   .    4
 a b c d 

Next to play:DARK
Your move : c4
x: c4
Elapsed time:3.626 secs
 a b c d 
1O O O X  1
2O O X .  2
3O O X .  3
4    X .  4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Invalid input.
Elapsed time:0.000 secs
x: e6
 a b c d 
1O O O X  1
2O O X .  2
3O O X .  3
4    X .  4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Elapsed time:0.000 secs
o: d3
 a b c d 
1O O O X  1
2O O O    2
3O O O O  3
4.   X    4
 a b c d 

Next to play:DARK
Your move : a4
x: a4
Elapsed time:3.546 secs
 a b c d 
1O O O X  1
2O O X .  2
3O X O O  3
4X . X    4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Elapsed time:0.000 secs
o: b4
 a b c d 
1O O O X  1
2O O X    2
3O O O O  3
4X O X    4
 a b c d 

Next to play:DARK
Your move : Elapsed time:0.000 secs
 a b c d 
1O O O X  1
2O X X .  2
3O O O O  3
4X O X .  4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Invalid input.
Elapsed time:0.000 secs
x: f5
 a b c d 
1O O O X  1
2O X X .  2
3O O O O  3
4X O X .  4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Elapsed time:0.000 secs
o: d2
 a b c d 
1O O O X  1
2O O O O  2
3O O O O  3
4X O X .  4
 a b c d 

Next to play:DARK
Your move : d4
x: d4
Elapsed time:4.331 secs
 a b c d 
1O O O X  1
2O O O X  2
3O O O X  3
4X O X X  4
 a b c d 

Next to play:LIGHT
I'm picking a move randomly...
Invalid input.
Elapsed time:0.000 secs
x: f5
 a b c d 
1O O O X  1
2O O O X  2
3O O O X  3
4X O X X  4
 a b c d 

Score player 1: 6, Score player 2: 10
Player 2 wins!

Sample Output2:
RainydeMacBook-Pro:Code rainyzhao$ javac ReversiGame.java
RainydeMacBook-Pro:Code rainyzhao$ java ReversiGame
Reversi by Yufei's Group
Choose your game:
1. Small 4x4 Reversi
2. Medium 6x6 Reversi
3. Standard 8x8 Reversi
Your choice?2
Choose your opponent:
1. An agent that plays randomly
2. An agent that uses MINIMAX
3. An agent that uses MINIMAX with alpha-beta pruning
4. An agent that uses H-MINIMAX with a fixed depth cutoff and a-b pruning
Your choice?2
Do you want to play DARK (x) or LIGHT (o)?
o

 a b c d e f 
1             1
2    .        2
3  . O X      3
4    X O .    4
5      .      5
6             6
 a b c d e f 

Next to play:DARK
AI move:b3
Elapsed time:0.618 secs
 a b c d e f 
1             1
2  .   .      2
3  X X X      3
4  . X O      4
5             5
6             6
 a b c d e f 

Next to play:LIGHT
Your move : b2
o: b2
Elapsed time:3.652 secs
 a b c d e f 
1  .          1
2  O .        2
3  X O X      3
4    X O .    4
5      .      5
6             6
 a b c d e f 

Next to play:DARK
AI move:e4
Elapsed time:0.440 secs
 a b c d e f 
1             1
2  O          2
3. X O X .    3
4  . X X X    4
5    .   .    5
6             6
 a b c d e f 

Next to play:LIGHT
Your move : a3
o: a3
Elapsed time:2.405 secs
 a b c d e f 
1.            1
2. O .        2
3O O O X      3
4    X X X    4
5             5
6             6
 a b c d e f 

Next to play:DARK
AI move:a1
Elapsed time:0.784 secs
 a b c d e f 
1X . .        1
2  X          2
3O O X X .    3
4    X X X    4
5      .      5
6             6
 a b c d e f 

Next to play:LIGHT
Your move : e3
o: e3
Elapsed time:6.655 secs
 a b c d e f 
1X            1
2. X . . . .  2
3O O O O O    3
4  . X X X    4
5             5
6             6
 a b c d e f 

Next to play:DARK
AI move:a2
Elapsed time:2.010 secs
 a b c d e f 
1X   .        1
2X X          2
3O X O O O    3
4    X X X    4
5  . . . . .  5
6             6
 a b c d e f 

Next to play:LIGHT
Your move : f5
o: f5
Elapsed time:8.709 secs
 a b c d e f 
1X            1
2X X . . . .  2
3O X O O O .  3
4.   X X O .  4
5          O  5
6             6
 a b c d e f 

Next to play:DARK
AI move:f3
Elapsed time:1.563 secs
 a b c d e f 
1X   .        1
2X X .   .    2
3O X X X X X  3
4  . X X O    4
5          O  5
6             6
 a b c d e f 

Next to play:LIGHT
Your move : b4
o: b4
Elapsed time:7.885 secs
 a b c d e f 
1X            1
2X X          2
3O X X X X X  3
4. O O O O    4
5. . . . . O  5
6             6
 a b c d e f 

Next to play:DARK
AI move:d5
Elapsed time:2.000 secs
 a b c d e f 
1X . .        1
2X X . .      2
3O X X X X X  3
4  O X X X .  4
5      X   O  5
6             6
 a b c d e f 

Next to play:LIGHT
Your move : b2
Invalid move.
o: b2
Elapsed time:4.131 secs
 a b c d e f 
1X . .        1
2X X . .      2
3O X X X X X  3
4  O X X X .  4
5      X   O  5
6             6
 a b c d e f 

Next to play:LIGHT
Your move : b1
o: b1
Elapsed time:6.348 secs
 a b c d e f 
1X O .        1
2X O .        2
3O O X X X X  3
4. O X X X    4
5.     X   O  5
6             6
 a b c d e f 

Next to play:DARK
AI move:a4
Elapsed time:1.381 secs
 a b c d e f 
1X O          1
2X O .        2
3X O X X X X  3
4X X X X X    4
5  .   X . O  5
6        .    6
 a b c d e f 

Next to play:LIGHT
Your move : e5
o: e5
Elapsed time:20.974 secs
 a b c d e f 
1X O .        1
2X O . .      2
3X O O X X X  3
4X X X O X    4
5    . X O O  5
6        . .  6
 a b c d e f 

Next to play:DARK
AI move:c1
Elapsed time:1.466 secs
 a b c d e f 
1X X X        1
2X X . . . .  2
3X O O X X X  3
4X X X O X .  4
5. . . X O O  5
6      . .    6
 a b c d e f 

Next to play:LIGHT
Your move : b5
o: b5
Elapsed time:9.687 secs
 a b c d e f 
1X X X        1
2X X .        2
3X O O X X X  3
4X O X O X    4
5  O . X O O  5
6. . .   . .  6
 a b c d e f 

Next to play:DARK
AI move:b6
Elapsed time:2.000 secs
 a b c d e f 
1X X X        1
2X X . . . .  2
3X X O X X X  3
4X X X O X .  4
5. X . X O O  5
6  X   .      6
 a b c d e f 

Next to play:LIGHT
Your move : c5
o: c5
Elapsed time:4.890 secs
 a b c d e f 
1X X X        1
2X X   .      2
3X X O X X X  3
4X X O O X    4
5  X O O O O  5
6  X . . . .  6
 a b c d e f 

Next to play:DARK
AI move:e6
Elapsed time:0.645 secs
 a b c d e f 
1X X X        1
2X X . .   .  2
3X X O X X X  3
4X X X O X .  4
5. X O X X O  5
6  X   . X .  6
 a b c d e f 

Next to play:LIGHT
Your move : d2
o: d2
Elapsed time:4.049 secs
 a b c d e f 
1X X X . .    1
2X X . O .    2
3X X O O X X  3
4X X X O X    4
5  X O X X O  5
6  X . . X    6
 a b c d e f 

Next to play:DARK
AI move:d1
Elapsed time:1.160 secs
 a b c d e f 
1X X X X .    1
2X X . X   .  2
3X X O X X X  3
4X X X X X    4
5. X O X X O  5
6  X     X .  6
 a b c d e f 

Next to play:LIGHT
Your move : c2
o: c2
Elapsed time:5.685 secs
 a b c d e f 
1X X X X      1
2X X O X .    2
3X X O O X X  3
4X X X X O .  4
5  X O X X O  5
6  X . . X    6
 a b c d e f 

Next to play:DARK
AI move:e2
Elapsed time:0.425 secs
 a b c d e f 
1X X X X .    1
2X X O X X .  2
3X X O X X X  3
4X X X X O    4
5. X O X X O  5
6  X .   X .  6
 a b c d e f 

Next to play:LIGHT
Your move : f2
o: f2
Elapsed time:5.455 secs
 a b c d e f 
1X X X X . .  1
2X X O O O O  2
3X X O X O X  3
4X X X O O .  4
5  X O X X O  5
6  X . . X    6
 a b c d e f 

Next to play:DARK
AI move:e1
Elapsed time:1.173 secs
 a b c d e f 
1X X X X X    1
2X X O X X O  2
3X X X X X X  3
4X X X O X .  4
5. X O X X O  5
6  X   . X .  6
 a b c d e f 

Next to play:LIGHT
Your move : a5
o: a5
Elapsed time:5.985 secs
 a b c d e f 
1X X X X X .  1
2X X O X X O  2
3X X X X X X  3
4X X X O X    4
5O O O X X O  5
6. X . . X    6
 a b c d e f 

Next to play:DARK
AI move:a6
Elapsed time:0.665 secs
 a b c d e f 
1X X X X X    1
2X X O X X O  2
3X X X X X X  3
4X X X O X .  4
5X X O X X O  5
6X X   . X .  6
 a b c d e f 

Next to play:LIGHT
Your move : d6
o: d6
Elapsed time:6.639 secs
 a b c d e f 
1X X X X X .  1
2X X O X X O  2
3X X X X X X  3
4X X X O X    4
5X X O O X O  5
6X X . O X    6
 a b c d e f 

Next to play:DARK
AI move:c6
Elapsed time:2.000 secs
 a b c d e f 
1X X X X X    1
2X X O X X O  2
3X X X X X X  3
4X X X O X .  4
5X X X X X O  5
6X X X X X .  6
 a b c d e f 

Next to play:LIGHT
Your move : f6
o: f6
Elapsed time:3.460 secs
 a b c d e f 
1X X X X X .  1
2X X O X X O  2
3X X X X X X  3
4X X X O X .  4
5X X X X O O  5
6X X X X X O  6
 a b c d e f 

Next to play:DARK
AI move:f1
Elapsed time:0.693 secs
 a b c d e f 
1X X X X X X  1
2X X O X X X  2
3X X X X X X  3
4X X X O X .  4
5X X X X O O  5
6X X X X X O  6
 a b c d e f 

Next to play:LIGHT
Your move : f4
o: f4
Elapsed time:5.623 secs
 a b c d e f 
1X X X X X X  1
2X X O X X X  2
3X X X X X X  3
4X X X O O O  4
5X X X X O O  5
6X X X X X O  6
 a b c d e f 

Next to play:DARK
Elapsed time:0.000 secs
 a b c d e f 
1X X X X X X  1
2X X O X X X  2
3X X X X X X  3
4X X X O O O  4
5X X X X O O  5
6X X X X X O  6
 a b c d e f 

Score player 1: 29, Score player 2: 7
Player 1 wins!
