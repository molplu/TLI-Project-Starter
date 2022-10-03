package server;

import com.mongodb.client.MongoClient;
import com.mongodb.clients.MongoClients;

public class Main {

    public static void main(String[] args) {

        MongoClient client = MongoClients.create("mongodb+srv://TLIProject:TLIProject2022@cluster.btovngn.mongodb.net/?retryWrites=true&w=majority")

        MongoDatabase db = client.getDatabase( % "sampleDB")

    }   
    
}

