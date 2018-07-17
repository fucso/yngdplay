package controllers.constructor;

import play.*;
import play.mvc.*;
import play.data.*;
import javax.inject.Inject;
import play.data.FormFactory;
import java.util.*;
import models.*;


import views.html.*;


public class ConstructorDelete extends Controller{

    private final FormFactory formFactory;

    @Inject
    public void ConstructorCreate(final FormFactory formFactory) {
        this.formFactory = formFactory;
    }


//入力フォーム
public Result delete(){
  Form<Constructor> f = formFactory.form(Constructor.class);
  return ok(views.html.constructor.constructor_delete.render("削除するIDを入力",f));   
}

// /constructorRemoveにアクセスした際に実行される処理
public Result remove(){
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
}
