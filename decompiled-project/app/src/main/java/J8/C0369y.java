package J8;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: J8.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369y extends G8.z {

    /* renamed from: a, reason: collision with root package name */
    public final G8.m f5737a;

    /* renamed from: b, reason: collision with root package name */
    public final G8.z f5738b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f5739c;

    public C0369y(G8.m mVar, G8.z zVar, Type type) {
        this.f5737a = mVar;
        this.f5738b = zVar;
        this.f5739c = type;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        return this.f5738b.b(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if ((r1 instanceof J8.AbstractC0363s) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // G8.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(O8.b bVar, Object obj) {
        G8.z d10;
        ?? r02 = this.f5739c;
        Class<?> cls = (obj == null || !((r02 instanceof Class) || (r02 instanceof TypeVariable))) ? r02 : obj.getClass();
        G8.z zVar = this.f5738b;
        if (cls != r02) {
            G8.z d11 = this.f5737a.d(new N8.a(cls));
            if (d11 instanceof AbstractC0363s) {
                G8.z zVar2 = zVar;
                while ((zVar2 instanceof AbstractC0368x) && (d10 = ((AbstractC0368x) zVar2).d()) != zVar2) {
                    zVar2 = d10;
                }
            }
            zVar = d11;
        }
        zVar.c(bVar, obj);
    }
}
