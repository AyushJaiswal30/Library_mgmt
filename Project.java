import java.util.Scanner;
public class Project {
    public static void main(String arg[])
    {
        char r;
        do {

            System.out.println(" library management system");
            System.out.println(" press 1 to add book");
            System.out.println("press 2 to issue a book");
            System.out.println(" press 3 to return a book");
            System.out.println(" press 4 to print complete issue details");
            System.out.println(" press 5 to exit");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("enter any number");
            int a = obj1.nextInt();
            switch (a)
            {
                case 1:
                    library aa = new library();
                    aa.add();
                    break;
                case 2:
                    library bb = new library();
                    bb.iss();
                    break;
                case 3:
                    library cc = new library();
                    cc.ret();
                    break;
                case 4:
                    library is = new library();
                    is.detail();
                    break;
                case 5:
                    library dd = new library();
                    dd.exit();
                    break;
                default:
                    System.out.println("invalid number");
            }
            System.out.println("you want to select next option y/n");
            r = obj1.next().charAt(0);
            
        }
        while (r == 'y' || r == 'Y') ;
        if (r == 'n' || r == 'N') {
            library z = new library();
            z.exit();
        }
    }

    }


class library {
        static String str, B, date;
        static int A, C;

        void add() {
            System.out.println("Enter book name,prize and book_no");
            Scanner obj2 = new Scanner(System.in);
            String str = obj2.nextLine();
            float prize = obj2.nextInt();
            int bookno = obj2.nextInt();
            System.out.println("your detail is  " + str + prize + bookno);
        }

        void iss() {
            Scanner obj3 = new Scanner(System.in);
            System.out.println("Book name");
            str = obj3.nextLine();
            System.out.println("Book_id");
            A = obj3.nextInt();
            obj3.nextLine();
            System.out.println("issue date");
            B = obj3.nextLine();
            System.out.println("total number of Issued");
            C = obj3.nextInt();
            obj3.nextLine();
            System.out.println("Return book date");
            date = obj3.nextLine();
        }

        int getid() {
            return A;
        }

        void ret() {
            System.out.println("Enter student name & book_id");
            Scanner c= new Scanner(System.in);
            String name = c.nextLine();
            int bookid = c.nextInt();
            if (A == bookid) {
                System.out.println("Total details");
                System.out.println("Book name::" + library.str);
                System.out.println("Book id ::" + library.A);
                System.out.println("issue date" + library.B);
                System.out.println("Total number of book Issued" + library.C);
                System.out.println("Book return date::" + library.date);

            } else {
                System.out.println("wrong id,pls enter correct id");
            }


        }

        void detail() {
//        System.out.println("Total details");
            System.out.println("Book name::" + library.str);
            System.out.println("Book id ::" + library.A);
            System.out.println("issue date" + library.B);
            System.out.println("Total number of book Issued" + library.C);
            System.out.println("Book return date::" + library.date);
        }

        void exit() {
            System.out.println();
        }
    
}









