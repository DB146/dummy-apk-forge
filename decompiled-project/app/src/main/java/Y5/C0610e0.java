package Y5;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Objects;

/* renamed from: Y5.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610e0 implements n5.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11722a;

    /* renamed from: b, reason: collision with root package name */
    public long f11723b;

    /* renamed from: c, reason: collision with root package name */
    public long f11724c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11725d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11726e;

    public C0610e0(C0613f0 c0613f0, String str, long j) {
        Objects.requireNonNull(c0613f0);
        this.f11726e = c0613f0;
        com.google.android.gms.common.internal.G.d(str);
        this.f11725d = str;
        this.f11723b = j;
    }

    public C0610e0(n5.x xVar) {
        this.f11725d = xVar;
        this.f11726e = m4.s0.f20500d;
    }

    @Override // n5.n
    public m4.s0 a() {
        return (m4.s0) this.f11726e;
    }

    @Override // n5.n
    public void b(m4.s0 s0Var) {
        if (this.f11722a) {
            c(d());
        }
        this.f11726e = s0Var;
    }

    public void c(long j) {
        this.f11723b = j;
        if (this.f11722a) {
            ((n5.x) this.f11725d).getClass();
            this.f11724c = SystemClock.elapsedRealtime();
        }
    }

    @Override // n5.n
    public long d() {
        long j = this.f11723b;
        if (!this.f11722a) {
            return j;
        }
        ((n5.x) this.f11725d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11724c;
        return j + (((m4.s0) this.f11726e).f20501a == 1.0f ? n5.D.M(elapsedRealtime) : elapsedRealtime * r4.f20503c);
    }

    public void e() {
        if (this.f11722a) {
            return;
        }
        ((n5.x) this.f11725d).getClass();
        this.f11724c = SystemClock.elapsedRealtime();
        this.f11722a = true;
    }

    public long f() {
        if (!this.f11722a) {
            this.f11722a = true;
            this.f11724c = ((C0613f0) this.f11726e).N().getLong((String) this.f11725d, this.f11723b);
        }
        return this.f11724c;
    }

    public void g(long j) {
        SharedPreferences.Editor edit = ((C0613f0) this.f11726e).N().edit();
        edit.putLong((String) this.f11725d, j);
        edit.apply();
        this.f11724c = j;
    }
}
