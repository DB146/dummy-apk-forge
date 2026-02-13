package y1;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import q1.C1876b;

/* loaded from: classes.dex */
public class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f26725b;

    /* renamed from: a, reason: collision with root package name */
    public final p0 f26726a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f26725b = (i7 >= 34 ? new e0() : i7 >= 30 ? new d0() : i7 >= 29 ? new c0() : new b0()).b().f26731a.a().f26731a.b().f26731a.c();
    }

    public m0(p0 p0Var) {
        this.f26726a = p0Var;
    }

    public p0 a() {
        return this.f26726a;
    }

    public p0 b() {
        return this.f26726a;
    }

    public p0 c() {
        return this.f26726a;
    }

    public void d(View view) {
    }

    public void e(p0 p0Var) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return p() == m0Var.p() && o() == m0Var.o() && Objects.equals(l(), m0Var.l()) && Objects.equals(j(), m0Var.j()) && Objects.equals(f(), m0Var.f());
    }

    public C2361i f() {
        return null;
    }

    public C1876b g(int i7) {
        return C1876b.f23340e;
    }

    public C1876b h(int i7) {
        if ((i7 & 8) == 0) {
            return C1876b.f23340e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public C1876b i() {
        return l();
    }

    public C1876b j() {
        return C1876b.f23340e;
    }

    public C1876b k() {
        return l();
    }

    public C1876b l() {
        return C1876b.f23340e;
    }

    public C1876b m() {
        return l();
    }

    public p0 n(int i7, int i10, int i11, int i12) {
        return f26725b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i7) {
        return true;
    }

    public void r(C1876b[] c1876bArr) {
    }

    public void s(C1876b c1876b) {
    }

    public void t(p0 p0Var) {
    }

    public void u(C1876b c1876b) {
    }

    public void v(int i7) {
    }
}
