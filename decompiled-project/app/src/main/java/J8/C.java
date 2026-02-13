package J8;

/* loaded from: classes.dex */
public class C extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() != 9) {
            return Double.valueOf(aVar.a0());
        }
        aVar.f0();
        return null;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.W();
        } else {
            bVar.b0(number.doubleValue());
        }
    }
}
