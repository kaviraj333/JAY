import java.util.Scanner;
 class VowelConsonant {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	

	char ch=input.next().charAt(0); 

        char c = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
           {
 	 System.out.println("Vowel");
}

        else
{
            System.out.println("Consonant");
}

    }
}	
	
