package Eb;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class r extends q {
    public static void T(List list, Comparator comparator) {
        kotlin.jvm.internal.l.e(list, "<this>");
        kotlin.jvm.internal.l.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
