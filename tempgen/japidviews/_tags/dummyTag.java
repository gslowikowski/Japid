package japidviews._tags;
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
import japidviews._javatags.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static cn.bran.play.WebUtils.*;
// NOTE: This file was generated from: japidviews/_tags/dummyTag.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class dummyTag extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/_tags/dummyTag.html";
static private final String static_0 = ""
;
static private final String static_1 = ""
;
static private final String static_2 = "Hi "
;
static private final String static_3 = "!\n" + 
"\n" + 
"";
	public dummyTag() {
		super(null);
	}
	public dummyTag(StringBuilder out) {
		super(out);
	}
	String a;
	public cn.bran.japid.template.RenderResult render(String a) {
		this.a = a;
		long t = -1;
		t = System.currentTimeMillis();
		super.layout();
		t = System.currentTimeMillis() - t;
		System.out.println("[dummyTag] rendering time: " + t);
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
p(static_1);// line 1
p(static_2);// line 2
p(a);// line 3
p(static_3);// line 3

	}
}
