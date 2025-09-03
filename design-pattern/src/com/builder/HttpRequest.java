package com.builder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String url;
    private String httpMethod;
    private Map<String,String> headers = new HashMap<>();
    private Map<String,String> queryParam = new HashMap<>();
    private String requestBody;

    public HttpRequest(Builder builder)
    {
        this.url=builder.url;
        this.httpMethod=builder.httpMethod;
        this.headers=builder.headers;
        this.queryParam=builder.queryParam;
        this.requestBody= builder.requestBody;
    }

    public static class Builder
    {
        private String url;
        private String httpMethod;
        private Map<String,String> headers = new HashMap<>();
        private Map<String,String> queryParam = new HashMap<>();
        private String requestBody;
        public Builder setUrl(String url)
        {
            this.url=url;
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder setHeaders(String key,String value) {
            this.headers.put(key,value);
            return this;
        }

        public Builder setQueryParam(String key,String value) {
            this.queryParam.put(key,value);
            return this;
        }

        public Builder setRequestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        public HttpRequest build()
        {
            return new HttpRequest(this);
        }
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", headers=" + headers +
                ", queryParam=" + queryParam +
                ", requestBody='" + requestBody + '\'' +
                '}';
    }
}
