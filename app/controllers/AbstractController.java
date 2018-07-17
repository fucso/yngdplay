package controllers;

import play.mvc.Controller;
import javax.inject.Inject;
import play.data.FormFactory;

public class AbstractController extends Controller {
    
    private final FormFactory formFactory;

    @Inject
    public void ConstructorCreate(final FormFactory formFactory) {
        this.formFactory = formFactory;
    }
}