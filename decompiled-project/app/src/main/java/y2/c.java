package y2;

import A9.N2;
import Db.j;
import Db.o;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l2.C1481z;
import l2.EnumC1474s;
import l2.Q;
import l2.U;
import v2.C2133e;
import v2.C2138j;
import v2.q;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C2133e f26748a;

    /* renamed from: b, reason: collision with root package name */
    public final q f26749b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f26750c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC1474s f26751d;

    /* renamed from: e, reason: collision with root package name */
    public final C2138j f26752e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26753f;
    public final Bundle g;

    /* renamed from: h, reason: collision with root package name */
    public final q3.c f26754h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26755i;
    public final C1481z j;
    public EnumC1474s k;

    /* renamed from: l, reason: collision with root package name */
    public final U f26756l;

    /* renamed from: m, reason: collision with root package name */
    public final o f26757m;

    public c(C2133e entry) {
        l.e(entry, "entry");
        this.f26748a = entry;
        this.f26749b = entry.f24967b;
        this.f26750c = entry.f24968c;
        this.f26751d = entry.f24969d;
        this.f26752e = entry.f24970e;
        this.f26753f = entry.f24971f;
        this.g = entry.f24972u;
        this.f26754h = new q3.c(new S2.b(entry, new N2(entry, 15)));
        o z8 = android.support.v4.media.session.b.z(new wa.f(7));
        this.j = new C1481z(entry);
        this.k = EnumC1474s.f19228b;
        this.f26756l = (U) z8.getValue();
        this.f26757m = android.support.v4.media.session.b.z(new wa.f(8));
    }

    public final Bundle a() {
        Bundle bundle = this.f26750c;
        if (bundle == null) {
            return null;
        }
        Bundle f4 = com.bumptech.glide.c.f((j[]) Arrays.copyOf(new j[0], 0));
        f4.putAll(bundle);
        return f4;
    }

    public final void b() {
        if (!this.f26755i) {
            q3.c cVar = this.f26754h;
            cVar.v();
            this.f26755i = true;
            if (this.f26752e != null) {
                Q.c(this.f26748a);
            }
            cVar.w(this.g);
        }
        int ordinal = this.f26751d.ordinal();
        int ordinal2 = this.k.ordinal();
        C1481z c1481z = this.j;
        if (ordinal < ordinal2) {
            c1481z.g(this.f26751d);
        } else {
            c1481z.g(this.k);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(w.a(this.f26748a.getClass()).c());
        sb2.append("(" + this.f26753f + ')');
        sb2.append(" destination=");
        sb2.append(this.f26749b);
        String sb3 = sb2.toString();
        l.d(sb3, "toString(...)");
        return sb3;
    }
}
