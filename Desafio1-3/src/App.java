import java.util.Scanner;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Locale;


public class App {
    public static void main(String[] args) throws Exception {
    

        
        //QUESTÃO 1
        Scanner sc = new Scanner(System.in);
        List<String> alphabets = new ArrayList<String>();
        
        System.out.println("Informe quantas palavras ira usar para formar sua frase: ");
       int N = sc.nextInt();
        
        Map<String, Integer> frase = new HashMap<>();
        sc.nextLine();
        for(int i = 0; i < N; i++){
        
        String palavra = sc.nextLine();
        
        palavra = palavra.replace(" ", "&32");
        if(palavra.lastIndexOf("&") == palavra.length()-3){
           palavra = palavra.substring(0, palavra.length() - 3);
        }
        
        
        alphabets.add(palavra);
            
        System.out.println(palavra.lastIndexOf("&32"));
        System.out.println(palavra.length()-1);
       
        
        
        }
        System.out.println(alphabets);
        
        
        
        
          
        //Questão 2
        /*String word1 = sc.nextLine();
            String word2 = sc.nextLine();
            
            char[] cArray1 = word1.toCharArray();
            char[] cArray2 = word2.toCharArray();
            int contador = 0;
        
            for (int i = 0; i < cArray1.length; i++){
                
                    if (cArray1[i] != cArray2[i]) {
                        contador = contador + 1;
                    }
                    
            }
           
                
            
        
            if ((contador) <= (cArray1.length * 2/3 )) {
                System.out.println(word1 + "," + word2 + "->" + "TRUE");
            }else if ( cArray1[0] != cArray2[0]){System.out.println(word1 + "," + word2 + "->" + "False");}
            else{System.out.println(word1 + "," + word2 + "->" + "False");}
            
            
            //QUESTÃO 3
            String word3 = sc.nextLine();
            String word4 = sc.nextLine();
            
            char[] cArray3 = word3.toCharArray();
            char[] cArray4 = word4.toCharArray();
            


            if(cArray3.length - cArray4.length == 1){
            
           if(word3.compareToIgnoreCase(word4) < 0 ){
            System.out.println(word3 + "," + word4 + "->" + "TRUE");
           }else if(word3.compareToIgnoreCase(word4) > 0){
            System.out.println(word3 + "," + word4 + "->" + "TRUE");
           }
           else{System.out.println(word3 + "," + word4 + "->" + "False");}
        }
            if(cArray4.length - cArray3.length == 1){
                if(word3.compareToIgnoreCase(word4) < 0 ){
                    System.out.println(word3 + "," + word4 + "->" + "TRUE");
                   }else if(word3.compareToIgnoreCase(word4) > 0){
                    System.out.println(word3 + "," + word4 + "->" + "TRUE");
                   }
                   else{System.out.println(word3 + "," + word4 + "->" + "False");}
            }
           
           if(cArray3.length - cArray4.length == 0){
           for (int i = 0; i < cArray3.length; i++){
                
            if (cArray3[i] != cArray4[i]) {
                contador = contador + 1;
            }
        }
        if(contador == 1){System.out.println(word3 + "," + word4 + "->" + "TRUE");}
            else if (contador > 1){System.out.println(word3 + "," + word4 + "->" + "False");}
            else{System.out.println(word3 + "," + word4 + "->" + "False");}
    }
            
           sc.close();*/
                
            
        
           
            
            
        }
    
}

