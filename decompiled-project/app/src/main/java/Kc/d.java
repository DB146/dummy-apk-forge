package Kc;

import A9.N2;
import D5.i;
import Db.o;
import android.content.Context;
import gb.p;
import java.util.List;
import kotlin.jvm.internal.l;
import tb.e;
import tss.r.core.ads.database.AdsDatabase;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final b f6225e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static volatile d f6226f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6227a;

    /* renamed from: b, reason: collision with root package name */
    public final o f6228b;

    /* renamed from: c, reason: collision with root package name */
    public final o f6229c;

    /* renamed from: d, reason: collision with root package name */
    public long f6230d;

    public d(Context context) {
        l.e(context, "context");
        this.f6227a = context;
        this.f6228b = android.support.v4.media.session.b.z(new I9.a(9));
        this.f6229c = android.support.v4.media.session.b.z(new N2(this, 11));
    }

    public final e a(int i7) {
        p<List<Jc.a>> a9 = ((Dc.a) this.f6228b.getValue()).a(i7);
        i iVar = new i(this, 20);
        a9.getClass();
        return new e(a9, iVar, 0);
    }

    public final p b(int i7) {
        Hc.b x2 = ((AdsDatabase) this.f6229c.getValue()).x();
        x2.getClass();
        return new e(new e(android.support.v4.media.session.b.k(x2.f4923a, false, new Ba.i(1)), new c(this, i7, 1), 0), new c(this, i7, 2), 2);
    }
}
