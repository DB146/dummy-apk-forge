package J8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: J8.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349d implements G8.A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5666a;

    /* renamed from: b, reason: collision with root package name */
    public final q3.e f5667b;

    public /* synthetic */ C0349d(q3.e eVar, int i7) {
        this.f5666a = i7;
        this.f5667b = eVar;
    }

    @Override // G8.A
    public final G8.z a(G8.m mVar, N8.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        q3.e eVar = this.f5667b;
        cls = Object.class;
        switch (this.f5666a) {
            case 0:
                Class cls2 = aVar.f7386a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = aVar.f7387b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                I8.h.b(Collection.class.isAssignableFrom(cls2));
                Type j = I8.h.j(type, cls2, I8.h.g(type, cls2, Collection.class), new HashMap());
                cls = j instanceof ParameterizedType ? ((ParameterizedType) j).getActualTypeArguments()[0] : Object.class;
                return new C0348c(new C0369y(mVar, mVar.d(new N8.a(cls)), cls), eVar.l(aVar, false));
            default:
                Class cls3 = aVar.f7386a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type type2 = aVar.f7387b;
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    I8.h.b(Map.class.isAssignableFrom(cls3));
                    Type j10 = I8.h.j(type2, cls3, I8.h.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = j10 instanceof ParameterizedType ? ((ParameterizedType) j10).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new C0359n(this, new C0369y(mVar, (type3 == Boolean.TYPE || type3 == Boolean.class) ? d0.f5672c : mVar.d(new N8.a(type3)), type3), new C0369y(mVar, mVar.d(new N8.a(type4)), type4), eVar.l(aVar, false));
        }
    }
}
