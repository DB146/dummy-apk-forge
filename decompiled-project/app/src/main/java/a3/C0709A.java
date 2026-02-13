package a3;

import Y5.C0660y;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0709A extends u {

    /* renamed from: U, reason: collision with root package name */
    public int f12494U;

    /* renamed from: S, reason: collision with root package name */
    public ArrayList f12492S = new ArrayList();

    /* renamed from: T, reason: collision with root package name */
    public boolean f12493T = true;

    /* renamed from: V, reason: collision with root package name */
    public boolean f12495V = false;

    /* renamed from: W, reason: collision with root package name */
    public int f12496W = 0;

    @Override // a3.u
    public final void A() {
        this.L = 0L;
        int i7 = 0;
        z zVar = new z(this, i7);
        while (i7 < this.f12492S.size()) {
            u uVar = (u) this.f12492S.get(i7);
            uVar.a(zVar);
            uVar.A();
            long j = uVar.L;
            if (this.f12493T) {
                this.L = Math.max(this.L, j);
            } else {
                long j10 = this.L;
                uVar.f12586N = j10;
                this.L = j10 + j;
            }
            i7++;
        }
    }

    @Override // a3.u
    public final u B(s sVar) {
        super.B(sVar);
        return this;
    }

    @Override // a3.u
    public final void C(View view) {
        for (int i7 = 0; i7 < this.f12492S.size(); i7++) {
            ((u) this.f12492S.get(i7)).C(view);
        }
        this.f12592f.remove(view);
    }

    @Override // a3.u
    public final void D(View view) {
        super.D(view);
        int size = this.f12492S.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((u) this.f12492S.get(i7)).D(view);
        }
    }

    @Override // a3.u
    public final void E() {
        if (this.f12492S.isEmpty()) {
            M();
            n();
            return;
        }
        z zVar = new z();
        zVar.f12607b = this;
        Iterator it = this.f12492S.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(zVar);
        }
        this.f12494U = this.f12492S.size();
        if (this.f12493T) {
            Iterator it2 = this.f12492S.iterator();
            while (it2.hasNext()) {
                ((u) it2.next()).E();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f12492S.size(); i7++) {
            ((u) this.f12492S.get(i7 - 1)).a(new z((u) this.f12492S.get(i7), 2));
        }
        u uVar = (u) this.f12492S.get(0);
        if (uVar != null) {
            uVar.E();
        }
    }

    @Override // a3.u
    public final void F(long j, long j10) {
        long j11 = this.L;
        if (this.f12595w != null) {
            if (j < 0 && j10 < 0) {
                return;
            }
            if (j > j11 && j10 > j11) {
                return;
            }
        }
        boolean z8 = j < j10;
        if ((j >= 0 && j10 < 0) || (j <= j11 && j10 > j11)) {
            this.f12579F = false;
            y(this, t.f12565l, z8);
        }
        if (this.f12493T) {
            for (int i7 = 0; i7 < this.f12492S.size(); i7++) {
                ((u) this.f12492S.get(i7)).F(j, j10);
            }
        } else {
            int i10 = 1;
            while (true) {
                if (i10 >= this.f12492S.size()) {
                    i10 = this.f12492S.size();
                    break;
                } else if (((u) this.f12492S.get(i10)).f12586N > j10) {
                    break;
                } else {
                    i10++;
                }
            }
            int i11 = i10 - 1;
            if (j >= j10) {
                while (i11 < this.f12492S.size()) {
                    u uVar = (u) this.f12492S.get(i11);
                    long j12 = uVar.f12586N;
                    int i12 = i11;
                    long j13 = j - j12;
                    if (j13 < 0) {
                        break;
                    }
                    uVar.F(j13, j10 - j12);
                    i11 = i12 + 1;
                }
            } else {
                while (i11 >= 0) {
                    u uVar2 = (u) this.f12492S.get(i11);
                    long j14 = uVar2.f12586N;
                    long j15 = j - j14;
                    uVar2.F(j15, j10 - j14);
                    if (j15 >= 0) {
                        break;
                    } else {
                        i11--;
                    }
                }
            }
        }
        if (this.f12595w != null) {
            if ((j <= j11 || j10 > j11) && (j >= 0 || j10 < 0)) {
                return;
            }
            if (j > j11) {
                this.f12579F = true;
            }
            y(this, t.f12566m, z8);
        }
    }

    @Override // a3.u
    public final void G(long j) {
        ArrayList arrayList;
        this.f12589c = j;
        if (j < 0 || (arrayList = this.f12492S) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((u) this.f12492S.get(i7)).G(j);
        }
    }

    @Override // a3.u
    public final void H(Z9.x xVar) {
        this.f12583J = xVar;
        this.f12496W |= 8;
        int size = this.f12492S.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((u) this.f12492S.get(i7)).H(xVar);
        }
    }

    @Override // a3.u
    public final void I(TimeInterpolator timeInterpolator) {
        this.f12496W |= 1;
        ArrayList arrayList = this.f12492S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((u) this.f12492S.get(i7)).I(timeInterpolator);
            }
        }
        this.f12590d = timeInterpolator;
    }

    @Override // a3.u
    public final void J(C0660y c0660y) {
        super.J(c0660y);
        this.f12496W |= 4;
        if (this.f12492S != null) {
            for (int i7 = 0; i7 < this.f12492S.size(); i7++) {
                ((u) this.f12492S.get(i7)).J(c0660y);
            }
        }
    }

    @Override // a3.u
    public final void K() {
        this.f12496W |= 2;
        int size = this.f12492S.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((u) this.f12492S.get(i7)).K();
        }
    }

    @Override // a3.u
    public final void L(long j) {
        this.f12588b = j;
    }

    @Override // a3.u
    public final String N(String str) {
        String N10 = super.N(str);
        for (int i7 = 0; i7 < this.f12492S.size(); i7++) {
            StringBuilder n6 = A3.c.n(N10, "\n");
            n6.append(((u) this.f12492S.get(i7)).N(str + "  "));
            N10 = n6.toString();
        }
        return N10;
    }

    public final void O(u uVar) {
        this.f12492S.add(uVar);
        uVar.f12595w = this;
        long j = this.f12589c;
        if (j >= 0) {
            uVar.G(j);
        }
        if ((this.f12496W & 1) != 0) {
            uVar.I(this.f12590d);
        }
        if ((this.f12496W & 2) != 0) {
            uVar.K();
        }
        if ((this.f12496W & 4) != 0) {
            uVar.J(this.f12584K);
        }
        if ((this.f12496W & 8) != 0) {
            uVar.H(this.f12583J);
        }
    }

    public final u P(int i7) {
        if (i7 < 0 || i7 >= this.f12492S.size()) {
            return null;
        }
        return (u) this.f12492S.get(i7);
    }

    @Override // a3.u
    public final void b(View view) {
        for (int i7 = 0; i7 < this.f12492S.size(); i7++) {
            ((u) this.f12492S.get(i7)).b(view);
        }
        this.f12592f.add(view);
    }

    @Override // a3.u
    public final void d() {
        super.d();
        int size = this.f12492S.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((u) this.f12492S.get(i7)).d();
        }
    }

    @Override // a3.u
    public final void e(C0712D c0712d) {
        if (w(c0712d.f12499b)) {
            Iterator it = this.f12492S.iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (uVar.w(c0712d.f12499b)) {
                    uVar.e(c0712d);
                    c0712d.f12500c.add(uVar);
                }
            }
        }
    }

    @Override // a3.u
    public final void g(C0712D c0712d) {
        int size = this.f12492S.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((u) this.f12492S.get(i7)).g(c0712d);
        }
    }

    @Override // a3.u
    public final void h(C0712D c0712d) {
        if (w(c0712d.f12499b)) {
            Iterator it = this.f12492S.iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (uVar.w(c0712d.f12499b)) {
                    uVar.h(c0712d);
                    c0712d.f12500c.add(uVar);
                }
            }
        }
    }

    @Override // a3.u
    /* renamed from: k */
    public final u clone() {
        C0709A c0709a = (C0709A) super.clone();
        c0709a.f12492S = new ArrayList();
        int size = this.f12492S.size();
        for (int i7 = 0; i7 < size; i7++) {
            u clone = ((u) this.f12492S.get(i7)).clone();
            c0709a.f12492S.add(clone);
            clone.f12595w = c0709a;
        }
        return c0709a;
    }

    @Override // a3.u
    public final void m(ViewGroup viewGroup, q3.n nVar, q3.n nVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f12588b;
        int size = this.f12492S.size();
        for (int i7 = 0; i7 < size; i7++) {
            u uVar = (u) this.f12492S.get(i7);
            if (j > 0 && (this.f12493T || i7 == 0)) {
                long j10 = uVar.f12588b;
                if (j10 > 0) {
                    uVar.L(j10 + j);
                } else {
                    uVar.L(j);
                }
            }
            uVar.m(viewGroup, nVar, nVar2, arrayList, arrayList2);
        }
    }

    @Override // a3.u
    public final boolean t() {
        for (int i7 = 0; i7 < this.f12492S.size(); i7++) {
            if (((u) this.f12492S.get(i7)).t()) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.u
    public final boolean u() {
        int size = this.f12492S.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((u) this.f12492S.get(i7)).u()) {
                return false;
            }
        }
        return true;
    }

    @Override // a3.u
    public final void z(ViewGroup viewGroup) {
        super.z(viewGroup);
        int size = this.f12492S.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((u) this.f12492S.get(i7)).z(viewGroup);
        }
    }
}
