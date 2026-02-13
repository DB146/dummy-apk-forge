package J8;

/* loaded from: classes.dex */
public class X extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() != 9) {
            return Boolean.valueOf(aVar.h0());
        }
        aVar.f0();
        return null;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        bVar.e0(bool == null ? "null" : bool.toString());
    }
}
