package com.jyothi.oslobysykkel.client;

import com.jyothi.oslobysykkel.models.Station;
import com.jyothi.oslobysykkel.models.StationMaster;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.codehaus.jackson.map.ObjectMapper;
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


            ClientResponse response = webResource.accept("application/json").header("Client-Identifier","ff6f28feac7f010c6ac289060cfab34c")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            JSONObject myObject = new JSONObject(output);
            ObjectMapper mapper = new ObjectMapper();
           // List<Station> stations =  mapper.readValue(output, new TypeReference<List<Station>>(){});;
           //ArrayList<Station> readValues = new ObjectMapper().readValue(output, new TypeReference<ArrayList<Station>>() { });
            StationMaster stations = mapper.readValue(output, StationMaster.class);
            System.out.println("Output from Server .... \n");
            System.out.println(output);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
