package w2;

import Q.C0487e0;
import Q.R0;
import cc.E;
import java.util.Iterator;
import java.util.List;
import u.C2040C;
import v2.C2133e;
import x.i0;

/* loaded from: classes.dex */
public final class C extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f25668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2.u f25669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2040C f25670c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R0 f25671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f25672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(i0 i0Var, v2.u uVar, C2040C c2040c, R0 r02, i iVar, Hb.d dVar) {
        super(2, dVar);
        this.f25668a = i0Var;
        this.f25669b = uVar;
        this.f25670c = c2040c;
        this.f25671d = r02;
        this.f25672e = iVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C(this.f25668a, this.f25669b, this.f25670c, this.f25671d, this.f25672e, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C c10 = (C) create((E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        c10.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        int i7;
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        i0 i0Var = this.f25668a;
        Object l10 = i0Var.f26099a.l();
        C0487e0 c0487e0 = i0Var.f26102d;
        if (kotlin.jvm.internal.l.a(l10, c0487e0.getValue())) {
            v2.u uVar = this.f25669b;
            if (((C2133e) uVar.f25026b.f26770f.D()) == null || kotlin.jvm.internal.l.a(c0487e0.getValue(), (C2133e) uVar.f25026b.f26770f.D())) {
                Iterator it = ((List) this.f25671d.getValue()).iterator();
                while (it.hasNext()) {
                    this.f25672e.b().c((C2133e) it.next());
                }
                C2040C c2040c = this.f25670c;
                long[] jArr = c2040c.f24572a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j & 255) < 128) {
                                    int i14 = (i10 << 3) + i13;
                                    Object obj2 = c2040c.f24573b[i14];
                                    float f4 = c2040c.f24574c[i14];
                                    if (!kotlin.jvm.internal.l.a((String) obj2, ((C2133e) c0487e0.getValue()).f24971f)) {
                                        c2040c.f24576e--;
                                        long[] jArr2 = c2040c.f24572a;
                                        int i15 = c2040c.f24575d;
                                        int i16 = i14 >> 3;
                                        int i17 = (i14 & 7) << 3;
                                        long j10 = (jArr2[i16] & (~(255 << i17))) | (254 << i17);
                                        jArr2[i16] = j10;
                                        jArr2[(((i14 - 7) & i15) + (i15 & 7)) >> 3] = j10;
                                        c2040c.f24573b[i14] = null;
                                    }
                                    i7 = 8;
                                } else {
                                    i7 = i11;
                                }
                                j >>= i7;
                                i13++;
                                i11 = i7;
                            }
                            if (i12 != i11) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return Db.q.f3365a;
    }
}
