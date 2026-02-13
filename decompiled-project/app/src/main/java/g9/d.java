package g9;

import B0.AbstractC0169c;

/* loaded from: classes2.dex */
public abstract class d extends AbstractC0169c {
    public final void o(int i7, StringBuilder sb2) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        p(sb2, i7, length);
    }

    public final void p(StringBuilder sb2, int i7, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            int v10 = Q7.h.v((i11 * 10) + i7, 10, (V8.a) ((Q7.h) this.f1862b).f8695b);
            if (v10 / 100 == 0) {
                sb2.append('0');
            }
            if (v10 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(v10);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 13; i13++) {
            int charAt = sb2.charAt(i13 + i10) - '0';
            if ((i13 & 1) == 0) {
                charAt *= 3;
            }
            i12 += charAt;
        }
        int i14 = 10 - (i12 % 10);
        sb2.append(i14 != 10 ? i14 : 0);
    }
}
