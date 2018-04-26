/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package avtomorfnie;

/**
 *
 * @author Yuri Tveritin
 *  * 
 * Задача 2 Автоморфные числа. Натуральное число называется автоморфным, если оно равно
 * последним цифрам своего квадрата. Например, 25 2 = 625. Напишите программу, 
 * которая вводит натуральное число N и выводит на экран все автоморфные числа,
 * не превосходящие N.
 * 
 * Класс, определящий автоморфные числа.
 * 
 */
public class Avtomorfnie {
//    int n=1000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       algoritm(1000000); 
    }
    
    static void algoritm (int n){
        
        for (int i=1; i<n ;i++){
            int temp=i;
            int q=i*i;
            int j=i;
            //выявляем совпадение цифр числа и его квадрата, двигаясь справа налево
            while(j%10==q%10){   
                j=j/10;//переходим к следующей цифре в числе и его квадрате                
                q=q/10;
                if (j==0) {//выходим из цикла если цифры в числе закончились
                    System.out.println(temp);
                    break;
                }             
            } 


        }
    }
    
}
