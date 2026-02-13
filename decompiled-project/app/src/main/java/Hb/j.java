package Hb;

import java.io.Serializable;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f4919a = new Object();

    @Override // Hb.i
    public final Object fold(Object obj, Rb.e eVar) {
        return obj;
    }

    @Override // Hb.i
    public final g get(h key) {
        l.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // Hb.i
    public final i minusKey(h key) {
        l.e(key, "key");
        return this;
    }

    @Override // Hb.i
    public final i plus(i context) {
        l.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
