package com.adapter;

public class RazorPayGateway {
    private String gatewayName;

    public RazorPayGateway(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public String pay(int amount)
    {
        return "Paying amount by "+getGatewayName()+" for amount "+amount;
    }
}
