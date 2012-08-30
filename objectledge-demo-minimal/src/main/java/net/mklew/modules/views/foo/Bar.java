package net.mklew.modules.views.foo;

import net.mklew.demo.Counter;

import org.objectledge.context.Context;
import org.objectledge.pipeline.ProcessingException;
import org.objectledge.templating.TemplatingContext;
import org.objectledge.web.mvc.builders.AbstractBuilder;

public class Bar
    extends AbstractBuilder
{
    private final Counter counter;

    public Bar(Context context, Counter counter)
    {
        super(context);
        this.counter = counter;
    }

    @Override
    public void process(TemplatingContext tCtx)
        throws ProcessingException
    {
        tCtx.put("counter", counter.get());
    }
}
