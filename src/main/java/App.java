import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.Add;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);
        staticFileLocation("/public");
        //get :show newadd form
        get("/add", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "newadd-form.hbs");
        }, new HandlebarsTemplateEngine());

        //get:show all hero
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();  //displaying home
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        //post:process new add form
        post("/post", (request, response) -> {
            Map<String, Object>model = new HashMap<>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String powers = request.queryParams("powers");
            String weakness = request.queryParams("weakness");
            int size = Integer.parseInt(request.queryParams("size"));
            String squad = request.queryParams("squad");
            String mission = request.queryParams("mission");
            Add newheros = new Add(name, age, powers, weakness,size,mission,squad);
            model.put("heros", newheros);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        post("/post", (request, response) -> {
            Map<String, Object>model = new HashMap<>();
            int size = Integer.parseInt(request.queryParams("size"));
            String squad = request.queryParams("squad");
            String mission = request.queryParams("mission");
            Squad squads = new Squad(size, squad, mission);
            model.put("squads", squads);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
        get("/detail", (request, response) -> {
            Map<String, Object> model = new HashMap<>();//displaying home
            ArrayList<Squad> squads = Squad.getAll();
            ArrayList<Add> heros = Add.getAll();
            model.put("squads",squads );
            model.put("heros", heros);
            return new ModelAndView(model, "add-detail.hbs");
        }, new HandlebarsTemplateEngine());

//        get("/post", (request, response) -> {
//            Map<String, Object> model = new HashMap<>();  //displaying home
//            ArrayList<Squad> squads = Squad.getAll();
//            model.put("squads",squads );
//            return new ModelAndView(model, "add-detail.hbs");
//        }, new HandlebarsTemplateEngine());

    }
    }


