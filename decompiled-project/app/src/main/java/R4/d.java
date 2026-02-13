package R4;

import F.C0257a;
import android.util.SparseArray;
import m4.L;
import n5.AbstractC1705a;
import q3.s;
import s4.InterfaceC1982j;
import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public final class d implements InterfaceC1984l {

    /* renamed from: x, reason: collision with root package name */
    public static final C0257a f8859x = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1982j f8860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8861b;

    /* renamed from: c, reason: collision with root package name */
    public final L f8862c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f8863d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8864e;

    /* renamed from: f, reason: collision with root package name */
    public s f8865f;

    /* renamed from: u, reason: collision with root package name */
    public long f8866u;

    /* renamed from: v, reason: collision with root package name */
    public s4.s f8867v;

    /* renamed from: w, reason: collision with root package name */
    public L[] f8868w;

    public d(InterfaceC1982j interfaceC1982j, int i7, L l10) {
        this.f8860a = interfaceC1982j;
        this.f8861b = i7;
        this.f8862c = l10;
    }

    public final void a(s sVar, long j, long j10) {
        this.f8865f = sVar;
        this.f8866u = j10;
        boolean z8 = this.f8864e;
        InterfaceC1982j interfaceC1982j = this.f8860a;
        if (!z8) {
            interfaceC1982j.f(this);
            if (j != -9223372036854775807L) {
                interfaceC1982j.a(0L, j);
            }
            this.f8864e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC1982j.a(0L, j);
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f8863d;
            if (i7 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i7);
            if (sVar == null) {
                cVar.f8857e = cVar.f8855c;
            } else {
                cVar.f8858f = j10;
                v G9 = sVar.G(cVar.f8853a);
                cVar.f8857e = G9;
                L l10 = cVar.f8856d;
                if (l10 != null) {
                    G9.a(l10);
                }
            }
            i7++;
        }
    }

    @Override // s4.InterfaceC1984l
    public final void f() {
        SparseArray sparseArray = this.f8863d;
        L[] lArr = new L[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            L l10 = ((c) sparseArray.valueAt(i7)).f8856d;
            AbstractC1705a.n(l10);
            lArr[i7] = l10;
        }
        this.f8868w = lArr;
    }

    @Override // s4.InterfaceC1984l
    public final void i(s4.s sVar) {
        this.f8867v = sVar;
    }

    @Override // s4.InterfaceC1984l
    public final v u(int i7, int i10) {
        SparseArray sparseArray = this.f8863d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            AbstractC1705a.m(this.f8868w == null);
            cVar = new c(i7, i10, i10 == this.f8861b ? this.f8862c : null);
            s sVar = this.f8865f;
            long j = this.f8866u;
            if (sVar == null) {
                cVar.f8857e = cVar.f8855c;
            } else {
                cVar.f8858f = j;
                v G9 = sVar.G(i10);
                cVar.f8857e = G9;
                L l10 = cVar.f8856d;
                if (l10 != null) {
                    G9.a(l10);
                }
            }
            sparseArray.put(i7, cVar);
        }
        return cVar;
    }
}
