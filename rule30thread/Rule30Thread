package rulethirty;

public class Rule30Thread extends Thread{
	private static int[][] cells;
	private int size;
	private static int start;
	private static int end;
	private int row;
	private int col;
	
	
	public Rule30Thread(int size,int[][] cells, int start, int end){
		this.size = size;
		this.start = start;
		this.end = end;
		this.cells = cells;
		
	}
	
	public Rule30Thread(int x){
		this(x, cells, start, end);
		this.row = size;
		this.col = size;
		cells = new int[row][col];
		
	}
	
/*	111     110     101     100     011     010     001     000
	 0       0       0       1       1       1       1       0   */
	public void run(){
		for(int i = 0; i < size; i++){
	        if(i == 0){
	            for(int j=0; j < size; j++){
	                if(j == size/2){
	                    cells[0][size/2] = 1;
	                } else {
	                    cells[0][j] = 0;
	                }
	            }
	        } else {
	            for(int j = 0; j < size; j++){
	                if(j == 0){
	                    if(cells[i-1][j] == 1){
	                        if((cells[i-1][j+1] == 1 || cells[i-1][j+1] == 0)){
	                            cells[i][j] = 1;// 11, 10
	                        }
	                    } else {
	                        if(cells[i-1][j+1] == 1){
	                            cells[i][j] = 1;//01
	                        } else {
	                            cells[i][j] = 0;//00
	                        }
	                    }
	                } else if(j == size - 1){
	                    if((cells[i-1][j-1] == 1) && (cells[i-1][j] == 1)){
	                        cells[i][j] = 0;//11
	                    } else if((cells[i-1][j-1] == 0) && (cells[i-1][j] == 1)){
	                        cells[i][j] = 1;//01
	                    } else if((cells[i-1][j-1] == 1) && (cells[i-1][j] == 0)){
	                        cells[i][j] = 1; //10
	                    } else {
	                        cells[i][j] = 0;
	                    }
	                }
	                 else {
	                    if(cells[i-1][j-1] == 1){
	                        if(cells[i-1][j] == 1){
	                            if(cells[i-1][j+1] == 1 || (cells[i-1][j+1] == 0)){
	                                cells[i][j] = 0; // 111, 110
	                            }
	                        } else {
	                            if(cells[i-1][j+1] == 1){
	                                cells[i][j] = 0; // 101
	                            } else {
	                                cells[i][j] = 1; // 100
	                            }
	                        }
	                    } else {
	                        if(cells[i-1][j] == 1){
	                            if(cells[i-1][j+1] == 0 || (cells[i-1][j+1] == 1)){
	                                cells[i][j] = 1; // 010, 011
	                            }
	                        } else {
	                            if(cells[i-1][j+1] == 1){
	                                cells[i][j] = 1; // 001
	                            } else {
	                                cells[i][j] = 0; // 000
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }
		 
	}
	
	public void displayCells() {
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			System.out.print(cells[i][j] + " ");
    		}
    		System.out.print("\n");
    	}
    }
}
