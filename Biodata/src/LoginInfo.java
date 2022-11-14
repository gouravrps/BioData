import java.util.HashMap;

public class LoginInfo {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginInfo(){
		logininfo.put("Gourav", "1234");
		logininfo.put("Pratyay", "1234");
		logininfo.put("Konisha", "1234");
		logininfo.put("Priti", "1234");
		
		
		
		
	}
	
	protected HashMap getlogininfo() {
		return logininfo;
	}
	
}
