package J8;

/* loaded from: classes.dex */
public class a0 extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        try {
            return Integer.valueOf(aVar.b0());
        } catch (NumberFormatException e2) {
            throw new Db.d(4, e2);
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.W();
        } else {
            bVar.c0(r4.intValue());
        }
    }
}
