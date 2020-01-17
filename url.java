package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class url {
    public static void main (String [] args) throws IOException {

        String zinute = "http://api.plos.org/search?q=title:DNA";
        URL obj = new URL(zinute);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        try {


        // vietoj con.getResponseCode() pabandyk parasyti con.getResponseContent() arba kazkokia panasi fukcija turi buti
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL: "+ zinute);
        System.out.println("Response Code: "+ responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());



         } catch (Exception e) {
            System.out.println();

         }





    }
}
