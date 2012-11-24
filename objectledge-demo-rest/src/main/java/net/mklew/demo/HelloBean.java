package net.mklew.demo;

/**
 * @author Marek Lewandowski <marek.m.lewandowski@gmail.com>
 * @since 11/9/12
 *        Time: 8:17 PM
 */
public class HelloBean implements Hello
{

    @Override
    public String sayHello()
    {
        return "Hello World from bean provided by pico container to jersey";
    }
}
