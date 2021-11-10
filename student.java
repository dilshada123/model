
import java.util.Date;

public class Student {
	private String first_name;
	private String last_name;
	private Date date_of_birth;
	private String emailAddress;
	private String contact_number;


	public String getfirst_name() {
		return first_name;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getlast_name() {
		return last_name;
	}

	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getdate_of_birth() {
		return date_of_birth;
	}

	public void setdate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getemail_ID() {
		return email_ID;
	}

	public void setemail_ID(String email_ID) {
		this.email_ID = email_ID;
	}

	public String getcontact_number() {
		return contact_number;
	}

	public void setcontact_number(String contact_number) {
		this.contact_number = contact_number;
	}
}
