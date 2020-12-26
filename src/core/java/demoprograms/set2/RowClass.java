package core.java.demoprograms.set2;

public class RowClass {

	private int Profile_ID;
	private String Profile_Status;
	private String Agrmt_name;
	public RowClass(int profile_ID, String profile_Status, String agrmt_name) {
		super();
		Profile_ID = profile_ID;
		Profile_Status = profile_Status;
		Agrmt_name = agrmt_name;
	}
	public int getProfile_ID() {
		return Profile_ID;
	}
	public void setProfile_ID(int profile_ID) {
		Profile_ID = profile_ID;
	}
	public String getProfile_Status() {
		return Profile_Status;
	}
	public void setProfile_Status(String profile_Status) {
		Profile_Status = profile_Status;
	}
	public String getAgrmt_name() {
		return Agrmt_name;
	}
	public void setAgrmt_name(String agrmt_name) {
		Agrmt_name = agrmt_name;
	}

}
