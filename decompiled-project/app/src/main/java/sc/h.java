package sc;

import Db.q;
import java.io.IOException;
import kotlin.jvm.internal.v;
import rc.C;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24386a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f24387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f24388c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f24389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f24390e;

    public /* synthetic */ h(v vVar, C c10, v vVar2, v vVar3) {
        this.f24387b = vVar;
        this.f24388c = c10;
        this.f24389d = vVar2;
        this.f24390e = vVar3;
    }

    public /* synthetic */ h(C c10, v vVar, v vVar2, v vVar3) {
        this.f24388c = c10;
        this.f24387b = vVar;
        this.f24389d = vVar2;
        this.f24390e = vVar3;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f24386a;
        int intValue = ((Integer) obj).intValue();
        Long l10 = (Long) obj2;
        switch (i7) {
            case 0:
                long longValue = l10.longValue();
                if (intValue == 21589) {
                    if (longValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    C c10 = this.f24388c;
                    byte F10 = c10.F();
                    boolean z8 = (F10 & 1) == 1;
                    boolean z10 = (F10 & 2) == 2;
                    boolean z11 = (F10 & 4) == 4;
                    long j = z8 ? 5L : 1L;
                    if (z10) {
                        j += 4;
                    }
                    if (z11) {
                        j += 4;
                    }
                    if (longValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z8) {
                        this.f24387b.f19134a = Integer.valueOf(c10.T());
                    }
                    if (z10) {
                        this.f24389d.f19134a = Integer.valueOf(c10.T());
                    }
                    if (z11) {
                        this.f24390e.f19134a = Integer.valueOf(c10.T());
                    }
                }
                return q.f3365a;
            default:
                long longValue2 = l10.longValue();
                if (intValue == 1) {
                    v vVar = this.f24387b;
                    if (vVar.f19134a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (longValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    C c11 = this.f24388c;
                    vVar.f19134a = Long.valueOf(c11.U());
                    this.f24389d.f19134a = Long.valueOf(c11.U());
                    this.f24390e.f19134a = Long.valueOf(c11.U());
                }
                return q.f3365a;
        }
    }
}
