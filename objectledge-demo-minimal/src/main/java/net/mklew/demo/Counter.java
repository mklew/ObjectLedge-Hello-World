package net.mklew.demo;

import javax.servlet.http.HttpSession;

import org.objectledge.context.Context;
import org.objectledge.web.HttpContext;

public class Counter
{
    private static final String SESSION_KEY = "net.mklew.demo.Counter";

    private final Context context;

    public Counter(Context context)
    {
        this.context = context;
    }
    
    public int get()
    {
        Integer current = (Integer)session().getAttribute(SESSION_KEY);
        if(current == null)
        {
            current = Integer.valueOf(0);
        }
        return current.intValue();
    }

    public void inc()
    {
        int next = get() + 1;
        session().setAttribute(SESSION_KEY, Integer.valueOf(next));
    }

    private HttpSession session()
    {
        HttpContext httpContext = context.getAttribute(HttpContext.class);
        return httpContext.getRequest().getSession();
    }
}
