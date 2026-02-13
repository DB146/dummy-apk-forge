package n4;

import P4.B;
import m4.K0;
import m4.L0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f21095a;

    /* renamed from: b, reason: collision with root package name */
    public int f21096b;

    /* renamed from: c, reason: collision with root package name */
    public long f21097c;

    /* renamed from: d, reason: collision with root package name */
    public final B f21098d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21099e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21100f;
    public final /* synthetic */ h g;

    public g(h hVar, String str, int i7, B b2) {
        this.g = hVar;
        this.f21095a = str;
        this.f21096b = i7;
        this.f21097c = b2 == null ? -1L : b2.f8160d;
        if (b2 == null || !b2.a()) {
            return;
        }
        this.f21098d = b2;
    }

    public final boolean a(C1703a c1703a) {
        B b2 = c1703a.f21073d;
        if (b2 == null) {
            return this.f21096b != c1703a.f21072c;
        }
        long j = this.f21097c;
        if (j == -1) {
            return false;
        }
        if (b2.f8160d > j) {
            return true;
        }
        B b10 = this.f21098d;
        if (b10 == null) {
            return false;
        }
        L0 l02 = c1703a.f21071b;
        int b11 = l02.b(b2.f8157a);
        int b12 = l02.b(b10.f8157a);
        if (b2.f8160d < b10.f8160d || b11 < b12) {
            return false;
        }
        if (b11 > b12) {
            return true;
        }
        boolean a9 = b2.a();
        int i7 = b10.f8158b;
        if (!a9) {
            int i10 = b2.f8161e;
            return i10 == -1 || i10 > i7;
        }
        int i11 = b2.f8158b;
        if (i11 > i7) {
            return true;
        }
        if (i11 == i7) {
            if (b2.f8159c > b10.f8159c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(L0 l02, L0 l03) {
        int i7 = this.f21096b;
        if (i7 < l02.o()) {
            h hVar = this.g;
            l02.n(i7, hVar.f21103a);
            K0 k02 = hVar.f21103a;
            for (int i10 = k02.f20016C; i10 <= k02.f20017D; i10++) {
                int b2 = l03.b(l02.l(i10));
                if (b2 != -1) {
                    i7 = l03.f(b2, hVar.f21104b, false).f19965c;
                    break;
                }
            }
            i7 = -1;
        }
        this.f21096b = i7;
        if (i7 == -1) {
            return false;
        }
        B b10 = this.f21098d;
        return b10 == null || l03.b(b10.f8157a) != -1;
    }
}
