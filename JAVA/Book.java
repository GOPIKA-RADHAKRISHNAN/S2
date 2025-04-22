import java.util.Scanner;

class Book{
	int accession_number;
	String title;
	String author;
	String edition;
 	String publisher;

    Book(int ano,String tit, String aut,String edi,String pub) {
        accession_number = ano;
        title= tit;
        author=aut;
        edition=edi;
        publisher=pub;
    }

 void display() {
        System.out.println("\n***** Books details *****");
        System.out.println("accession_number: " + accession_number);
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("edition: " + edition);
        System.out.println("publisher: " + publisher);
       
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Books: ");
        int n = sc.nextInt();

        Book[] arr = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i) + ":");

            System.out.print("accession_number: ");
            int accession_number = sc.nextInt();
            
            System.out.print("title: ");
            String title = sc.next();

            System.out.print("author: ");
            String author = sc.next();


            System.out.print("edition: ");
            String edition = sc.next();
            
            System.out.print("publisher: ");
            String publisher= sc.next();
             arr[i] = new Book(accession_number, title, author, edition, publisher);
            
            }
    System.out.println("*********Search a book************");
     System.out.print("accession_number: ");
            int a = sc.nextInt();
    for(int i=0;i<n;i++){
        
            if (a== arr[i].accession_number){

            
            arr[i].display();
            }
        }
        sc.close();

     }
}
     

    
    
    
    
