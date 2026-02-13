package J8;

/* loaded from: classes.dex */
public class Z extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        try {
            int b02 = aVar.b0();
            if (b02 <= 65535 && b02 >= -32768) {
                return Short.valueOf((short) b02);
            }
            StringBuilder r10 = h3.o.r(b02, "Lossy conversion from ", " to short; at path ");
            r10.append(aVar.V(true));
            throw new Db.d(r10.toString(), 4);
        } catch (NumberFormatException e2) {
            throw new Db.d(4, e2);
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.W();
        } else {
            bVar.c0(r4.shortValue());
        }
    }
}
