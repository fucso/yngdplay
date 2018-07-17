package controllers.constructor;

import play.*;
import play.mvc.*;
import play.data.*;
import javax.inject.Inject;
import play.data.FormFactory;
import java.util.*;
import models.*;


import views.html.*;


public class ConstructorCreate extends Controller{
    
    private final FormFactory formFactory;

    @Inject
    public ConstructorCreate(final FormFactory formFactory) {
        this.formFactory = formFactory;
    }


    //入力フォーム
    public Result constructorAdd(){
        Form<Constructor> f = formFactory.form(Constructor.class);
        return ok(views.html.constructor.constructor_register.render("入力フォーム",f));   
    }

    // /constructorCreateにアクセスした際に実行される処理
    public Result constructorCreate(){
        Form<Constructor> f = formFactory.form(Constructor.class).bindFromRequest();
        if(!f.hasErrors()){
        	Constructor data = f.get();
        	data.save();
        	return redirect("/list");
        }else{
            return badRequest(views.html.constructor.constructor_register.render("ERROR",f));
       }
    }
}