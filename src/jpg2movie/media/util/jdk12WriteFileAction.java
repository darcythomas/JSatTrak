// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   jdk12WriteFileAction.java

package jpg2movie.media.util;

import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.security.PrivilegedAction;

public class jdk12WriteFileAction
    implements PrivilegedAction
{

    public jdk12WriteFileAction(String name)
    {
        try
        {
            this.name = name;
        }
        catch(Throwable e) { }
    }

    public Object run()
    {
        try
        {
            return new FileOutputStream(name);
        }
        catch(Throwable t)
        {
            return null;
        }
    }

    static Class _mthclass$(String x0)
    {
        try
        {
            return Class.forName(x0);
        }
        catch(ClassNotFoundException x1)
        {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }

    public static Constructor cons;
    private String name;

    static 
    {
        try
        {
            cons = (jpg2movie.media.util.jdk12WriteFileAction.class).getConstructor(new Class[] {
                java.lang.String.class
            });
        }
        catch(Throwable e) { }
    }
}