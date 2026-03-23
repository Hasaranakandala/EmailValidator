import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {

boolean isValiedEmail(String email){

    String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    Pattern pattern = Pattern.compile(regex);

    Matcher matcher= pattern.matcher(email);

  return  matcher.matches();


}

boolean isCompanyEmail(String email){

  String regex= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@company\\.com$";
  Pattern pattern= Pattern.compile(regex);
  Matcher matcher=pattern.matcher(email);
  return  matcher.matches();


}



}
