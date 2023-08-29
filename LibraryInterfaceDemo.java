package basicprograms;
interface LibaryUser {
    public void registerAccount(int age);

    public void requestBook(String bookType);

}

class kidUser implements LibaryUser {
    int age;
    String bookType;

    public kidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount(int age) {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if (bookType == "Kids") {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

 class AdultUser implements LibaryUser {
    int age;
    String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount(int age) {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if (bookType == "Fiction") {
            System.out.println("Book Issued successfully, please return the book within 7 days” should be displayed in the console. else, a message displaying,");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kidUser user1 = new kidUser(10, "Kids");
        user1.registerAccount(10);
        user1.requestBook("Kids");
        kidUser user2 = new kidUser(18, "Fiction");
        user2.registerAccount(18);
        user2.requestBook("Fiction");
//        AdultUser user3 =new AdultUser(5, "Kids");
//        user3.registerAccount(5);
//        user3.requestBook("Kids");
//        AdultUser user4 =new AdultUser(23, "Fiction");
//        user4.registerAccount(23);
//        user4.requestBook("Fiction");
	}

}
