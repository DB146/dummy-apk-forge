package ac;

import java.nio.charset.Charset;

/* renamed from: ac.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0796a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f12815a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f12816b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f12817c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f12818d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Charset f12819e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile Charset f12820f;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.l.d(forName, "forName(...)");
        f12815a = forName;
        kotlin.jvm.internal.l.d(Charset.forName("UTF-16"), "forName(...)");
        Charset forName2 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.l.d(forName2, "forName(...)");
        f12816b = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.l.d(forName3, "forName(...)");
        f12817c = forName3;
        kotlin.jvm.internal.l.d(Charset.forName("US-ASCII"), "forName(...)");
        Charset forName4 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.l.d(forName4, "forName(...)");
        f12818d = forName4;
    }
}
