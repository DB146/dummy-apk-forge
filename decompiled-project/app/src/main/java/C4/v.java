package C4;

import android.view.View;
import java.util.Arrays;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2873a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f2874b;

    /* renamed from: c, reason: collision with root package name */
    public int f2875c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2876d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2877e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2878f;

    public v() {
        f();
    }

    public v(int i7) {
        this.f2874b = i7;
        byte[] bArr = new byte[131];
        this.f2878f = bArr;
        bArr[2] = 1;
    }

    public void a(int i7, byte[] bArr, int i10) {
        if (this.f2876d) {
            int i11 = i10 - i7;
            byte[] bArr2 = (byte[]) this.f2878f;
            int length = bArr2.length;
            int i12 = this.f2875c;
            if (length < i12 + i11) {
                this.f2878f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i7, (byte[]) this.f2878f, this.f2875c, i11);
            this.f2875c += i11;
        }
    }

    public void b() {
        this.f2875c = this.f2876d ? ((H2.E) this.f2878f).i() : ((H2.E) this.f2878f).m();
    }

    public void c(View view, int i7) {
        if (this.f2876d) {
            this.f2875c = ((H2.E) this.f2878f).o() + ((H2.E) this.f2878f).d(view);
        } else {
            this.f2875c = ((H2.E) this.f2878f).g(view);
        }
        this.f2874b = i7;
    }

    public void d(View view, int i7) {
        int o10 = ((H2.E) this.f2878f).o();
        if (o10 >= 0) {
            c(view, i7);
            return;
        }
        this.f2874b = i7;
        if (!this.f2876d) {
            int g = ((H2.E) this.f2878f).g(view);
            int m10 = g - ((H2.E) this.f2878f).m();
            this.f2875c = g;
            if (m10 > 0) {
                int i10 = (((H2.E) this.f2878f).i() - Math.min(0, (((H2.E) this.f2878f).i() - o10) - ((H2.E) this.f2878f).d(view))) - (((H2.E) this.f2878f).e(view) + g);
                if (i10 < 0) {
                    this.f2875c -= Math.min(m10, -i10);
                    return;
                }
                return;
            }
            return;
        }
        int i11 = (((H2.E) this.f2878f).i() - o10) - ((H2.E) this.f2878f).d(view);
        this.f2875c = ((H2.E) this.f2878f).i() - i11;
        if (i11 > 0) {
            int e2 = this.f2875c - ((H2.E) this.f2878f).e(view);
            int m11 = ((H2.E) this.f2878f).m();
            int min = e2 - (Math.min(((H2.E) this.f2878f).g(view) - m11, 0) + m11);
            if (min < 0) {
                this.f2875c = Math.min(i11, -min) + this.f2875c;
            }
        }
    }

    public boolean e(int i7) {
        if (!this.f2876d) {
            return false;
        }
        this.f2875c -= i7;
        this.f2876d = false;
        this.f2877e = true;
        return true;
    }

    public final void f() {
        switch (this.f2873a) {
            case 0:
                this.f2876d = false;
                this.f2877e = false;
                return;
            default:
                this.f2874b = -1;
                this.f2875c = Integer.MIN_VALUE;
                this.f2876d = false;
                this.f2877e = false;
                return;
        }
    }

    public void g(int i7) {
        AbstractC1705a.m(!this.f2876d);
        boolean z8 = i7 == this.f2874b;
        this.f2876d = z8;
        if (z8) {
            this.f2875c = 3;
            this.f2877e = false;
        }
    }

    public String toString() {
        switch (this.f2873a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.f2874b + ", mCoordinate=" + this.f2875c + ", mLayoutFromEnd=" + this.f2876d + ", mValid=" + this.f2877e + '}';
            default:
                return super.toString();
        }
    }
}
