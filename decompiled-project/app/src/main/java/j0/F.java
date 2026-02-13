package j0;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class F extends AbstractC1362A {

    /* renamed from: e, reason: collision with root package name */
    public final long f18525e;

    public F(long j) {
        this.f18525e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return n.c(this.f18525e, ((F) obj).f18525e);
        }
        return false;
    }

    @Override // j0.AbstractC1362A
    public final void f(float f4, long j, E5.o oVar) {
        oVar.b(1.0f);
        long j10 = this.f18525e;
        if (f4 != 1.0f) {
            j10 = n.b(j10, n.d(j10) * f4);
        }
        oVar.d(j10);
        if (((Shader) oVar.f3714c) != null) {
            oVar.f3714c = null;
            ((Paint) oVar.f3713b).setShader(null);
        }
    }

    public final int hashCode() {
        int i7 = n.f18553h;
        return Long.hashCode(this.f18525e);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) n.i(this.f18525e)) + ')';
    }
}
