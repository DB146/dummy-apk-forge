package D3;

import W3.o;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final e f3190a;

    /* renamed from: b, reason: collision with root package name */
    public int f3191b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f3192c;

    public j(e eVar) {
        this.f3190a = eVar;
    }

    @Override // D3.h
    public final void a() {
        this.f3190a.u(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f3191b == jVar.f3191b && o.b(this.f3192c, jVar.f3192c);
    }

    public final int hashCode() {
        int i7 = this.f3191b * 31;
        Bitmap.Config config = this.f3192c;
        return i7 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return k.c(this.f3191b, this.f3192c);
    }
}
