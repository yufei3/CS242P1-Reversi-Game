import java.util.*;

public class ReversiGame {

    static int mapsize;

    public static void main(String args[]) {
        // Set up game
        Scanner s=new Scanner(System.in);
        Board gb = new Board();
        ////////////////////////////////////////////////////////
        int op1,op2,op3;

        while(true){
            System.out.println("Reversi by Yufei's Group");
            System.out.println("Choose your game:");
            System.out.println("1. Small 4x4 Reversi");
            System.out.println("2. Medium 6x6 Reversi");
            System.out.println("3. Standard 8x8 Reversi");
            System.out.print("Your choice?");
            op1=s.nextInt();
            if(op1==1){
                mapsize=4;
//				map=new int[4][4];
                gb.setSize(4, 4);
                break;
            }

            else if(op1==2){
                mapsize=6;
//				map=new int[6][6];
                gb.setSize(6, 6);
                break;
            }

            else if(op1==3) {
                mapsize=8;
                gb.setSize(8, 8);
//				map=new int[8][8];
                break;
            }
            else {
                System.out.println("Please enter again");
            }
        }

        Scanner scn = new Scanner(System.in);
        double timeLimit = 0;

        boolean acc = false;
        while (!acc) {
//			System.out.println("Enter a time limit (Seconds)");
            String str;
//			= scn.nextLine();
            str="2";
            try {
                timeLimit = Double.parseDouble(str);
                acc = true;
            } catch (Exception E) {
                System.out.println("invalid input.");
            }
        }
        //convert to nano
        timeLimit = timeLimit*Math.pow(10,3);
        int max_depth=999;
        boolean type1=false,alg_type=false;
        Player p1,p2;
        while(true)
        {
            System.out.println("Choose your opponent:");
            System.out.println("1. An agent that plays randomly");
            System.out.println("2. An agent that uses MINIMAX");
            System.out.println("3. An agent that uses MINIMAX with alpha-beta pruning");
            System.out.print("4. An agent that uses H-MINIMAX with a fixed depth cutoff and a-b pruning\r\n" +
                    "Your choice?");

            op2=s.nextInt();
            if(op2==1){
                type1=true;
//				fun1();
                break;
            }

            else if(op2==2){
                alg_type=false;
                break;
            }

            else if(op2==3){
                alg_type=true;
                break;
            }

            else if(op2==4){
                max_depth=20;
                break;
            }

            else {
                System.out.println("please enter again");
            }
        }
        System.out.println("Do you want to play DARK (x) or LIGHT (o)?");
        String c;
        while(true){
            c=s.next();

            if(c.equals("x")){
                p1 = new Player("H",gb,timeLimit);
                p2 = new Player("A",gb,timeLimit);
                break;
            }
            else if(c.equals("o")){
                p1 = new Player("A",gb,timeLimit);
                p2 = new Player("H",gb,timeLimit);
                break;
            }
            else{
                System.out.println("please enter again");
            }
        }
        p1.set_max_depth(max_depth);
        p2.set_max_depth(max_depth);
        p1.set_type1(type1);
        p2.set_type1(type1);
        p1.set_MINIMAX_type(alg_type);
        p2.set_MINIMAX_type(alg_type);
        System.out.println();
//		Player p2 = new Player(str,gb,timeLimit);


        // Start the game
        gb.printBoard();
        int count=0;
        while (true) {
//			System.out.println("getBbrV:"+gb.getNbrValidMoves()+" "+gb.getCurrPlayer());
//
            if(gb.getNbrValidMoves()==0){
                count++;
                if(count==2)break;
//				if (gb.getCurrPlayer() == 1)gb.setCurrPlayer(2);
//				else gb.setCurrPlayer(1);
//				gb.printBoard();
//				gb.findValidMoves();
//				p1.board.findValidMoves();
//				p2.board.findValidMoves();
//				System.out.println("vse===0getBbrV:"+gb.getNbrValidMoves()+" "+gb.getCurrPlayer());

//				continue;

            }
            else count=0;

            if (gb.getCurrPlayer() == 1) {
//				System.out.println("p1 turn");
                p1.turn();
            }
            else if (gb.getCurrPlayer() == 2) {
//				System.out.println("p2 turn");
                p2.turn();
            }
            else {
                System.out.println("Error: Player " + gb.getCurrPlayer() + " can't exist.");
                System.out.println("Exiting program.");
                break;
            }
            gb.printBoard();
        }

        System.out.println("Score player 1: " + gb.getScore(1) + ", Score player 2: " + gb.getScore(2));
        if (gb.getScore(1) > gb.getScore(2)) {
            System.out.println("Player 1 wins!");
        } else if (gb.getScore(2) > gb.getScore(1)) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Draw!");
        }
    }

}
