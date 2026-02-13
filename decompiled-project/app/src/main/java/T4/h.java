package T4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f9276a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9277b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9278c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9279d;

    public h(String str, long j, ArrayList arrayList, List list) {
        this.f9276a = str;
        this.f9277b = j;
        this.f9278c = Collections.unmodifiableList(arrayList);
        this.f9279d = Collections.unmodifiableList(list);
    }
}
