package J8;

/* renamed from: J8.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0354i implements G8.A {
    @Override // G8.A
    public final G8.z a(G8.m mVar, N8.a aVar) {
        Class cls = aVar.f7386a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new C0355j(cls);
    }
}
