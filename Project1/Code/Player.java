import java.util.*;

public class Player {
    static int max_depth=9999;
    private boolean human;
    private Scanner scn;
    Board board;
    private Algorithms alg;
    private double timeLimit;
    private final int sizeX = 8, sizeY = 8;
    boolean type1=false,alg_type=false;
    public void set_MINIMAX_type(boolean type){
        alg_type=type;
    }

    public void set_type1(boolean type){
        type1=type;
    }

    public void set_max_depth(int max_depth){
        this.max_depth=max_depth;
    }

    public Player(String type, Board board, double timeLimit) {
        scn = new Scanner(System.in);
        this.board = board;
        this.timeLimit = timeLimit;

        if (type.equals("A")) human = false;
        else human = true;
    }

    public void turn() {
        if (human) Hturn();
        else{
            if(type1==true)AIfun1();
            else {
                if(alg_type==false)
                    AIturn();
                else{
                    alpha_beta();
                }
            }
        }
    }

    private void alpha_beta(){
        double t1=System.currentTimeMillis();
        System.out.println("Next to play:"+(board.getCurrPlayer()==1?"DARK":"LIGHT"));
        double endTime = System.currentTimeMillis() + timeLimit;
        int depth = 1;
        int[] oldOpt = null;
        while (System.currentTimeMillis() < endTime-(Math.random()*timeLimit)) {

            int max = Integer.MIN_VALUE;
            int index = 0;

            if(depth>max_depth)break;
            alg = new Algorithms(endTime);
            int[] opt = alg.findOpt(board, depth);
            if (alg.finished()) {
                oldOpt = opt;
            }
            if (alg.fullTree) break;
            depth++;
        }
//		board.move(oldOpt[0], oldOpt[1]);
        if(board.getNbrValidMoves()==0)
            board.move_1(oldOpt[0], oldOpt[1]);
        else {
            board.move(oldOpt[0], oldOpt[1]);
            System.out.println("AI move:"+((char)(oldOpt[0]+'a'))+(oldOpt[1]+1));
        }
        System.out.println(String.format("Elapsed time:%.3f secs",( System.currentTimeMillis()-t1)/1000));
    }

    private void Hturn() {
        double t1=System.currentTimeMillis();
        String validMove = "No valid move avaible";
        int[][] grid = board.getBoard();
        foundValidMove:
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                if (grid[i][j] == 0) {
                    validMove = intToString(i) + (j+1);
                    break foundValidMove;
                }
            }
        }
        char type = 'x';
        if (board.getCurrPlayer() == 2) type = 'o';
        System.out.println("Next to play:"+(board.getCurrPlayer()==1?"DARK":"LIGHT"));
        System.out.print("Your move : ");
        board.getCurrPlayer();
//		System.out.println("Player " + board.getCurrPlayer() + " (" + type + ") turn. Enter position (ex: " + validMove + ").");
        if(board.getNbrValidMoves()==0)
            board.move_1(1, 1);
        else {
            String str = scn.nextLine();
            if (str.length() != 2)
                System.out.println("Invalid input.");
            else {
                int x = charToInt(str.charAt(0));
                int y = charToInt(str.charAt(1));

                board.move(x,y);
                System.out.println(type+": "+((char)(x+'a'))+(y+1));
            }
        }

        System.out.println(String.format("Elapsed time:%.3f secs", (System.currentTimeMillis()-t1)/1000));
    }
    //type1
    private void AIfun1(){
        double t1=System.currentTimeMillis();
        System.out.println("Next to play:"+(board.getCurrPlayer()==1?"DARK":"LIGHT"));
        System.out.println("I'm picking a move randomly...");
        double endTime = System.currentTimeMillis() + timeLimit;
//		int depth = 1;
//		int[] oldOpt = null;
//		while (System.currentTimeMillis() < endTime) {
//			if(depth>max_depth)break;
//			alg = new Minimax(endTime);
//			int[] opt = alg.findOpt(board, depth);
//			if (alg.finished()) {
//				oldOpt = opt;
//			}
//			if (alg.fullTree) break;
//			depth++;
//		}
        boolean flag=false;
        int x=0,y=0;
        while(flag==false){
            x=(int)(Math.random()*sizeX);
            y=(int)(Math.random()*sizeY);
            if(board.board[x][y]==0)flag=true;
//			int step[][]= {{-1,0},{1,0},{0,-1},{0,1}};
//			if(board.board[x][y]==-1)
//			{
//				for(int i=0;i<4;i++)
//				{
//					int xx=x+step[i][0];
//					int yy=y+step[i][1];
//					if(xx>=0&&xx<sizeX&&yy>=0&&yy<sizeY&&board.board[xx][yy]==0)
//					{
//						flag=true;
//					}
//				}
//			}
        }
        board.move(x, y);
        System.out.println(String.format("Elapsed time:%.3f secs", (System.currentTimeMillis()-t1)/1000));
        char type='x';
        if (board.getCurrPlayer()==1){
            type='o';
        }
        System.out.println(type+": "+(char)(x+'a')+(y+1));
    }

    private void AIturn() {
        double t1=System.currentTimeMillis();
        System.out.println("Next to play:"+(board.getCurrPlayer()==1?"DARK":"LIGHT"));
        double endTime = System.currentTimeMillis() + timeLimit;
        int depth = 1;
        int[] oldOpt = null;
//		while (System.currentTimeMillis() < endTime)
        while (System.currentTimeMillis() < endTime-(Math.random()*timeLimit)){
            if(depth>max_depth)break;
            alg = new Algorithms(endTime);
            int[] opt = alg.findOpt(board, depth);
            if (alg.finished()) {
                oldOpt = opt;
            }
            if (alg.fullTree) break;
            depth++;
        }
        if(board.getNbrValidMoves()==0)
            board.move_1(oldOpt[0], oldOpt[1]);
        else {
            board.move(oldOpt[0], oldOpt[1]);
            System.out.println("AI move:"+((char)(oldOpt[0]+'a'))+(oldOpt[1]+1));
        }

        System.out.println(String.format("Elapsed time:%.3f secs", (System.currentTimeMillis()-t1)/1000));
    }

    private int charToInt(char ch) {
        ch = Character.toLowerCase(ch);
        if(ch>='1'&&ch<='8')return ch-'1';
        if(ch>='a'&&ch<='h')return ch-'a';
        return -1;
    }

    private String intToString(int nbr) {
        switch (nbr) {
            case 0:	return "a";
            case 1:	return "b";
            case 2:	return "c";
            case 3:	return "d";
            case 4:	return "e";
            case 5:	return "f";
            case 6:	return "g";
            case 7:	return "h";
            default:	return null;
        }
    }

    private char intToChar(int nbr) {
        return 'a';
    }

}
