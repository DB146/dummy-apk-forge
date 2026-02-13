package Ma;

import J1.k;

/* loaded from: classes2.dex */
public final class a extends k {

    /* renamed from: C, reason: collision with root package name */
    public long f6921C;

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f6921C = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f6921C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f6921C = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
