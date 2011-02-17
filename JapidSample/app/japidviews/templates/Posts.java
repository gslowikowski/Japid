package japidviews.templates;

import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import models.japidsample.Post;
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
// NOTE: This file was generated from: japidviews/templates/Posts.html
// Change to this file will be lost next time the template file is compiled.
//

@cn.bran.play.NoEnhance
public class Posts extends cn.bran.japid.template.JapidTemplateBase {
	public static final String sourceTemplate = "japidviews/templates/Posts.html";
	{
		headers.put("Content-Type", "text/html; charset=utf-8");
	}

	public Posts() {
		super(null);
	}

	public Posts(StringBuilder out) {
		super(out);
	}

	private String blogTitle;
	private List<Post> allPost;

	public cn.bran.japid.template.RenderResult render(String blogTitle,
			List<Post> allPost) {
		this.blogTitle = blogTitle;
		this.allPost = allPost;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResult(this.headers, getOut(),
				t);
	}

	@Override
	protected void doLayout() {

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

		//------
		for (Post post : allPost) { // line 4
			p("	- title: ");// line 4
			p(post.title);// line 5
			p("	- date: ");// line 5
			p(post.postedAt);// line 6
			p("	- author ");// line 6
			p(post.author.name);// line 7
			p(" ");// line 7
			p(post.author.gender);// line 7
			p("	the real title: 你好\n");// line 7
		}// line 9

	}

}
