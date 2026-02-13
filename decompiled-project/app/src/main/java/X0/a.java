package X0;

import K0.l;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public static String a(String str, int i7, List list) {
        l lVar = l.f5904b;
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        if ((i7 & 32) != 0) {
            lVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            if (lVar != null) {
                sb2.append((CharSequence) lVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
