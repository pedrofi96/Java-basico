package revisao;

import javax.swing.JOptionPane;

public class Revisao {

  
    public static void main(String[] args) {
      
        //primeiro for imprime todos os numeros pares entre 1 e 10
        for ( int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        
        //segundo for imprime todos os numeros multiplos de 5 de 5 a 100;
        for(int j=0; j<=100; j+=5){
            System.out.println(j);
        }
        
        for(int k=100; k>=0; k-=5){
            System.out.println(k);
        }
        
        
        
        int h= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero."));
        boolean e = true;
        
        
        for (int j = 2; j < h; j++) {
            if (h % j == 0) 
            e=false;       
        }
        
         if(e == true ){
             JOptionPane.showConfirmDialog(null, "O numero "+h+" é primo.");
        }else{
          JOptionPane.showConfirmDialog(null, "O numero "+h+" não é primo.");  
        }
        
         
       //faz as contas de todos os numeros primos entre 0 e 50
       
       /*int c = 0;
        for(int x=2; x<51; x++){
            c=0;
            for(int y=1;y<=x;y++){
                if(x%y==0){c++;}
            }
            if(c==2){
                System.out.println(x);
            }
        } 
        */
        
       int c = 0;
       for(int x=50; x>=0; x--){
            c=0;
            for(int y=1;y<=x;y++){
                if(x%y==0){c++;}
            }
            if(c==2){
                System.out.println(x);
            }
        }
       
       for(int i=1; i<=32|| i<=-32; i=i*-2){
           System.out.println(i);
       }
       
       for(int i=1; i<1000; i=i*10){
           System.out.println(i);
       }
       
       for(int i=1; i<=1111; i=i*10+1){
           System.out.println(i);
       }
       int z=1;
       //1; 22;333;4444 
        for(int i=1; i<=1111; i=(i*10)+1){
            
           
           System.out.print(i*z+",");
           z++;
       }
       
       
        
    }    
}
