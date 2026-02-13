package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0819w {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f13467a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f13468b;

    static {
        Charset.forName("US-ASCII");
        f13467a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f13468b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0805h(bArr, 0, 0, false).i(0);
        } catch (C0821y e2) {
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
}
