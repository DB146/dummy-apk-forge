package v9;

import kotlin.jvm.internal.l;
import w9.C2225a;

/* renamed from: v9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2156a {

    /* renamed from: a, reason: collision with root package name */
    public final C2225a f25261a;

    public C2156a(C2225a c2225a) {
        this.f25261a = c2225a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2156a) && l.a(this.f25261a, ((C2156a) obj).f25261a);
    }

    public final int hashCode() {
        return this.f25261a.hashCode();
    }

    public final String toString() {
        return "AppUpdateInteractor(checkUpdate=" + this.f25261a + ")";
    }
}
