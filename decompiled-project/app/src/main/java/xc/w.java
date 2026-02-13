package xc;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f26383c;

    /* renamed from: a, reason: collision with root package name */
    public final v f26384a;

    /* renamed from: b, reason: collision with root package name */
    public final v f26385b;

    static {
        v vVar = new v(-1, -1, -1);
        f26383c = new w(vVar, vVar);
    }

    public w(v vVar, v vVar2) {
        this.f26384a = vVar;
        this.f26385b = vVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f26384a.equals(wVar.f26384a)) {
            return this.f26385b.equals(wVar.f26385b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26384a, this.f26385b);
    }

    public final String toString() {
        return this.f26384a + "-" + this.f26385b;
    }
}
