package Z9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import sb.C2010d;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f12317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f12320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2010d f12322f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f12323u;

    public /* synthetic */ w(B b2, String str, ArrayList arrayList, AtomicInteger atomicInteger, ArrayList arrayList2, C2010d c2010d, boolean z8) {
        this.f12317a = b2;
        this.f12318b = str;
        this.f12319c = arrayList;
        this.f12320d = atomicInteger;
        this.f12321e = arrayList2;
        this.f12322f = c2010d;
        this.f12323u = z8;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.l.e(it, "it");
        B b2 = this.f12317a;
        b2.f12224c.e(this.f12318b, it);
        ArrayList arrayList = this.f12319c;
        arrayList.addAll(it);
        if (this.f12320d.incrementAndGet() == this.f12321e.size()) {
            C2010d c2010d = this.f12322f;
            if (!c2010d.g()) {
                c2010d.d(arrayList);
                if (this.f12323u) {
                    b2.f12224c.f14463b.edit().putLong("version_need_refresh".concat("_refresh_version"), b2.f12225d.f("version_need_refresh")).apply();
                }
                c2010d.a();
            }
        }
        return Db.q.f3365a;
    }
}
