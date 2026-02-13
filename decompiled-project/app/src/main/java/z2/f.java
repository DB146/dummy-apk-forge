package z2;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import u.C2052e;
import u.T;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final c f28205e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28206a;

    /* renamed from: d, reason: collision with root package name */
    public final e f28209d;

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f28208c = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    public final C2052e f28207b = new T(0);

    /* JADX WARN: Type inference failed for: r7v2, types: [u.T, u.e] */
    public f(ArrayList arrayList, ArrayList arrayList2) {
        this.f28206a = arrayList;
        int size = arrayList.size();
        int i7 = Integer.MIN_VALUE;
        e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = (e) arrayList.get(i10);
            int i11 = eVar2.f28201e;
            if (i11 > i7) {
                eVar = eVar2;
                i7 = i11;
            }
        }
        this.f28209d = eVar;
    }
}
