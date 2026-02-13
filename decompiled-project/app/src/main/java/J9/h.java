package J9;

import J1.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class h extends k {

    /* renamed from: C, reason: collision with root package name */
    public final TextView f5758C;

    /* renamed from: D, reason: collision with root package name */
    public J1.f f5759D;

    /* renamed from: E, reason: collision with root package name */
    public String f5760E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f5761F;

    /* renamed from: G, reason: collision with root package name */
    public long f5762G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view) {
        super(null, view, 1);
        Object[] h10 = k.h(view, 3, null, null);
        TextView textView = (TextView) h10[2];
        this.f5758C = textView;
        this.f5762G = -1L;
        this.f5758C.setTag(null);
        ((LinearLayout) h10[0]).setTag(null);
        TextView textView2 = (TextView) h10[1];
        this.f5761F = textView2;
        textView2.setTag(null);
        k(view);
        f();
    }

    @Override // J1.k
    public final void b() {
        long j;
        synchronized (this) {
            j = this.f5762G;
            this.f5762G = 0L;
        }
        String str = this.f5760E;
        J1.f fVar = this.f5759D;
        long j10 = 6 & j;
        long j11 = j & 5;
        String str2 = (j11 == 0 || fVar == null) ? null : fVar.f5417b;
        if (j11 != 0) {
            Q5.e.Q(this.f5758C, str2);
        }
        if (j10 != 0) {
            Q5.e.Q(this.f5761F, str);
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f5762G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f5762G = 4L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        if (i7 != 0) {
            return false;
        }
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5762G |= 1;
        }
        return true;
    }

    public final void m(String str) {
        this.f5760E = str;
        synchronized (this) {
            this.f5762G |= 2;
        }
        a(2);
        j();
    }
}
