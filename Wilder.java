
public class Wilder {
	
	private String firstname;
	private boolean aware;
	
	public Wilder (String firstname, boolean aware) {
	this.firstname = firstname;
	this.aware = aware;
}
	public String getfirstname () {
		return this.firstname;
	}
	public boolean getaware () {
		return this.aware;
	}
	
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setaware(boolean aware) {
		this.aware = aware;
	}
	
	public String whoAmI() {

		if (this.aware == true) {
			return "Je m'appelle "+this.getfirstname()+" et je suis aware";
		}
		else {
			return "Je m'appelle "+this.getfirstname()+" et je ne suis pas aware";
		}

	}

}
