package tss.t.securelib;

/* loaded from: classes2.dex */
public final class VtvUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final VtvUtils f24560a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tss.t.securelib.VtvUtils] */
    static {
        System.loadLibrary("securelib");
    }

    public final native String getLinkLive(String str, boolean z8);
}
