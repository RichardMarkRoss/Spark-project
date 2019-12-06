import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        get("/", (req,  res) -> {
            Map<String, Object> model= new HashMap<> ();
            return new HandlebarsTemplateEngine ().render (new ModelAndView (model,"index.handlebars"));
        });

        get("/home", (req,  res) -> {
            Map<String, Object> model= new HashMap<> ();
            return new HandlebarsTemplateEngine ().render (new ModelAndView (model,"home.handlebars"));
        });
    }

}
