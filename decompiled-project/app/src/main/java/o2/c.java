package o2;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f21663a = new LinkedHashMap();

    public abstract Object a(InterfaceC1780b interfaceC1780b);

    public final boolean equals(Object obj) {
        return (obj instanceof c) && l.a(this.f21663a, ((c) obj).f21663a);
    }

    public final int hashCode() {
        return this.f21663a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f21663a + ')';
    }
}
