package I2;

/* loaded from: classes.dex */
public final class a0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0329s[] f5118a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f5119b;

    /* renamed from: c, reason: collision with root package name */
    public M f5120c;

    /* renamed from: d, reason: collision with root package name */
    public int f5121d;

    /* renamed from: e, reason: collision with root package name */
    public int f5122e;

    /* renamed from: f, reason: collision with root package name */
    public int f5123f;

    /* renamed from: u, reason: collision with root package name */
    public int f5124u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ EnumC0329s[] f5125v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f5126w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ M f5127x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(EnumC0329s[] enumC0329sArr, c0 c0Var, M m10, Hb.d dVar) {
        super(2, dVar);
        this.f5125v = enumC0329sArr;
        this.f5126w = c0Var;
        this.f5127x = m10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new a0(this.f5125v, this.f5126w, this.f5127x, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((K2.r) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:10:0x0077). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        int i7;
        M m10;
        EnumC0329s[] enumC0329sArr;
        int i10;
        c0 c0Var;
        Ib.a aVar = Ib.a.f5345a;
        int i11 = this.f5124u;
        if (i11 == 0) {
            com.bumptech.glide.c.c0(obj);
            EnumC0329s[] enumC0329sArr2 = this.f5125v;
            length = enumC0329sArr2.length;
            i7 = 0;
            c0 c0Var2 = this.f5126w;
            m10 = this.f5127x;
            enumC0329sArr = enumC0329sArr2;
            i10 = 0;
            c0Var = c0Var2;
            if (i7 >= length) {
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.f5123f;
            i7 = this.f5122e;
            int i12 = this.f5121d;
            m10 = this.f5120c;
            c0Var = this.f5119b;
            enumC0329sArr = this.f5118a;
            com.bumptech.glide.c.c0(obj);
            i10 = i12;
            i7++;
            if (i7 >= length) {
                int i13 = i10 + 1;
                int ordinal = enumC0329sArr[i7].ordinal();
                if (ordinal == 0) {
                    i10 = i13;
                    i7++;
                    if (i7 >= length) {
                        return Db.q.f3365a;
                    }
                } else {
                    if (ordinal == 1) {
                        this.f5118a = enumC0329sArr;
                        this.f5119b = c0Var;
                        this.f5120c = m10;
                        this.f5121d = i13;
                        this.f5122e = i7;
                        this.f5123f = length;
                        this.f5124u = 1;
                        if (c0.c(c0Var, m10, i10, this) == aVar) {
                            return aVar;
                        }
                        i12 = i13;
                    } else {
                        if (ordinal != 2) {
                            throw new Db.d(1);
                        }
                        this.f5118a = enumC0329sArr;
                        this.f5119b = c0Var;
                        this.f5120c = m10;
                        this.f5121d = i13;
                        this.f5122e = i7;
                        this.f5123f = length;
                        this.f5124u = 2;
                        if (c0.d(c0Var, m10, i10, this) == aVar) {
                            return aVar;
                        }
                        i12 = i13;
                    }
                    i10 = i12;
                    i7++;
                    if (i7 >= length) {
                    }
                }
            }
        }
    }
}
