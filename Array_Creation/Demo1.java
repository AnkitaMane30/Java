//2D Array
package com.dkte;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int[2][3];
		int [][] arr2=new int[][] {{1,2,3},{4,5,6}};
		/*for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println( );
		}*/
//Ragged Array
		int[][] raar=new int[4][];
		raar[0]=new int[1];
	    raar[1]=new int[2];
	    	raar[2]=new int[3];
	    raar[3]=new int[4];
	    for(int i=0;i<raar.length;i++)
		{
			for(int j=0;j<raar[i].length;j++)
			{
				System.out.print(raar[i][j]+" ");
			}
			System.out.println( );
		}
	    int num=0;
	    for(int i=0;i<raar.length;i++)
		{
			for(int j=0;j<raar[i].length;j++)
			{
				raar[i][j]=++num;
			}
			System.out.println( );
		}
	    for(int i=0;i<raar.length;i++)
		{
			for(int j=0;j<raar[i].length;j++)
			{
				System.out.print(raar[i][j]+" ");
			}
			System.out.println( );
		}


	    
	}

}
