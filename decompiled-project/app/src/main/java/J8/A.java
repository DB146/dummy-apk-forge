package J8;

/* loaded from: classes.dex */
public class A extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        try {
            return Long.valueOf(aVar.c0());
        } catch (NumberFormatException e2) {
            throw new Db.d(4, e2);
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.W();
        } else {
            bVar.c0(number.longValue());
        }
    }
}
