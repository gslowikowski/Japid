package japidviews.more.ContentNegotiation;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import static  japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static cn.bran.play.WebUtils.*;
//
// NOTE: This file was generated from: japidviews/more/ContentNegotiation/index.xml
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class index_xml extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/more/ContentNegotiation/index.xml";
{
	headers.put("Content-Type", "text/xml; charset=utf-8");
}
	public index_xml() {
		super(null);
	}
	public index_xml(StringBuilder out) {
		super(out);
	}
	public cn.bran.japid.template.RenderResult render() {
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
////// - add implicit variables 

		final Request request = Request.current(); assert request != null;

		final Response response = Response.current(); assert response != null;

		final Flash flash = Flash.current();assert flash != null;

		final Session session = Session.current();assert session != null;

		final RenderArgs renderArgs = RenderArgs.current(); assert renderArgs != null;

		final Params params = Params.current();assert params != null;

		final Validation validation = Validation.current();assert validation!= null;

		final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);assert errors != null;

		final play.Play _play = new play.Play(); assert _play != null;

////// - end of implicit variables 


//------
p("<format>\n");// line 1
p(request.format);// line 2
p("\n" + 
"</format>");// line 2

	}
}
