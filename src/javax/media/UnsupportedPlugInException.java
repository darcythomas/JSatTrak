// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UnsupportedPlugInException.java

package javax.media;


// Referenced classes of package javax.media:
//            MediaException

public class UnsupportedPlugInException extends MediaException
{

    public UnsupportedPlugInException()
    {
    }

    public UnsupportedPlugInException(String reason)
    {
        super(reason);
    }
}