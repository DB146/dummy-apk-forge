package zc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class d extends p {

    /* renamed from: e, reason: collision with root package name */
    public boolean f28374e;

    /* renamed from: c, reason: collision with root package name */
    public int f28372c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f28373d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28370a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28371b = new ArrayList();

    @Override // zc.p
    public final int a() {
        return this.f28373d;
    }

    @Override // zc.p
    public final void e() {
        Iterator it = this.f28370a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).e();
        }
    }

    @Override // zc.p
    public final boolean f() {
        return this.f28374e;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.function.ToIntFunction, java.lang.Object] */
    public final void g() {
        ArrayList arrayList = this.f28370a;
        this.f28372c = arrayList.size();
        this.f28373d = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            this.f28373d = pVar.a() + this.f28373d;
        }
        ArrayList arrayList2 = this.f28371b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList2.sort(Comparator.comparingInt(new Object()));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((p) it2.next()).f()) {
                this.f28374e = true;
                return;
            }
        }
    }
}
