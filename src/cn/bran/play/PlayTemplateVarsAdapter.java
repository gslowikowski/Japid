package cn.bran.play;


import java.util.Collection;
import java.util.List;

import cn.bran.japid.util.FlashScope;
import cn.bran.japid.util.UrlMapper;

import play.i18n.Messages;
import play.mvc.Scope.Flash;

/**
 * offer wrappers to the Play! built-in varaibles avaible for templates
 * 
 * a bunch of wrappers are used for mainly read access to the Play!'s
 * components.
 * 
 * @author bran
 * 
 */
public class PlayTemplateVarsAdapter {
	public static FlashScope flash = new FlashWrapper();
	public static ParamsWrapper params = new ParamsWrapper();
	public static RenderArgsWrapper renderArgs = new RenderArgsWrapper();
	private static RouteAdapter urlMapper = new RouteAdapter();
	private static Messages messages = new Messages();

	// Note, the {@code JavaExtensions} class in Play! has lots of formatting methods
	public static String numOf(Collection c) {
		if (c == null)
			return "no";
		else
			return String.valueOf(c.size());
	}
	
	/**
	 * TODO: move out
	 * @param o
	 * @return
	 */
	public static boolean asBoolean(Object o) {
		if (o == null)
			return false;
		
		boolean r = false;

		if (o instanceof Boolean) {
			r = (Boolean) o;
		} else if (o instanceof Integer) {
			Integer n = (Integer) o;
			r = n != 0 ? true : false;
		}
		else if (o instanceof Collection){
			Collection col = ((Collection)o);
			if (col.size() > 0)
				return true;
			else
				return false;
		}
//		else if ()
		else {
			// TODO more
			r = o != null ? true : false;
		}

		return r;
	}


	/**
	 * this one is more generic and connected to Play!
	 * 
	 * @param k
	 * @return
	 */
	public static Object renderArg(String k) {
		return renderArgs.get(k);
	}

	/**
	 * get the last item from a list
	 * 
	 * @param list
	 * @return
	 */
	public static <T> T lastOf(List<T> list) {
		if (list.size() == 0)
			return null;
		return list.get(list.size() - 1);
	}

	public static Flash flash() {
		return Flash.current();
	}

	/**
	 * map an action to an absolute url
	 * 
	 * @param action
	 *            the controller.action part of the whole string
	 * @param args
	 *            : the argument list, each thereof is a result of an expression
	 *            evaluation meaning the name of the param is not kept
	 * 
	 * @param action
	 * @return
	 */
	public static String lookupAbs(String action, Object... args) {
		return urlMapper.lookupAbs(action, args);
	}

	public static String lookup(String action, Object... args) {
		return urlMapper.lookup(action, args);
	}

	/**
	 * lookup a static resource
	 * @param action
	 * @param args
	 * @return
	 */
	public static String lookupStaticAbs(String action) {
		return urlMapper.lookupStaticAbs(action);
	}
	
	public static String lookupStatic(String action) {
		return urlMapper.lookupStatic(action);
	}

	public static String getMessage(String msgName, Object... params) {
		return messages.get(msgName, params);
	}
}