package h3;

import android.net.Uri;

/* renamed from: h3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f17680a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17681b;

    public C1242d(boolean z8, Uri uri) {
        this.f17680a = uri;
        this.f17681b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1242d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C1242d c1242d = (C1242d) obj;
        return kotlin.jvm.internal.l.a(this.f17680a, c1242d.f17680a) && this.f17681b == c1242d.f17681b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17681b) + (this.f17680a.hashCode() * 31);
    }
}
