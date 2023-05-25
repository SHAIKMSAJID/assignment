
import java.util.HashMap;
public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("sajid","123456789");
        logininfo.put("cbit","123456789");
        logininfo.put("DharaniSir","Great");
    }


    public HashMap getLoginInfo(){
        return logininfo;
    }
}