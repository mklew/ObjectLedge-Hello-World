package net.mklew.modules.actions;

import net.mklew.demo.Counter;

import org.objectledge.context.Context;
import org.objectledge.pipeline.ProcessingException;
import org.objectledge.pipeline.Valve;

public class Count implements Valve
{
    private final Counter counter;

    public Count(Counter counter)
    {
        this.counter = counter;
    }
    
    @Override
    public void process(Context context)
        throws ProcessingException
    {
        counter.inc();
    }
}
