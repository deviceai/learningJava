package Regexps;

import java.util.Scanner;

public class IPaadressChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();

        String ipPattern = "[1-255]{1}\\.[0-255]{1}\\.[0-255]{1}\\.[0-255]{1}";
        String IPADDRESS_PATTERN =
                "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        System.out.println(ip.matches(IPADDRESS_PATTERN));

    }
}
