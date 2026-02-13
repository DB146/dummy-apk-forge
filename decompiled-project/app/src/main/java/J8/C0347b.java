package J8;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: J8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347b extends G8.z {

    /* renamed from: c, reason: collision with root package name */
    public static final C0346a f5660c = new C0346a();

    /* renamed from: a, reason: collision with root package name */
    public final Class f5661a;

    /* renamed from: b, reason: collision with root package name */
    public final C0369y f5662b;

    public C0347b(G8.m mVar, G8.z zVar, Class cls) {
        this.f5662b = new C0369y(mVar, zVar, cls);
        this.f5661a = cls;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.l();
        while (aVar.W()) {
            arrayList.add(this.f5662b.f5738b.b(aVar));
        }
        aVar.P();
        int size = arrayList.size();
        Class cls = this.f5661a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i7 = 0; i7 < size; i7++) {
            Array.set(newInstance, i7, arrayList.get(i7));
        }
        return newInstance;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        if (obj == null) {
            bVar.W();
            return;
        }
        bVar.n();
        int length = Array.getLength(obj);
        for (int i7 = 0; i7 < length; i7++) {
            this.f5662b.c(bVar, Array.get(obj, i7));
        }
        bVar.P();
    }
}
