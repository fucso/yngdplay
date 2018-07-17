package controllers.constructor;

import play.*;
import play.mvc.*;
import play.data.*;
import javax.inject.Inject;
import play.data.FormFactory;
import java.util.*;
import models.*;


import views.html.*;


public class ConstructorUpdate extends Controller{

    private final FormFactory formFactory;

    @Inject
    public void ConstructorCreate(final FormFactory formFactory) {
        this.formFactory = formFactory;
    }

//入力フォーム
    public Result constructorSetId(){
    Form<Constructor> f = formFactory.form(Constructor.class);
    return ok(views.html.constructor.constructor_id.render("IDを入力",f));   
    }

// /constructorEditにアクセスした際に実行される処理
    public Result edit(){
        Form<Constructor> f = formFactory.form(Constructor.class).bindFromRequest();
    if(!f.hasErrors()){
	    Constructor obj = f.get();
	    Long id = obj.id;
	    obj = Constructor.find.byId(id);
	    if (obj != null){
	    f = new FormFactory(Constructor.class).fill(obj);
	    return ok(views.html.constructor.constructor_edit.render(id + "を編集",f));
	}else{
	    return ok(views.html.constructor.constructor_id.render("ERROR:idが見つかりません",f));
         }
    }else{
    	return ok(views.html.constructor.constructor_id.render("ERROR:入力に問題があります",f));
    }
}

    public Result update(){
	    Form<Constructor> f = formFactory.form(Constructor.class).bindFromRequest();
	 if(!f.hasErrors()){
	    Constructor data = f.get();
	    data.update();
	    return redirect("/");
	}else{
	   return ok(views.html.constructor.constructor_edit.render("ERROR:再度入力してください",f));
	}
  }
}