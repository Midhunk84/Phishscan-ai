import java.net.URL;
import java.net.URI;

public class URLValidator {

    // Validate URL format
    public static boolean isValidURL(String url) {

        try {

            URL parsedURL = new URL(url);

            parsedURL.toURI();

            return true;

        } catch (Exception e) {

            return false;
        }
    }

    // Extract protocol
    public static String getProtocol(String url) {

        try {

            URL parsedURL = new URL(url);

            return parsedURL.getProtocol();

        } catch (Exception e) {

            return "Invalid";
        }
    }

    // Extract domain name
    public static String getDomain(String url) {

        try {

            URL parsedURL = new URL(url);

            return parsedURL.getHost();

        } catch (Exception e) {

            return "Invalid";
        }
    }

    // Check if HTTPS is used
    public static boolean isSecure(String url) {

        try {

            URL parsedURL = new URL(url);

            return parsedURL.getProtocol().equalsIgnoreCase("https");

        } catch (Exception e) {

            return false;
        }
    }

    // Count dots in domain
    public static int getDotCount(String url) {

        try {

            URL parsedURL = new URL(url);

            String domain = parsedURL.getHost();

            int count = 0;

            for (char c : domain.toCharArray()) {

                if (c == '.') {

                    count++;
                }
            }

            return count;

        } catch (Exception e) {

            return 0;
        }
    }

    // Main method
    public static void main(String[] args) {

        String testURL = "https://google.com";

        System.out.println("=== PHISHSCAN AI JAVA MODULE ===");

        System.out.println("URL: " + testURL);

        System.out.println("Valid URL: " + isValidURL(testURL));

        System.out.println("Protocol: " + getProtocol(testURL));

        System.out.println("Domain: " + getDomain(testURL));

        System.out.println("Secure HTTPS: " + isSecure(testURL));

        System.out.println("Dot Count: " + getDotCount(testURL));
    }
}