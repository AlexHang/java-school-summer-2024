package org.example;

import org.apache.log4j.BasicConfigurator;

import spark.Spark;
import spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();

        Spark.get("/example", (request, response) -> {
            return "Hello world";
        });

        Spark.get("/example/:name", (request, response) -> {
            String username = request.params("name");
            //
            return "Hello world " + request.params("name")
                    + " today you are " + request.queryParams("mood");
        });

        Spark.put("/create", (request, response) -> {
            return "Hello world";
        });
    }
}