import java.util.Scanner;
// Внес на класата Scanner од стандардната библиотека за вчитување на влез од тастатура.
public class Nizi { 
	// Јавна класа  која е именувана Nizi
public static void main(String[] args) { 
	// Main метод каде ни ги овозможуваа сите операции во програмата.
        Scanner input = new Scanner(System.in); 
        // Иницијализација на  нов Scanner објект за читање од стандарден влез.
        System.out.println("Da se ispecatat: clеnovite na niza koi ne se delivi so 3");
// Испишување на порака за корисникот.
        System.out.print("Vnesi broj na clenovi vo nizata "); 
  // Порака за внесување на големината на низата.
        int n = input.nextInt(); 
    // Читање на цел број од корисникот која ја  претставува големината на низата.
        int niza[] = new int[n]; 
    // Декларација на низата со дадена големина.
        System.out.println("Vnesi gi clеnovite vo nizata:"); 
// Порака за внесување на елементите на низата.
        for (int i = 0; i < niza.length; i++) { 
         System.out.print(i + "-->"); 
              niza[i] = input.nextInt();
        // Читање на внесениот елемент и зачувување во низата.
        }
        for (int i = 0; i < niza.length; i++) { 
        	
            if (niza[i] % 3 != 0)
            	// Проверка дали елементот не е делив со 3.
                System.out.println("niza[" + i + "]=" + niza[i]);
            // Испис на елементот кој не е делив со 3.
        }
    } 
}
