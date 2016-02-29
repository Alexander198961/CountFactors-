/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitysample;

/**
 *
 * @author ps
 */
public class CodilitySample {

    /**
     * @param args the command line arguments
     */
    public int  run() {
        // TODO code application logic here
        
        int N=24;
        
        int size=N/2;
        int count=2;
        if(N==1)
        {
            return 1;
        }
        for( int i=2;i<=size;i++)
        {
            if(N%i== 0)
            {
                count++;
            }
        }
        
       return count;
            
        
    }
    public static void main(String[] args)
    {
        
    }
    
}
