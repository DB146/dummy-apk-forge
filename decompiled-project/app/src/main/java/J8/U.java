package J8;

import java.util.BitSet;

/* loaded from: classes.dex */
public class U extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        boolean z8;
        BitSet bitSet = new BitSet();
        aVar.l();
        int j02 = aVar.j0();
        int i7 = 0;
        while (j02 != 2) {
            int b2 = P.c.b(j02);
            if (b2 == 5 || b2 == 6) {
                int b02 = aVar.b0();
                if (b02 == 0) {
                    z8 = false;
                } else {
                    if (b02 != 1) {
                        StringBuilder r10 = h3.o.r(b02, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        r10.append(aVar.V(true));
                        throw new Db.d(r10.toString(), 4);
                    }
                    z8 = true;
                }
            } else {
                if (b2 != 7) {
                    throw new Db.d("Invalid bitset value type: " + A3.c.t(j02) + "; at path " + aVar.V(false), 4);
                }
                z8 = aVar.Z();
            }
            if (z8) {
                bitSet.set(i7);
            }
            i7++;
            j02 = aVar.j0();
        }
        aVar.P();
        return bitSet;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.n();
        int length = bitSet.length();
        for (int i7 = 0; i7 < length; i7++) {
            bVar.c0(bitSet.get(i7) ? 1L : 0L);
        }
        bVar.P();
    }
}
