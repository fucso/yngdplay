package controllers.constructor;

import java.util.List;

import io.ebean.Finder;
import models.constructor.ConstructorType;
import play.mvc.Controller;
import play.mvc.Result;

public class Type extends Controller {

	    public Result list() {

	    	Finder<Integer, ConstructorType> constructorType = new Finder<Integer, ConstructorType>(ConstructorType.class);

	    	List<ConstructorType> constructorList = constructorType.all();


	    	return ok(views.html.constructor.type_list.render(constructorList));
	    }
}