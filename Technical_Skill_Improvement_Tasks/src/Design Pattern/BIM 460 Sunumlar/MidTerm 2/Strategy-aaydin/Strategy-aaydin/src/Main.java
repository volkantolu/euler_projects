public class  Main {
	    public static void main(String[] args) {
	        User user =new User(new CaesarCipher(7));
            String pass="strategy";

            System.out.println("My password is : " + pass+"\n");
            user.setPassword(pass);
            System.out.println("(Caesar)Password decoded : " + user.getPassword()+"\n");


            user =new User(new DesEncrypter("ahmet"));

            user.setPassword(pass);
            System.out.println("(DES)Password decoded : " + user.getPassword());
	    }
	}