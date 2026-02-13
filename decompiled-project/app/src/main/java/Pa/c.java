package Pa;

import Q5.e;
import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: d, reason: collision with root package name */
    public final String f8264d;

    public c(String str) {
        this.f8264d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && l.a(this.f8264d, ((c) obj).f8264d);
    }

    public final int hashCode() {
        return this.f8264d.hashCode();
    }

    public final String toString() {
        return o.p(new StringBuilder("VoiceResult(string="), this.f8264d, ")");
    }
}
