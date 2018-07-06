package com.example.administrator.connectweb;

import android.content.Context;
import android.graphics.Bitmap;

public class context {
    private Bitmap imageView;
    private String editname , editphome , editemail , editbirth;
    private Context c;

    public context(context c ,Bitmap imageView, String editname, String editphome, String editemail, String editbirth) {
        this.imageView = imageView;
        this.editname = editname;
        this.editphome = editphome;
        this.editemail = editemail;
        this.editbirth = editbirth;
    }

    public Bitmap getImageView() {
        return imageView;
    }

    public String getEditname() {
        return editname;
    }

    public String getEditphome() {
        return editphome;
    }

    public String getEditemail() {
        return editemail;
    }

    public String getEditbirth() {
        return editbirth;
    }
}
