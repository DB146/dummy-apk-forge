package J8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: J8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0346a implements G8.A {
    @Override // G8.A
    public final G8.z a(G8.m mVar, N8.a aVar) {
        Type type = aVar.f7387b;
        boolean z8 = type instanceof GenericArrayType;
        if (!z8 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z8 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C0347b(mVar, mVar.d(new N8.a(genericComponentType)), I8.h.h(genericComponentType));
    }
}
