import java.util.HashMap;
import java.util.Map;

import models.Add;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/" ,(request, response) -> {
            Map<String,Object> model = new HashMap<String,Object>();
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

        post("/add/new",(request, response) -> {
            Map<String,Object>model = new HashMap<String, Object>();
            String content = request .queryParams("content");
            Add newAdd = new Add(content);
            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());
    }

}
