package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15705a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f15706b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f15706b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw C.f();
        } catch (C e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static AbstractC1028w c(Object obj, Object obj2) {
        AbstractC1028w abstractC1028w = (AbstractC1028w) ((AbstractC1007a) obj);
        AbstractC1026u abstractC1026u = (AbstractC1026u) abstractC1028w.f(5);
        abstractC1026u.d(abstractC1028w);
        AbstractC1007a abstractC1007a = (AbstractC1007a) obj2;
        if (!abstractC1026u.f15818a.getClass().isInstance(abstractC1007a)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC1026u.d((AbstractC1028w) abstractC1007a);
        return abstractC1026u.b();
    }
}
