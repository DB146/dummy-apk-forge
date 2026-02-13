package xb;

/* renamed from: xb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2275c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2274b f26321a = new Throwable("No further exceptions");

    public static NullPointerException a(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static RuntimeException b(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
