public class  User {
	    private String name;
	    private String password;
	    private Encoder encoder;

	    public User(Encoder encoder) {
	        this.encoder = encoder;
	    }

	    public void setPassword(String password) {
	        this.password = encoder.encode(password);
	        System.out.println(encoder.getClass().getSimpleName()+"Password encoded : " + this.password);
	    }

	    public String getPassword() {
	        return encoder.decode(this.password);
	    }
	}