package com.ebay.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"Core Java Books", "Selenium Books", "Data Structure Books"};
    }

    @DataProvider(name = "credentials")
    public Object[][] getCredentials() {
        return new Object[][]{{"testuser001", "testpass001"}, {"testuser002", "testpass002"}, {"testuser003", "testpass003"}};
    }
}