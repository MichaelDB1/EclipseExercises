package mikesFirstSudoku;

public class Sodoku {   
	static int userGrid[][]=new int[][]
	           {{0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0}};//[horizontal][vertical]
    static int grid[][]=new int[9][9];//the grid that the program experiments on
	     
	        // ONLY NOWS ABOUT IT IN MAIN PROCEDURE until outside of the Main In the Class	        
	        //String pgrid[][]=new String[9][9];//the posibilities grid

	        
	        
    
	public static void main(String[] args) {
       
		
		//This sets the grid to the array grid outside of the Main which is user grid.
		for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                grid[i][j]=userGrid[i][j];
            }
        }
        
        //prints the first Grid
        print(grid);
        double timeStart=System.currentTimeMillis();
        
        //prints the secound grid with the loop solver
		print(loop(0, 0, grid));
		
		//Recrods the time for the time start to solve the loop on grid
		double timeEnd=System.currentTimeMillis();
		System.out.println("That took "+(timeEnd-timeStart)+" milisecs to complete.");
    }
	
	
	
	
	
	
	
	
	public static int[][] loop(int y, int x, int[][] grid){
		
		//Maybe Add to ints to land into the grid that iterate from 8 to 0 in a for 
		//   Make an is Board completed method that you can then chuck into this while loop???
		while(!validity(8, 8, grid) || grid[8][8]==0)//while this is not solved        
		{
			
			if (userGrid[y][x] !=0){
				int yy, xx;
				if (x==8) {yy=y+1; xx=0;} else {yy=y; xx=x+1;}
				loop(yy, xx, grid);	
			} else {
				if (grid[y][x]<9) {
					grid[y][x]++;
					if (validity (y, x, grid)) {
						int yy, xx;
						if (x==8) {yy=y+1; xx=0;} else {yy=y; xx=x+1;}
						loop(yy, xx, grid);	
					}
				}else 
					{grid[y][x]=0; break;}
			}	
		}
		return grid;
	}
	
	
	
	
	
	
	///Checks the Grid is all Valid    Would be good logic for another class
	public static boolean validity(int x, int y, int[][] grid) {
		String temp="";
		for (int i=0;i<9;i++) {
			temp+=Integer.toString (grid[i][y]);//Checks the horizontal 
			temp+=Integer.toString (grid[x][i]);//Checks the vertical
			temp+=Integer.toString (grid[(x/3)*3+i/3][(y/3)*3+i%3]); // Check the Square  -- I think?
		}
		
		int count=0, idx=0;
		while ((idx=temp.indexOf(Integer.toString(grid[x][y]), idx))!=-1)
		{idx++; count++;}
		return count==3;
/*		return temp.length()-temp.replace(Integer.toString(grid[x][y]), "").length()==3; */
		
	}
	
	
	
	
	
	//This method is what prints everything out to the Console 
	//(Would use something like this for the view)))
    public static void print(int[][] grid) {
    	


        System.out.println("___________________");
        
        for (int i=0;i<9;i++) {
        	System.out.print("|");
            for (int j=0;j<9;j++) {
                System.out.print(grid[i][j] + "|");
            }
            System.out.println();
        }

    }
}