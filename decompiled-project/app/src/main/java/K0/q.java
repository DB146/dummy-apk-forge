package K0;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final long f5933a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5934b = 0;

    static {
        V0.o[] oVarArr = V0.n.f9986b;
        f5933a = V0.n.f9987c;
    }

    public static final p a(p pVar, int i7, int i10, long j, U0.r rVar, r rVar2, U0.i iVar, int i11, int i12, U0.t tVar) {
        int i13 = i7;
        int i14 = i10;
        long j10 = j;
        U0.r rVar3 = rVar;
        r rVar4 = rVar2;
        U0.i iVar2 = iVar;
        int i15 = i11;
        int i16 = i12;
        U0.t tVar2 = tVar;
        if (U0.k.a(i13, Integer.MIN_VALUE) || U0.k.a(i13, pVar.f5925a)) {
            V0.o[] oVarArr = V0.n.f9986b;
            if (((j10 & 1095216660480L) == 0 || V0.n.a(j10, pVar.f5927c)) && ((rVar3 == null || rVar3.equals(pVar.f5928d)) && ((U0.m.a(i14, Integer.MIN_VALUE) || U0.m.a(i14, pVar.f5926b)) && ((rVar4 == null || rVar4.equals(pVar.f5929e)) && ((iVar2 == null || iVar2.equals(pVar.f5930f)) && ((i15 == 0 || i15 == pVar.g) && ((U0.d.a(i16, Integer.MIN_VALUE) || U0.d.a(i16, pVar.f5931h)) && (tVar2 == null || tVar2.equals(pVar.f5932i))))))))) {
                return pVar;
            }
        }
        V0.o[] oVarArr2 = V0.n.f9986b;
        if ((j10 & 1095216660480L) == 0) {
            j10 = pVar.f5927c;
        }
        if (rVar3 == null) {
            rVar3 = pVar.f5928d;
        }
        if (U0.k.a(i13, Integer.MIN_VALUE)) {
            i13 = pVar.f5925a;
        }
        if (U0.m.a(i14, Integer.MIN_VALUE)) {
            i14 = pVar.f5926b;
        }
        r rVar5 = pVar.f5929e;
        if (rVar5 != null && rVar4 == null) {
            rVar4 = rVar5;
        }
        if (iVar2 == null) {
            iVar2 = pVar.f5930f;
        }
        if (i15 == 0) {
            i15 = pVar.g;
        }
        if (U0.d.a(i16, Integer.MIN_VALUE)) {
            i16 = pVar.f5931h;
        }
        if (tVar2 == null) {
            tVar2 = pVar.f5932i;
        }
        return new p(i13, i14, j10, rVar3, rVar4, iVar2, i15, i16, tVar2);
    }
}
