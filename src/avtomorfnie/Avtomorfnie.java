/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package avtomorfnie;

import java.util.ArrayList;

/**
 *
 * @author Yuri Tveritin
 * 
 */
public class Avtomorfnie {
    /**    
    * @param args the command line arguments
    */
    public static void main(String[] args) {
       algoritm(1000000); 
       ex3(10000);
       ex4(4,8);
    }
    
    /**
    * Задача 2 Автоморфные числа. Натуральное число называется автоморфным, если оно равно
    * последним цифрам своего квадрата. Например, 25 2 = 625. Напишите программу, 
    * которая вводит натуральное число N и выводит на экран все автоморфные числа,
    * не превосходящие N.
    * 
    * Метод, определящий автоморфные числа.
    * 
    * @param n 
    */
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
    /**
     * Задача 3. Реализовать алгоритм поиска простых чисел «Решето Эратосфена».
     * Вывести самое большое число найденное с помощью этого алгоритма.
     * Рассчитать время нахождения этого числа.
     */
    static void ex3(int n){
        long start = System.currentTimeMillis();
        ArrayList<Integer> list=new ArrayList();
        //заполняем список числами
        for (int i=2;i<n+1;i++){
            list.add(i);           
        }        
        
        int p=0;
        int delitel=0;
        //зацикливаем для прохождения по всем элементам массива
        while (p!=list.get(list.size()-1)){
            
            //выбираем новое число p
            for (Integer item:list){                     
                p=item;
//                System.out.println(p);
                if (p>delitel)break;//каждый раз число p должно быть больше своего предыдыщего 
            }
            delitel=p; //для хранения текущего числа p
            //удаляем(вычеркиваем) из списка числа, кратные текущему числу p
            for(int i=0;i<list.size();i++){
                if((list.get(i)!=delitel)&(list.get(i)%delitel==0)) list.remove(i);
            }
            
        }
        //вывод результата
        System.out.println();
        for (Integer item:list){ 
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println("max="+list.get(list.size()-1));
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("time="+time);
        
    }
    /**
     * Задание 4. Реализовать алгоритм ускоренного возведения в степень
     * 
     * @param a
     * @param b 
     */
    static void ex4(int a, int b){
        int n=1;//учитывает нечетную степень
        int s=a;//учитывает четную степень
        int k=b;// степень
        while(k!=0){
            if(k%2==0){
                s=s*s;
                k=k/2;
            }
            else{
                k--;
                n=n*s;
            }
        }
        System.out.println();
        System.out.println("результат="+n);
    }
    
}
