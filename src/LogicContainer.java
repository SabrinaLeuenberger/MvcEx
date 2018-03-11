import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicContainer {

	String webAddress;
	int port;

	public void setWebAddress(String newValue) {
		webAddress = newValue;
	}

	private boolean validateWebAddress() {
		String regexURL = "\\w+[\\.\\w+]+";
		Pattern pURL = Pattern.compile(regexURL);
		Matcher mURL = pURL.matcher(webAddress);
		boolean validURL = mURL.find();
		String regexIP = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$";
		Pattern pIP = Pattern.compile(regexIP);
		Matcher mIP = pIP.matcher(webAddress);
		boolean validIP = mIP.find();
		return (validURL || validIP);
	}

	public void setPort(String newValue) {
		try {
			port = Integer.parseInt(newValue);
		} catch (NumberFormatException e) {
			port = 0;
		}
	}

	public boolean validatePort() {
		return (port >= 1 && port <= 65535);
	}

	public boolean isConnectionValid() {
		return (validateWebAddress() && validatePort());
	}

	public void connect() {
		System.out.println("Connection information: " + webAddress + " : " + port);
	}

}
