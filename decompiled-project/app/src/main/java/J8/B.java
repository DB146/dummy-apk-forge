package J8;

/* loaded from: classes.dex */
public class B extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() != 9) {
            return Float.valueOf((float) aVar.a0());
        }
        aVar.f0();
        return null;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.W();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        bVar.d0(number);
    }
}
