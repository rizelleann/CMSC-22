package rulethirty;

import java.util.Scanner;

public class Rule30{

	private int size;
	private static int[][] whole;

	public Rule30(int x) {
		if (x <= 0) {
			throw new IllegalArgumentException("Invalid size!");
		}
		size = x;
		whole = new int[size][size];
	}
	
	public void run(){
	
	    for(int i = 0; i < size; i++){
	        if(i == 0){
	            for(int j=0; j < size; j++){
	                if(j == size/2){
	                    whole[0][size/2] = 1;
	                } else {
	                    whole[0][j] = 0;
	                }
	            }
	        } else {
	            for(int c = 0; c < size; c++){
	                if(c == 0){
	                    if(whole[i-1][c] == 1){
	                        if((whole[i-1][c+1] == 1 || whole[i-1][c+1] == 0)){
	                            whole[i][c] = 1;// 11, 10
	                        }
	                    } else {
	                        if(whole[i-1][c+1] == 1){
	                            whole[i][c] = 1;//01
	                        } else {
	                            whole[i][c] = 0;//00
	                        }
	                    }
	                } else if(c == size - 1){
	                    if((whole[i-1][c-1] == 1) && (whole[i-1][c] == 1)){
	                        whole[i][c] = 0;//11
	                    } else if((whole[i-1][c-1] == 0) && (whole[i-1][c] == 1)){
	                        whole[i][c] = 1;//01
	                    } else if((whole[i-1][c-1] == 1) && (whole[i-1][c] == 0)){
	                        whole[i][c] = 1; //10
	                    } else {
	                        whole[i][c] = 0;
	                    }
	                }
	                 else {
	                    if(whole[i-1][c-1] == 1){
	                        if(whole[i-1][c] == 1){
	                            if(whole[i-1][c+1] == 1 || (whole[i-1][c+1] == 0)){
	                                whole[i][c] = 0; // 111, 110
	                            }
	                        } else {
	                            if(whole[i-1][c+1] == 1){
	                                whole[i][c] = 0; // 101
	                            } else {
	                                whole[i][c] = 1; // 100
	                            }
	                        }
	                    } else {
	                        if(whole[i-1][c] == 1){
	                            if(whole[i-1][c+1] == 0 || (whole[i-1][c+1] == 1)){
	                                whole[i][c] = 1; // 010, 011
	                            }
	                        } else {
	                            if(whole[i-1][c+1] == 1){
	                                whole[i][c] = 1; // 001
	                            } else {
	                                whole[i][c] = 0; // 000
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }
	    for(int i = 0; i < size; i++) { 
			for(int j = 0; j < size; j++){
				System.out.print(whole[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
