package com.travelport;

import org.springframework.web.client.RestTemplate;

public class MyClient {
    public static void clientGet()
    {
        final String uri = "https://is-echo-monitor-a.adc-dv-gf.travelport.com/management";
//        final String uri = "https://health-app-health-app.ocp-a.zu2.nonprod.travelport.io/actuator";
//        final String uri = "http://localhost:8080/actuator";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }
}
