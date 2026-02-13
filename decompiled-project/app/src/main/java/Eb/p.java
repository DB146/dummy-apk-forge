package Eb;

import java.util.Collection;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class p extends u0 {
    public static int S(Iterable iterable, int i7) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
