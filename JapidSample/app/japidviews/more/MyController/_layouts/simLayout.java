package japidviews.more.MyController._layouts;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static cn.bran.play.WebUtils.*;
import japidviews._layouts.*;
import static japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/more/MyController/_layouts/simLayout.html
// Change to this file will be lost next time the template file is compiled.
//

@cn.bran.play.NoEnhance
public abstract class simLayout extends
		cn.bran.japid.template.JapidTemplateBase {
	public static final String sourceTemplate = "japidviews/more/MyController/_layouts/simLayout.html";
	{
		headers.put("Content-Type", "text/html; charset=utf-8");
	}

	public simLayout() {
		super(null);
	}

	public simLayout(StringBuilder out) {
		super(out);
	}

	@Override
	public void layout() {
		// - add implicit variables 

		final Request request = Request.current();
		assert request != null;

		final Response response = Response.current();
		assert response != null;

		final Flash flash = Flash.current();
		assert flash != null;

		final Session session = Session.current();
		assert session != null;

		final RenderArgs renderArgs = RenderArgs.current();
		assert renderArgs != null;

		final Params params = Params.current();
		assert params != null;

		final Validation validation = Validation.current();
		assert validation != null;

		final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(
				validation);
		assert errors != null;

		final play.Play _play = new play.Play();
		assert _play != null;

		// - end of implicit variables 

		p("The simplest layout\n" +
				"\n");// line 1
		doLayout();// line 3
	}

	protected abstract void doLayout();
}
