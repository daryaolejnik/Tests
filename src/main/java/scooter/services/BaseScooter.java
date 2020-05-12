package scooter.services;

import okhttp3.OkHttpClient;

public class BaseScooter {
    protected String baseUrl = "http://testing.svagworks.me/";
    protected OkHttpClient client;

    public BaseScooter() {
        this.client = new OkHttpClient();
    }
}