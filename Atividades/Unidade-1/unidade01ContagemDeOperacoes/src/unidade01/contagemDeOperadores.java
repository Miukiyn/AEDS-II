package unidade01;

public class contagemDeOperadores 
{

	public static void main(String[] args) 
	{
		// Dados
	    int n = 2;
	    int a = 50;
	    int b = 50;
	    int c = 50;
	    int d = 50;
	    int e = 50;
	    int i = 0;
	    int x = 0;
	    int y = 0;
	    
	    // 3n + 2n^2
	    while (i < n) // 3n
	    {
	      i++;
	      a--; b--; c--;
	      y = y + 3;
	    }

	    for (i = 0; i < n; i++) // 2n^2
	    {
	      for (int j = 0; j < n; j++)
	      {
	      a--; b--;
	      x = x + 2;
	      }
	    }
	    
	    x = x + y;

	    System.out.println("f(2) = 3n + 2n^2 = " + x);
	    
	    x = 0;
	    y = 0;
	    i = 0;
	    
	    //---------------------------------
	    
	    // 5n + 4n^3
	    while( i < n)// 5n
	    {
	      a = a - 1;
	      b = b - 1;
	      c = c - 1;
	      d = d - 1;
	      e = e - 1;
	      
	      y = y + 5;
	      i = i + 1;
	    }

	    for(i = 0; i < n; i = i + 1)// 4n^3
	    {
	      for(int j = 0; j < n; j = j + 1)
	      {
	        for(int k = 0; k < n; k = k + 1)
	        {
	            a = a - 1;
	            b = b - 1;
	            c = c - 1;
	            d = d - 1;
	            
	            x = x + 4;
	        }
	      }
	    }
	    
	    x = x + y;
	    
	    System.out.println("f(2) = 5n + 4n^3 = " + x);
	    
	    x = 0;
	    y = 0;
	    i = 0;
	    
	  //--------------------------------
	    
	 // c) log(n) + n
	    for( i = n ; i > 0; i = i / 2)
	    //   i = 4 ; 4 > 0; i = 4 / 2
	    {
	        a = a - 1;
	        x = x + 1;
	    }
	    a = a - 1;
        b = b - 1;
        
        y = y + 2;
	    
        x = x + y;
	    
	    System.out.println("f(2) = lg(n) + n = " + x);
	    
	    x = 0;
	    y = 0;
	    i = 0;
	    
	  //--------------------------------
	    
	 // d) 2n^3 + 5
	    
	    
	      for(int j = 0; j < n; j = j + 1)
	      {
	        for(int k = 0; k < n; k = k + 1)
	        {
	        	for(int l = 0; l < n; l = l + 1)
	        	{
	              a = a - 1;
	              b = b - 1;
	              
	              
	              y = y + 2; 
	        	}
	        }
	      }
	        a = a - 1;
	        b = b - 1;
	        c = c - 1;
	        d = d - 1;
	        e = e - 1;
	        
	        x = x + 5;
	        
	    
	    
	    x = x + y;
	    
	    System.out.println("f(2) = 2n^3 + 5 = " + x);
	    
	    x = 0;
	    y = 0;
	    i = 0;
	    
	  //--------------------------------
	    
	 // e) 9n^4 + 5n^2 + n/2
	    
	    for(i = 0; i < n; i = i + 1)// 4n^3
	    {
	      for(int j = 0; j < n; j = j + 1)
	      {
	        for(int k = 0; k < n; k = k + 1)
	        {
	        	for(int l = 0; l < n; l = l + 1)
	        	{
		            a = a - 1;
		            b = b - 1;
		            c = c - 1;
		            d = d - 1;
		            e = e - 1;
		            a = a - 1;
		            b =	b - 1;
		            c = c - 1;
		            d = d - 1;
		            
		            x = x + 9;
	        	}
	        }
	      }
	    }
	    
	    for (i = 0; i < n; i++) // 2n^2
	    {
	      for (int j = 0; j < n; j++)
	      {
	    	  	a = a - 1;
	            b = b - 1;
	            c = c - 1;
	            d = d - 1;
	            e = e - 1;
	            y = y + 5;
	      }
	    }
	    
	    x = x + y + (n/2);
	    
	    System.out.println("f(2) = 9n^4 + 5n^2 + n/2 = " + x);
	    
	    x = 0;
	    y = 0;
	    i = 0;
	    
	  //--------------------------------
	    
	 // e) lg(n) + 5 lg(n)
	   
	    for( i = n ; i > 0; i = i / 2)
		    //   i = 4 ; 4 > 0; i = 4 / 2
		    {
		        a = a - 1;
		        x = x + 1;
		    }
	    
	    
	    for( i = n ; i > 0; i = i / 2)
		{
			a = a - 1;
			b = b - 1;
		    c = c - 1;
		    d = d - 1;
		    e = e - 1;
			        
			y = y + 5;
		}
		    
	    
	    x = x + y;
	    
	    System.out.println("f(2) = lg(n) + 5 lg(n) = " + x);
	    
	    
	    System.exit(0);
	}// end public static void main(String[] args)

}
