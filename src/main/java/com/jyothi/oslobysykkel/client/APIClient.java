package com.jyothi.oslobysykkel.client;

import com.jyothi.oslobysykkel.models.Station;
import com.jyothi.oslobysykkel.models.StationMaster;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.type.TypeReference;
import org.codehaus.jettison.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class APIClient {

    public static void main(String[] args) {
        try {

            Client client = Client.create();

            WebResource webResource = client
                    .resource("https://oslobysykkel.no/api/v1/stations/availability");


            ClientResponse response = webResource.accept("application/json").header("Client-Identifier","a8fbf81a889c8f33e56a59905a9b87ae")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            StationMaster stationMaster = response.getEntity(StationMaster.class);
            ObjectMapper ow = new ObjectMapper();
            String json = ow.writeValueAsString(stationMaster);
            System.out.println("Output from Server .... \n");
            System.out.println(json);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
