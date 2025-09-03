package com.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        HttpRequest httpRequestGET = new HttpRequest.Builder()
                .setUrl("https://localhost:8080/getStudent")
                .setHttpMethod("GET")
                .setHeaders("content-type","application/json")
                .setQueryParam("id","2")
                .build();

        System.out.println(httpRequestGET);

        HttpRequest httpRequestPOST = new HttpRequest.Builder()
                .setUrl("https://localhost:8080/createStudent")
                .setHttpMethod("POST")
                .setHeaders("content-type","application/json")
                .setRequestBody("{\"id\":\"1\",\"name\":\"Vishnu\"}")
                .build();

        System.out.println(httpRequestPOST);

    }

}
