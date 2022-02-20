package com.gitlab.StefanDeWolfe.Proxy;

public class ProxyPatternExample {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Stefan DeWolfe");
        access.grantInternetAccess();
    }
}
