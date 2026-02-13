package Mc;

import A9.C0096i1;
import A9.C0098j;
import A9.C0107l0;
import A9.C0139t1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final e f6935d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static volatile a f6936e;

    /* renamed from: a, reason: collision with root package name */
    public final C0107l0 f6937a = new C0107l0(5);

    /* renamed from: b, reason: collision with root package name */
    public final C0107l0 f6938b = new C0107l0(4);

    /* renamed from: c, reason: collision with root package name */
    public final C0107l0 f6939c = new C0107l0(6);

    public a() {
        f6936e = this;
    }

    public final C0139t1 a(String str, List ads) {
        l.e(ads, "ads");
        C0096i1 c0096i1 = new C0096i1(str, 0L);
        C0098j c0098j = new C0098j(this.f6937a);
        Iterator it = ads.iterator();
        while (it.hasNext()) {
            c0098j.g((Jc.a) it.next());
        }
        return new C0139t1(c0096i1, c0098j);
    }
}
