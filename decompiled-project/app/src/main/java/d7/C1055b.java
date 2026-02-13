package d7;

import N6.L;
import P4.C0463k;
import Y5.D0;
import Y5.F0;
import android.os.Bundle;
import ha.g;
import java.util.HashSet;
import java.util.Objects;
import q3.l;

/* renamed from: d7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055b implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16548a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16549b;

    public C1055b(C0463k c0463k) {
        Objects.requireNonNull(c0463k);
        this.f16549b = c0463k;
    }

    public C1055b(l lVar) {
        Objects.requireNonNull(lVar);
        this.f16549b = lVar;
    }

    @Override // Y5.F0
    public final void a(String str, String str2, Bundle bundle, long j) {
        Object obj = this.f16549b;
        switch (this.f16548a) {
            case 0:
                l lVar = (l) obj;
                if (((HashSet) lVar.f23391b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    L l10 = AbstractC1054a.f16542a;
                    String g = D0.g(str2, D0.f11237c, D0.f11235a);
                    if (g != null) {
                        str2 = g;
                    }
                    bundle2.putString("events", str2);
                    ((g) lVar.f23392c).n(2, bundle2);
                    return;
                }
                return;
            default:
                if (str == null || AbstractC1054a.f16542a.contains(str2)) {
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("name", str2);
                bundle3.putLong("timestampInMillis", j);
                bundle3.putBundle("params", bundle);
                ((g) ((C0463k) obj).f8074b).n(3, bundle3);
                return;
        }
    }
}
