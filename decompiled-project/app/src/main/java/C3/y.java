package C3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Q7.h f2641a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2642b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2643c;

    public y(Class cls, Class cls2, Class cls3, List list, Q7.h hVar) {
        this.f2641a = hVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f2642b = list;
        this.f2643c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final A a(int i7, int i10, A3.l lVar, com.bumptech.glide.load.data.g gVar, q3.l lVar2) {
        Q7.h hVar = this.f2641a;
        List list = (List) hVar.h();
        try {
            List list2 = this.f2642b;
            int size = list2.size();
            A a9 = null;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    a9 = ((l) list2.get(i11)).a(i7, i10, lVar, gVar, lVar2);
                } catch (v e2) {
                    list.add(e2);
                }
                if (a9 != null) {
                    break;
                }
            }
            if (a9 != null) {
                return a9;
            }
            throw new v(this.f2643c, new ArrayList(list));
        } finally {
            hVar.M(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f2642b.toArray()) + '}';
    }
}
