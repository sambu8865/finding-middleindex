package findingmiddleindex;

import java.util.Scanner;

public class findingmiddleindex {

	public int[] a;
	public void findmiddle(){
		int front=0;
		int rear=a.length-1;
		int sumfront=0;
		int sumrear=0;
		while(front<rear){
			if(sumfront<sumrear){
				sumfront+=a[front];
				front++;
			}else{
				sumrear+=a[rear];
				rear--;
			}
			
		}
		if(sumfront==sumrear){
			System.out.println("The middle index is "+(++front));
			return;
		}
		System.out.println("There is no such point");
		
	}
	
	public static void main(String[] args){
		findingmiddleindex fmi=new findingmiddleindex();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		fmi.a=new int[s.nextInt()];
		System.out.println("Enter the numbers in sorted order");
		for(int i=0;i<fmi.a.length;i++){
			fmi.a[i]=s.nextInt();
		}
		fmi.findmiddle();
	}
}
