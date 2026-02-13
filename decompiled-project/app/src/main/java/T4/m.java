package T4;

import N6.H;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.L;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final L f9292a;

    /* renamed from: b, reason: collision with root package name */
    public final H f9293b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9294c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9295d;

    /* renamed from: e, reason: collision with root package name */
    public final j f9296e;

    public m(L l10, H h10, s sVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        AbstractC1705a.h(!h10.isEmpty());
        this.f9292a = l10;
        this.f9293b = H.F(h10);
        this.f9295d = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f9296e = sVar.a(this);
        this.f9294c = D.T(sVar.f9309c, 1000000L, sVar.f9308b);
    }

    public abstract String a();

    public abstract S4.i d();

    public abstract j e();
}
