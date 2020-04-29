import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.Add;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        //get :show newadd form
        get("/add", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "newadd-form.hbs");
        }, new HandlebarsTemplateEngine());

        //get:show all hero
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();  //displaying home
            ArrayList<Add> heros = Add.getAll();
            model.put("heros", heros);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        //post:process new add form
        post("/post", (request, response) -> {
            Map<String,ArrayList<Add>> model = new HashMap<>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String powers = request.queryParams("powers");
            String weakness = request.queryParams("weakness");
            Add heros = new Add(name, age, powers, weakness);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());


        // hero(current)
//        get("/detail", (request, response) -> {
//            Map<String, Object> model = new HashMap<>();  //displaying home
//            ArrayList<Add>hero=Add.getAll();
//            model.put("hero",hero);
////            int idOfHero = Integer.parseInt(request.params(":id"));
////            Add foundAdd = Add.find(idOfHero);
//            return new ModelAndView(model, "index.hbs");
//        }, new HandlebarsTemplateEngine());


    }
    }


