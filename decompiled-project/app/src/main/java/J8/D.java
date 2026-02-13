package J8;

/* loaded from: classes.dex */
public class D extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        String h02 = aVar.h0();
        if (h02.length() == 1) {
            return Character.valueOf(h02.charAt(0));
        }
        StringBuilder n6 = X.c.n("Expecting character, got: ", h02, "; at ");
        n6.append(aVar.V(true));
        throw new Db.d(n6.toString(), 4);
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        Character ch = (Character) obj;
        bVar.e0(ch == null ? null : String.valueOf(ch));
    }
}
