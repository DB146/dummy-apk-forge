package T4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f9237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9238b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9239c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9240d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9241e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9242f;

    public a(long j, int i7, ArrayList arrayList, List list, List list2, List list3) {
        this.f9237a = j;
        this.f9238b = i7;
        this.f9239c = Collections.unmodifiableList(arrayList);
        this.f9240d = Collections.unmodifiableList(list);
        this.f9241e = Collections.unmodifiableList(list2);
        this.f9242f = Collections.unmodifiableList(list3);
    }
}
