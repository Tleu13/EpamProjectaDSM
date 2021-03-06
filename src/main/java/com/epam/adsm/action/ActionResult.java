package com.epam.adsm.action;

public class ActionResult {

    private final String page;
    private boolean redirect;

    public ActionResult(String page, boolean redirect) {
        this.page = page;
        this.redirect = redirect;
    }

    public ActionResult(String page) {
        this.page = page;
    }
    public String getPage() {
        return page;
    }
    public boolean isRedirect(){ return  redirect;}
}
