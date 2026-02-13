package C3;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2594a;

    public q(ArrayList arrayList) {
        this.f2594a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2594a.iterator();
    }
}
