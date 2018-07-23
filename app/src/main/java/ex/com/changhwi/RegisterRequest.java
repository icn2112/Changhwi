package ex.com.changhwi;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by icn21 on 2018-07-23.
 */

public class RegisterRequest extends StringRequest {

    final static private String URL = "http://icn2112.cafe24.com/UserRegister.php";
    private Map<String, String> parameters;

    public RegisterRequest(String userID, String userPassword, String userEmail, String userName, int userAge, String userGender,
                           Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userEmail", userEmail);
        parameters.put("userName", userName);
        parameters.put("userAge", userAge + "");
        parameters.put("userGender", userGender);
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}



