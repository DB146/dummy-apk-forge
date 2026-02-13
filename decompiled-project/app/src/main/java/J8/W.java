package J8;

/* loaded from: classes.dex */
public class W extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        int j02 = aVar.j0();
        if (j02 != 9) {
            return j02 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.h0())) : Boolean.valueOf(aVar.Z());
        }
        aVar.f0();
        return null;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            bVar.W();
            return;
        }
        bVar.g0();
        bVar.l();
        bVar.f7521a.write(bool.booleanValue() ? "true" : "false");
    }
}
