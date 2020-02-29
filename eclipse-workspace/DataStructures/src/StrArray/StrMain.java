package StrArray;

public class StrMain {
	public int entries = 0;
	private Str[] board;
	
	public StrMain(int capacity) {
		board = new Str[capacity];
	}
	
	public void add(Str e) {
		int newScore = e.getScore();
		
		if(entries<board.length||newScore>board[entries-1].getScore()) {
			if(entries<board.length)
				entries++;
			
			int j = entries-1;
			while(j>0 && board[j-1].getScore()<newScore) {
				board[j]= board[j-1];
				j--;
			}
			board[j]=e;
			}
		}
	
	public void display() {
		for (int i=0; i< entries; i++)  {
		System.out.println("Name:"+board[i].getName()+"Score: "+board[i].getScore());
	}
	}
	
	public void remove(int i) {
		if(i<0||i>board.length)
		{System.out.println("index out of bounds");
		return;
		}
		for(int j= i; j<board.length-1; j++) {
			board[j]= board[j+1];
		}
		//board[entries-1]= null;
		entries--;
		}
	}

		
	
	

