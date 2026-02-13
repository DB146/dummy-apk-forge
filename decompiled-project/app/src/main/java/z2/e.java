package z2;

import android.graphics.Color;
import java.util.Arrays;
import q1.AbstractC1875a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f28197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28199c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28200d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28201e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28202f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f28203h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f28204i;

    public e(int i7, int i10) {
        this.f28197a = Color.red(i7);
        this.f28198b = Color.green(i7);
        this.f28199c = Color.blue(i7);
        this.f28200d = i7;
        this.f28201e = i10;
    }

    public final void a() {
        if (this.f28202f) {
            return;
        }
        int i7 = this.f28200d;
        int e2 = AbstractC1875a.e(4.5f, -1, i7);
        int e10 = AbstractC1875a.e(3.0f, -1, i7);
        if (e2 != -1 && e10 != -1) {
            this.f28203h = AbstractC1875a.h(-1, e2);
            this.g = AbstractC1875a.h(-1, e10);
            this.f28202f = true;
            return;
        }
        int e11 = AbstractC1875a.e(4.5f, -16777216, i7);
        int e12 = AbstractC1875a.e(3.0f, -16777216, i7);
        if (e11 == -1 || e12 == -1) {
            this.f28203h = e2 != -1 ? AbstractC1875a.h(-1, e2) : AbstractC1875a.h(-16777216, e11);
            this.g = e10 != -1 ? AbstractC1875a.h(-1, e10) : AbstractC1875a.h(-16777216, e12);
            this.f28202f = true;
        } else {
            this.f28203h = AbstractC1875a.h(-16777216, e11);
            this.g = AbstractC1875a.h(-16777216, e12);
            this.f28202f = true;
        }
    }

    public final float[] b() {
        if (this.f28204i == null) {
            this.f28204i = new float[3];
        }
        AbstractC1875a.a(this.f28197a, this.f28198b, this.f28199c, this.f28204i);
        return this.f28204i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f28201e == eVar.f28201e && this.f28200d == eVar.f28200d;
    }

    public final int hashCode() {
        return (this.f28200d * 31) + this.f28201e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(e.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.f28200d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f28201e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.f28203h));
        sb2.append(']');
        return sb2.toString();
    }
}
